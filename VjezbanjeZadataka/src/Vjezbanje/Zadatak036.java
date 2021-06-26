package Vjezbanje;

import java.util.Arrays;

public class Zadatak036 {

	public static void main(String[] args) {
		
		// Write a Java program to find the duplicate values of an array of integer values
		
		int[] niz = { 1,2,3,4,3,2,5,6,7 };
		System.out.println("niz je : " + Arrays.toString(niz));
		
		for(int i=0;i<niz.length - 1;i++) {
			for(int j=i+1;j<niz.length;j++) {
				if(niz[i]== niz[j] && (i !=j)) {
					System.out.println("dupli elementi su : " + niz[j]);
				}
			}
		}
	}
}
