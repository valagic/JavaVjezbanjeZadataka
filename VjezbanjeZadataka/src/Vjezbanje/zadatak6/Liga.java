package Vjezbanje.zadatak6;

public class Liga extends Ekipa{

	private int pozicijaNaTablici;

	public Liga() {
		
	}

	public Liga(int id, String naziv, int brojIgraca, int pozicijaNaTablici) {
		super(id, naziv, brojIgraca);
		this.pozicijaNaTablici = pozicijaNaTablici;
	}

	public int getPozicijaNaTablici() {
		return pozicijaNaTablici;
	}

	public void setPozicijaNaTablici(int pozicijaNaTablici) {
		this.pozicijaNaTablici = pozicijaNaTablici;
	}
	
	
}
