package no.hvl.dat100ptc.oppgave2;

import no.hvl.dat100ptc.TODO;
import no.hvl.dat100ptc.oppgave1.GPSPoint;

public class GPSData {

	private GPSPoint[] gpspoints;
	protected int antall = 0;

	public GPSData(int n) {

		// TODO - START
		this.gpspoints = new GPSPoint[n];
		this.antall = 0;
		//throw new UnsupportedOperationException(TODO.construtor("GPSData"));

		// TODO - SLUTT
	}

	public GPSPoint[] getGPSPoints() {
		return this.gpspoints;
	}
	
	protected boolean insertGPS(GPSPoint gpspoint) {

		boolean inserted = false;
		// TODO - START
		
//		GPSPoint[] temp = new GPSPoint[gpspoints.length];
//		
//		for(int i = 0; i < gpspoints.length; i++){
//			temp[i] = gpspoints[i];
//			inserted = true;
//		}
//		temp[temp.length] = gpspoint;
//		
//		return inserted;
		

		for ( antall = 0; antall < gpspoints.length; antall++) {
			for (int i = 0 ; i < gpspoints.length; i++) {
			gpspoint = gpspoints[i];
			
			
		}	
			
		}
		return inserted;
		//throw new UnsupportedOperationException(TODO.method());

		// TODO - SLUTT
	}

	public boolean insert(String time, String latitude, String longitude, String elevation) {

		GPSPoint gpspoint;

		// TODO - START
		
		throw new UnsupportedOperationException(TODO.method());

		// TODO - SLUTT
		
	}

	public void print() {

		System.out.println("====== Konvertert GPS Data - START ======");

		// TODO - START

		throw new UnsupportedOperationException(TODO.method());

		// TODO - SLUTT
		
		// System.out.println("====== Konvertert GPS Data - SLUTT ======");

	}
}
