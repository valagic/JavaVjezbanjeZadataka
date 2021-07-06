package Vjezbanje.zadatak4;

// Klasa Dokument ima svojstva: ID, iznos, datum
// Klasa Ra�un naslje�uje Dokument i dodaje svojstvo: Kupac
// Kupac ima ID, naziv i adresu
// Klasa Primka naslje�uje Dokument i dodaje svojstvo: otpremnica

// Kreirati po jednu instancu klasa Ra�un i Primka

public class Program {

	public Program() {
		
		/*Racun racun = new Racun();
		
		racun.setIznos(5555);
		System.out.println(racun.getIznos());*/
		
		Kupac kupac = new Kupac();
		
		Racun r1 = new Racun(1, 2, null, kupac);
		System.out.println(r1);
				

		
		Primka primka = new Primka();
		primka.setIznos(3333);
		System.out.println(primka.getIznos());
	}
	
	
	
	public static void main(String[] args) {
		new Program();
	}
}
