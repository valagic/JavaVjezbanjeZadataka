package Vjezbanje.zadatak6;

public class Test extends Ekipa{

	private Igrac igrac;
	
	public Test() {
		
	}

	public Test(int id, String naziv, int brojIgraca, Igrac igrac) {
		super(id, naziv, brojIgraca);
		this.igrac = igrac;
	}

	public Igrac getIgrac() {
		return igrac;
	}

	public void setIgrac(Igrac igrac) {
		this.igrac = igrac;
	}
	
	
	
}
