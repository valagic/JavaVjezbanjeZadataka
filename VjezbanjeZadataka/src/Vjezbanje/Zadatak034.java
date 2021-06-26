package Vjezbanje;

import java.util.Arrays;

public class Zadatak034 {

	public static void main(String[] args) {
		
		// Write a Java program to insert an element (specific position) into an array

			   int[] niz = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

			    
			   
			   int Index_position = 2; // ubacivanje elementa na 3 poziciju index=2 value=5
			   int newValue    = 5;

			  System.out.println("Original Array : "+Arrays.toString(niz));     
			   
			  for(int i=niz.length-1; i > Index_position; i--){
			    niz[i] = niz[i-1];
			   }
			   niz[Index_position] = newValue;
			   System.out.println("New Array: "+Arrays.toString(niz));
			 }
			 }
	