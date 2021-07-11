package Vjezbanje.zadatak7;

public class imeFirme extends Automobil{

	private String modelAuta;

	public imeFirme() {
		
	}

	public imeFirme(int id, String naziv, int brojSasije, String modelAuta) {
		super(id, naziv, brojSasije);
		this.modelAuta = modelAuta;
	}

	public String getModelAuta() {
		return modelAuta;
	}

	public void setModelAuta(String modelAuta) {
		this.modelAuta = modelAuta;
	}
	
	@Override
	public String toString() {
		return this.getModelAuta() + " " + this.getId() + " " + this.getNaziv() + " " + this.getBrojSasije();
	}
	
}
