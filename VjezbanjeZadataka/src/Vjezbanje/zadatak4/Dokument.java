package Vjezbanje.zadatak4;



public class Dokument {

	private int ID;
	private double iznos;
	private String datum;
	
	public Dokument() {
		
	}
	
	public Dokument(int iD, double iznos, String datum) {
		ID = iD;
		this.iznos = iznos;
		this.datum = datum;
	}

	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public double getIznos() {
		return iznos;
	}
	public void setIznos(double iznos) {
		this.iznos = iznos;
	}
	public String getDatum() {
		return datum;
	}
	public void setDatum(String datum) {
		this.datum = datum;
	}

}
