package Vjezbanje.zadatak4;

public class Kupac {

	private int ID;
	private String naziv;
	private String adresa;
	
	public Kupac () {
		
	}
	
	public Kupac(int iD, String naziv, String adresa) {
		ID = iD;
		this.naziv = naziv;
		this.adresa = adresa;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getAdresa() {
		return adresa;
	}
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	
	@Override
	public String toString() {
		return super.toString() + " " + this.ID + this.adresa + this.naziv ;
	}
	
}
