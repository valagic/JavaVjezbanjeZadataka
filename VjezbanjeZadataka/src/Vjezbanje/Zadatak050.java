package Vjezbanje;

public class Zadatak050 {


	
	public static int suma(int[] niz) {
		int suma=0;
		
		for(int i=0;i<niz.length;i++) {
			suma=suma+niz[i];
		}
		return suma;
	}
	
	public static void main(String[] args) {
		
		// Kreirati metodu tipa int naziva suma
		// koja prima niz cijelih brojeva
		// metoda vraæa sumu svih brojeva u nizu

		// Metodu pozvati iz main metode
		
		int[] niz = {5,77,5,66};	
		System.out.println(suma(niz));
		
	}
}
