package gov.nasa.worldwind.globes;

import gov.nasa.worldwind.BasicFactory;
import gov.nasa.worldwind.avlist.AVList;

public class ZeroElevationModelFactory extends BasicFactory {

	@Override
    public Object createFromConfigSource(Object configSource, AVList params)
    {
        return new ZeroElevationModel();
    }
	
}
