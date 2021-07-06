package Vjezbanje.zadatak4;

import java.sql.Date;

public class Racun extends Dokument{

	private Kupac kupac;

	public Racun () {
		
	}
	
	public Racun(int iD, float iznos, Date datum, Kupac kupac) {
		super(iD, iznos, datum);
		this.kupac = kupac;
	}

	public Kupac getKupac() {
		return kupac;
	}

	public void setKupac(Kupac kupac) {
		this.kupac = kupac;
	}
	
	@Override
	public String toString() {
		return super.toString() + " " + this.kupac + this.getID()+this.getIznos()+this.getDatum();
	}
	
}
