package Vjezbanje;

import java.util.Arrays;

public class Zadatak028 {

	public static void main(String[] args) {
		
		 // Write a Java program to sum values of an array.
		
		
		int[] niz = { 1,2,4,6,8,9,2,4,3 };
		int suma=0;
		
		System.out.println(Arrays.toString(niz));
		for(int i=0;i<niz.length;i++) {
			suma=suma+niz[i];
		
		}
		System.out.println("zbroj navedenog niza je : " + suma);
	}
}
