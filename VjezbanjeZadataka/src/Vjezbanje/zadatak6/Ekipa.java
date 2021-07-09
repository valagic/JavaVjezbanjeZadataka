package Vjezbanje.zadatak6;

public class Ekipa {

	private int id;
	private String naziv;
	private int brojIgraca;
	
	public Ekipa() {
		
	}
	
	public Ekipa(int id, String naziv, int brojIgraca) {
		this.id = id;
		this.naziv = naziv;
		this.brojIgraca = brojIgraca;
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
	public int getBrojIgraca() {
		return brojIgraca;
	}
	public void setBrojIgraca(int brojIgraca) {
		this.brojIgraca = brojIgraca;
	}
	
	@Override
	public String toString() {
		return this.getNaziv() + " " + this.getBrojIgraca() + " " + this.getId();
	}
	
	
}
