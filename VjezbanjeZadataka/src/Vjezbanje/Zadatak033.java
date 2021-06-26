package Vjezbanje;

import java.util.Arrays;

public class Zadatak033 {

	public static void main(String[] args) {
		
		// Write a Java program to copy an array by iterating the array.
		
		int[] niz = { 1,2,3,4,5,6,7 };
		int[] nizDva = new int[7];
		System.out.println("izvorni niz je : " + Arrays.toString(niz));
		
		for(int i=0;i<niz.length;i++) {
			nizDva[i] = niz[i]; // kopira prvi niz
		}System.out.println("novi niz je : " + Arrays.toString(nizDva));
	}
}
