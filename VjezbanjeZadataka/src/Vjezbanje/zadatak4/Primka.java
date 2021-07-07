package Vjezbanje.zadatak4;

public class Primka extends Dokument {

	private String otpremnica;

	public Primka () {
		
	}
	
	public Primka(int iD, double iznos, String datum, String otpremnica) {
		super(iD, iznos, datum);
		this.otpremnica = otpremnica;
	}

	public String getOtpremnica() {
		return otpremnica;
	}

	public void setOtpremnica(String otpremnica) {
		this.otpremnica = otpremnica;
	}
	
	@Override
	public String toString() {
		return this.getID() + " " + this.getIznos() + " " + this.getDatum() + " " + this.getOtpremnica();
	}
	
}
