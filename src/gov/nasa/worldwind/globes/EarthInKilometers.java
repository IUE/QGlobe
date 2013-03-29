package gov.nasa.worldwind.globes;

import java.util.List;

import gov.nasa.worldwind.avlist.AVKey;
import gov.nasa.worldwind.geom.Angle;
import gov.nasa.worldwind.geom.LatLon;
import gov.nasa.worldwind.geom.Sector;
import gov.nasa.worldwind.util.Logging;

public class EarthInKilometers extends EllipsoidalGlobe {
	public static final double WGS84_EQUATORIAL_RADIUS = 6378.1370; // ellipsoid equatorial getRadius, in meters
    public static final double WGS84_POLAR_RADIUS = 6356.7523; // ellipsoid polar getRadius, in meters
    public static final double WGS84_ES = 0.00669437999013; // eccentricity squared, semi-major axis

    public static final double ELEVATION_MIN = -11.000d; // Depth of Marianas trench
    public static final double ELEVATION_MAX = 8.500d; // Height of Mt. Everest.

	public EarthInKilometers() {
		super(WGS84_EQUATORIAL_RADIUS, WGS84_POLAR_RADIUS, WGS84_ES, EllipsoidalGlobe.makeElevationModel(AVKey.EARTH_ELEVATION_MODEL_CONFIG_FILE,
				"config/Earth/EarthElevationModelAsBil16.xml"));
	}

	public String toString() {
		return "Earth (km)";
	}

	public double getElevation(Angle latitude, Angle longitude) {
		double elevationInMeters = super.getElevation(latitude, longitude);
		return elevationInMeters / 1000.0;
	}

	public double getElevations(Sector sector, List<? extends LatLon> latlons, double targetResolution, double[] elevations) {
		double retval = super.getElevations(sector, latlons, targetResolution, elevations);
		for (int i = 0; i < elevations.length; i++) {
			elevations[i] = elevations[i] / 1000.0;
		}
		return retval;
	}
	
	public double getMaxElevation()
    {
        return super.getMaxElevation() / 1000.0;
    }

    public double getMinElevation()
    {
        return super.getMinElevation() / 1000.0;
    }
}