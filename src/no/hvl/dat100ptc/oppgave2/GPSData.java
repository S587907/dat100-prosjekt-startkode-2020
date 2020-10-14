package no.hvl.dat100ptc.oppgave2;

import no.hvl.dat100ptc.TODO;
import no.hvl.dat100ptc.oppgave1.GPSPoint;

public class GPSData {
	
		private GPSPoint[] gpspoints;
		protected int antall = 0;
		
		// TODO - START

		public GPSData(int n) {
		gpspoints = new GPSPoint[n];
		antall = 0;
		
		//throw new UnsupportedOperationException(TODO.construtor("GPSData"));

		// TODO - SLUTT
	}

	public GPSPoint[] getGPSPoints() {
		return this.gpspoints;
		
	}
	
	protected boolean insertGPS(GPSPoint gpspoint) {

		// TODO - START
		
		boolean inserted = false;
		
		if (antall < gpspoints.length) {
			gpspoints[antall] = gpspoint;
			antall++;
			inserted = true;
		}
		return inserted;
		
		//throw new UnsupportedOperationException(TODO.method());

		// TODO - SLUTT
	}

	public boolean insert(String time, String latitude, String longitude, String elevation) {


		// TODO - START
		
		GPSPoint gpspoint = GPSDataConverter.convert(time, latitude, longitude, elevation);
		boolean inserted = insertGPS(gpspoint);
		
		//throw new UnsupportedOperationException(TODO.method());
		
		// TODO - SLUTT
		
		return inserted;
		
	}

	public void print() {

		// TODO - START
		
		System.out.println("====== Konvertert GPS Data - START ======");
		for (GPSPoint gpspoint : gpspoints){
			System.out.println(gpspoint.toString());
		}
		
		//throw new UnsupportedOperationException(TODO.method());
		
		System.out.println("====== Konvertert GPS Data - SLUTT ======");
		
		// TODO - SLUTT
		
		

	}
}
