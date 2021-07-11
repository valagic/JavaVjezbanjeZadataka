package Vjezbanje.zadatak7;

//Klasa Automobil ima svojstva: ID, naziv, brojSasije
//Klasa Ra�un naslje�uje Automobil i dodaje svojstvo: Kupac
//Kupac ima ID, naziv i adresu
//Klasa imeFirme naslje�uje Automobil i dodaje svojstvo: modelAuta

//Kreirati po jednu instancu klasa racun i imeFirme

public class Program {

	public Program() {
		
		Racun r1= new Racun(1,"novo",111111, new Kupac(1,"Pero","novo mjesto22"));
		System.out.println(r1);
		
		imeFirme i1= new imeFirme(1,"novi",1111,"novo");
		System.out.println(i1);
		
	}
	
	
	
	public static void main(String[] args) {
		new Program();
	}
}
