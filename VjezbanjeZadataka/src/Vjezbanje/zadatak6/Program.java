package Vjezbanje.zadatak6;


//Klasa Ekipa ima svojstva: ID, naziv, brojIgraca
//Klasa  "test" naslje�uje Ekipu i dodaje svojstvo: igrac
//Igrac ima ID, ime, prezime
//Klasa Liga naslje�uje Ekipu i dodaje svojstvo: pozicija na tablici

//Kreirati po jednu instancu klasa igraca i ekipu


public class Program {

	public Program() {
		
	Ekipa e1 = new Ekipa(1,"novi klub",11);
	System.out.println(e1);
	
	
		Igrac i1 = new Igrac(1,"pero","peric");
		System.out.println(i1);
		
		
	}
	public static void main(String[] args) {
		new Program();
	}
}
