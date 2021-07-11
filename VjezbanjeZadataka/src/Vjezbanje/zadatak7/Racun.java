package Vjezbanje.zadatak7;

public class Racun extends Automobil{

	private Kupac kupac;

	public Racun() {
		
	}
	
	public Racun(int id, String naziv, int brojSasije, Kupac kupac) {
		super(id, naziv, brojSasije);
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
		return this.getId() + " " + this.getNaziv() + " " + this.getBrojSasije() + " " + this.getKupac();
	}
	
}
