package com.qq.worldwind.android.layer;

import gov.nasa.worldwind.Factory;
import gov.nasa.worldwind.WorldWind;
import gov.nasa.worldwind.avlist.AVKey;
import gov.nasa.worldwind.avlist.AVList;
import gov.nasa.worldwind.avlist.AVListImpl;
import gov.nasa.worldwind.layers.Layer;
import gov.nasa.worldwind.layers.StarsLayer;
import gov.nasa.worldwind.ogc.wms.WMSCapabilities;
import gov.nasa.worldwind.ogc.wms.WMSLayerCapabilities;
import gov.nasa.worldwind.ogc.wms.WMSLayerStyle;
import gov.nasa.worldwind.util.WWUtil;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ProgressBar;

import com.qq.worldwind.android.R;

public class WMSLayerType implements ILayerType {
	
	private static final String DEFAULT_WMS_URL = "http://neowms.sci.gsfc.nasa.gov/wms/wms";

	private View expandedView;
	protected final TreeSet<LayerInfo> layerInfos = new TreeSet<LayerInfo>(new Comparator<LayerInfo>() {
		public int compare(LayerInfo infoA, LayerInfo infoB) {
			String nameA = infoA.getName();
			String nameB = infoB.getName();
			return nameA.compareTo(nameB);
		}
	});

	@Override
	public String getCategory() {
		return "WMS";
	}

	@Override
	public Collection<Layer> createLayers() {
		ArrayList<Layer> retval = new ArrayList<Layer>();
		final ListView layerInfoView = (ListView) expandedView.findViewById(R.id.layerInfoList);
		LayerInfo [] infos = ((LayerInfoAdapter)layerInfoView.getAdapter()).getLayerInfos();
		for (LayerInfo info : infos){
			if (info.selected){
				Layer layer = createLayer(info.caps, info.params);
				retval.add(layer);
			}
		}
		return retval;
	}

	private Layer createLayer(WMSCapabilities caps, AVListImpl params) {
		AVList configParams = params.copy(); // Copy to insulate changes from the caller.

        // Some wms servers are slow, so increase the timeouts and limits used by world wind's retrievers.
        configParams.setValue(AVKey.URL_CONNECT_TIMEOUT, 30000);
        configParams.setValue(AVKey.URL_READ_TIMEOUT, 30000);
        configParams.setValue(AVKey.RETRIEVAL_QUEUE_STALE_REQUEST_LIMIT, 60000);

        try
        {
            String factoryKey = AVKey.LAYER_FACTORY;
            Factory factory = (Factory) WorldWind.createConfigurationComponent(factoryKey);
            return (Layer) factory.createFromConfigSource(caps, params);
        }
        catch (Exception e)
        {
            // Ignore the exception, and just return null.
        }

        return null;
	}

	@Override
	public View getExpandedView(Activity context) {
		if (expandedView == null) {
			expandedView = context.getLayoutInflater().inflate(R.layout.addwmslayer, null);
			initWMSView(context);
		}
		EditText wmsURL = (EditText) expandedView.findViewById(R.id.wmsURL);
		wmsURL.selectAll();
		return expandedView;
	}

	private void initWMSView(final Activity context) {
		EditText wmsURL = (EditText) expandedView.findViewById(R.id.wmsURL);
		wmsURL.setText(DEFAULT_WMS_URL);
		final Button downloadButton = (Button) expandedView.findViewById(R.id.downloadCapabilitesButton);
		downloadButton.setOnClickListener(new View.OnClickListener() {

			private Thread downloadThread;

			@Override
			public void onClick(View v) {
				if (downloadThread == null) {
					downloadButton.setEnabled(false);
					downloadThread = new Thread(new Runnable() {

						@Override
						public void run() {
							downloadCapabilities();
							downloadThread = null;
							context.runOnUiThread(new Runnable(){

								@Override
								public void run() {
									updateLayerInfoList(context);
									downloadButton.setEnabled(true);
								}});
						}
					});
					downloadThread.start();
				}
			}
		});
	}

	private void updateLayerInfoList(Activity context) {
		ListView layerInfoView = (ListView) expandedView.findViewById(R.id.layerInfoList);
		layerInfoView.setAdapter(new LayerInfoAdapter(context, layerInfos.toArray(new LayerInfo[layerInfos.size()])));
	}

	private void downloadCapabilities() {
		try {
			layerInfos.clear();
			EditText wmsURL = (EditText) expandedView.findViewById(R.id.wmsURL);
			URI serverURI = new URI(wmsURL.getText().toString().trim());
			WMSCapabilities caps = WMSCapabilities.retrieve(serverURI);
			caps.parse();
			final List<WMSLayerCapabilities> namedLayerCaps = caps.getNamedLayers();
			if (namedLayerCaps == null)
				return;
			for (WMSLayerCapabilities lc : namedLayerCaps) {
				Set<WMSLayerStyle> styles = lc.getStyles();
				if (styles == null || styles.size() == 0) {
					LayerInfo layerInfo = createLayerInfo(caps, lc, null);
					layerInfos.add(layerInfo);
				} else {
					for (WMSLayerStyle style : styles) {
						LayerInfo layerInfo = createLayerInfo(caps, lc, style);
						layerInfos.add(layerInfo);
					}
				}
			}
		} catch (Throwable t) {
			t.printStackTrace();
		}
	}

	protected LayerInfo createLayerInfo(WMSCapabilities caps, WMSLayerCapabilities layerCaps, WMSLayerStyle style) {
		// Create the layer info specified by the layer's capabilities entry and
		// the selected style.

		LayerInfo linfo = new LayerInfo();
		linfo.caps = caps;
		linfo.params = new AVListImpl();
		linfo.params.setValue(AVKey.LAYER_NAMES, layerCaps.getName());
		if (style != null)
			linfo.params.setValue(AVKey.STYLE_NAMES, style.getName());
		String abs = layerCaps.getLayerAbstract();
		if (!WWUtil.isEmpty(abs))
			linfo.params.setValue(AVKey.LAYER_ABSTRACT, abs);

		linfo.params.setValue(AVKey.DISPLAY_NAME, makeTitle(caps, linfo));

		return linfo;
	}

	protected static String makeTitle(WMSCapabilities caps, LayerInfo layerInfo) {
		String layerNames = layerInfo.params.getStringValue(AVKey.LAYER_NAMES);
		String styleNames = layerInfo.params.getStringValue(AVKey.STYLE_NAMES);
		String[] lNames = layerNames.split(",");
		String[] sNames = styleNames != null ? styleNames.split(",") : null;

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < lNames.length; i++) {
			if (sb.length() > 0)
				sb.append(", ");

			String layerName = lNames[i];
			WMSLayerCapabilities lc = caps.getLayerByName(layerName);
			String layerTitle = lc.getTitle();
			sb.append(layerTitle != null ? layerTitle : layerName);

			if (sNames == null || sNames.length <= i)
				continue;

			String styleName = sNames[i];
			WMSLayerStyle style = lc.getStyleByName(styleName);
			if (style == null)
				continue;

			sb.append(" : ");
			String styleTitle = style.getTitle();
			sb.append(styleTitle != null ? styleTitle : styleName);
		}

		return sb.toString();
	}

	protected static class LayerInfo {
		protected WMSCapabilities caps;
		protected AVListImpl params = new AVListImpl();
		protected boolean selected = false;

		protected String getTitle() {
			return params.getStringValue(AVKey.DISPLAY_NAME);
		}

		protected String getName() {
			return params.getStringValue(AVKey.LAYER_NAMES);
		}

		protected String getAbstract() {
			return params.getStringValue(AVKey.LAYER_ABSTRACT);
		}
	}

	private class LayerInfoAdapter extends ArrayAdapter<LayerInfo> {

		private final LayerInfo[] types;

		public LayerInfoAdapter(Activity context, LayerInfo[] types) {
			super(context, R.id.layerInfoList, types);
			this.types = types;
		}
		
		public LayerInfo[] getLayerInfos(){
			return types;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			final LayerInfo layerType = types[position];
			View retval = convertView;
			if (retval == null) {
				retval = new CheckBox(getContext());
			}
			((CheckBox) retval).setText(layerType.getTitle());
			((CheckBox) retval).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

				@Override
				public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
					layerType.selected = buttonView.isChecked();
				}
			});
			((CheckBox) retval).setChecked(layerType.selected);
			return retval;
		}
	}

}
