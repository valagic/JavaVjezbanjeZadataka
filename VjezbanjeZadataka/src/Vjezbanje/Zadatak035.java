package Vjezbanje;

import java.util.Arrays;

public class Zadatak035 {

	public static void main(String[] args) {
		
		// Write a Java program to reverse an array of integer values
		
		int[] niz = { 1,2,3,4,5,6,7,8,9 } ;
		System.out.println("Ovo je pocetni niz : " + Arrays.toString(niz));
		for(int i = 0; i < niz.length / 2; i++)
		  {
		    int temp = niz[i];
		    niz[i] = niz[niz.length - i - 1];
		    niz[niz.length - i - 1] = temp;
		  }
		    System.out.println("Reverse niz : "+Arrays.toString(niz));
		 }
		}