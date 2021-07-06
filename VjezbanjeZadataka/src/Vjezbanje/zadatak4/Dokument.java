package Vjezbanje.zadatak4;

import java.sql.Date;

public class Dokument {

	private int ID;
	private float iznos;
	private Date datum;
	
	public Dokument() {
		
	}
	
	public Dokument(int iD, float iznos, Date datum) {
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
	public float getIznos() {
		return iznos;
	}
	public void setIznos(float iznos) {
		this.iznos = iznos;
	}
	public Date getDatum() {
		return datum;
	}
	public void setDatum(Date datum) {
		this.datum = datum;
	}
	@Override
	public String toString() {
		return this.ID + " " +  this.iznos +  " " + this.datum;
	} 
}
