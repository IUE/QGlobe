package gov.nasa.worldwind.globes;

import java.util.List;

import com.qq.java.util.Arrays;

import gov.nasa.worldwind.geom.Angle;
import gov.nasa.worldwind.geom.LatLon;
import gov.nasa.worldwind.geom.Sector;
import gov.nasa.worldwind.terrain.AbstractElevationModel;

public class ZeroElevationModel extends AbstractElevationModel {

	@Override
	public int intersects(Sector sector) {
		return 0;
	}

	@Override
	public boolean contains(Angle latitude, Angle longitude) {
		return true;
	}

	@Override
	public double getMaxElevation() {
		return 8000;
	}

	@Override
	public double getMinElevation() {
		return -11000;
	}

	@Override
	public double[] getExtremeElevations(Angle latitude, Angle longitude) {
		return new double[]{-1000,1000};
	}

	@Override
	public double[] getExtremeElevations(Sector sector) {
		return new double[]{-1000,1000};
	}

	@Override
	public double getBestResolution(Sector sector) {
		return 0.0174532925;
	}

	@Override
	public double getUnmappedElevation(Angle latitude, Angle longitude) {
		return 0;
	}

	@Override
	public double getElevations(Sector sector, List<? extends LatLon> latlons, double targetResolution, double[] buffer) {
		Arrays.fill(buffer, 0);
		return 0.0174532925;
	}

	@Override
	public double getUnmappedElevations(Sector sector, List<? extends LatLon> latlons, double targetResolution, double[] buffer) {
		Arrays.fill(buffer, 0);
		return 0.0174532925;
	}

}
