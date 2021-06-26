package Vjezbanje;

public class Zadatak030 {

	
	public static void main(String[] args) {
		
		//Write a Java program to calculate the average value of array elements
		
		int suma=0;
		double avg = 0;
		int[] niz = { 10,30,20,40,50,70,80,90,-30 };
		
		for(int i=0;i<niz.length;i++) {
			suma=suma+niz[i];
			avg = suma/niz.length;
			
			
		}
		System.out.println("zbroj navedenog niza je : " + suma);
		System.out.println("srednja vrijednost niza je : " + avg);
	}

}
