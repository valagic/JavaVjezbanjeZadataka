package Vjezbanje.zadatak4;


public class Racun extends Dokument{

	private Kupac kupac;

	public Racun () {
		
	}
	
	public Racun(int iD, double iznos, String datum, Kupac kupac) {
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
		return Integer.toString(getID()) + " " + getIznos()+ " " +  getDatum() + " " + getKupac();
	}
	
}
