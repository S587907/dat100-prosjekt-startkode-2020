package no.hvl.dat100ptc.oppgave3;

import static java.lang.Math.*;

import no.hvl.dat100ptc.TODO;
import no.hvl.dat100ptc.oppgave1.GPSPoint;

public class GPSUtils {

	public static double findMax(double[] da) {

		double max; 
		
		max = da[0];
		
		for (double d : da) {
			if (d > max) {
				max = d;
			}
		}
		
		return max;
	}

	public static double findMin(double[] da) {

		double min;

		// TODO - START
		
		min = da[0];
		
		for (double d : da) {
			if (d < min) {
				min = d;
			}
		}
		
		return min;
	//	throw new UnsupportedOperationException(TODO.method());

		// TODO - SLUT

	}

	public static double[] getLatitudes(GPSPoint[] gpspoints) {

		// TODO - START
		double[] latitudes = new double[gpspoints.length];
		int i = 0;
		
		for (GPSPoint g: gpspoints) {
			latitudes[i] = g.getLatitude();
			i++;
		}
		return latitudes;
		//throw new UnsupportedOperationException(TODO.method());
		
		// TODO - SLUTT
	}

	public static double[] getLongitudes(GPSPoint[] gpspoints) {

		// TODO - START
		double[] longitudes = new double[gpspoints.length];
		int i = 0;
		
		for (GPSPoint g: gpspoints) {
			longitudes[i] = g.getLongitude();
			i++;
		}
		return longitudes;
		//throw new UnsupportedOperationException(TODO.method());
		
		// TODO - SLUTT

	}

	private static int R = 6371000; // jordens radius

	public static double distance(GPSPoint gpspoint1, GPSPoint gpspoint2) {

		double d;
		double latitude1, longitude1, latitude2, longitude2;

		// TODO - START
		latitude1 = toRadians(gpspoint1.getLatitude());
		latitude2 = toRadians(gpspoint2.getLatitude());
		longitude1 = toRadians(gpspoint1.getLongitude());
		longitude2 = toRadians(gpspoint2.getLongitude());
		
		double dLat = latitude2 - latitude1;
		double dLon = longitude2 - longitude1;
		
		double a =  Math.pow(Math.sin(dLat / 2), 2) +  
					Math.pow(Math.sin(dLon / 2), 2) *  
					Math.cos(latitude1) *  	
					Math.cos(latitude2); 
		double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
		return R * c;
		
		//throw new UnsupportedOperationException(TODO.method());

		// TODO - SLUTT

	}

	public static double speed(GPSPoint gpspoint1, GPSPoint gpspoint2) {

		int secs;
		double speed;
		double avstand = distance(gpspoint1, gpspoint2);
		
		// TODO - START
		int time1 = gpspoint1.getTime();
		int time2 = gpspoint2.getTime();
		
		secs = time1 + time2;
		
		speed = (avstand/secs) * 3.6;
		//throw new UnsupportedOperationException(TODO.method());
		return speed;
		// TODO - SLUTT

	}

	public static String formatTime(int secs) {

		String timestr;
		String TIMESEP = ":";

		// TODO - START

		throw new UnsupportedOperationException(TODO.method());
		
		// TODO - SLUTT

	}
	private static int TEXTWIDTH = 10;

	public static String formatDouble(double d) {

		String str;

		// TODO - START

		throw new UnsupportedOperationException(TODO.method());

		// TODO - SLUTT
		
	}
}
