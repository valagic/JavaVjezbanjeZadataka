package Vjezbanje.zadatak7;

public class Automobil {

	private int id;
	private String naziv;
	private int brojSasije;
	
	public Automobil() {
		
	}

	public Automobil(int id, String naziv, int brojSasije) {
		this.id = id;
		this.naziv = naziv;
		this.brojSasije = brojSasije;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public int getBrojSasije() {
		return brojSasije;
	}
	public void setBrojSasije(int brojSasije) {
		this.brojSasije = brojSasije;
	}
	
	
}
