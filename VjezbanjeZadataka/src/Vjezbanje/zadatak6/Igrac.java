package Vjezbanje.zadatak6;

public class Igrac {

	private int id;
	private String ime;
	private String prezime;
	
	public Igrac() {
		
	}
	
	public Igrac(int id, String ime, String prezime) {
		this.id = id;
		this.ime = ime;
		this.prezime = prezime;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	
	@Override
	public String toString() {
		return this.getId() + " " + this.getIme() + " " + this.getPrezime();
	}
}
