package Vjezbanje.zadatak4;

import java.sql.Date;

public class Primka extends Dokument {

	private int otpremnica;

	public Primka () {
		
	}
	
	public Primka(int iD, float iznos, Date datum, int otpremnica) {
		super(iD, iznos, datum);
		this.otpremnica = otpremnica;
	}

	public int getOtpremnica() {
		return otpremnica;
	}

	public void setOtpremnica(int otpremnica) {
		this.otpremnica = otpremnica;
	}
	
	
}
