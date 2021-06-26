package Vjezbanje;

import java.util.Arrays;

public class Zadatak037 {

	// Write a Java program to find the duplicate values of an array of string values
	
	public static void main(String[] args) {
		
		String[] niz = { "abc","bcd","efg","ijk","lmn","abc","bcd"};

		for(int i=0;i<niz.length-1;i++) {
			for(int j=i+1;j<niz.length;j++) {
				if(niz[i] == niz[j] && (i !=j)) { // moze ici i ovako if( (my_array[i].equals(my_array[j])) && (i != j) )
					System.out.println("dupli elementi su : " + niz[j]);
				}
			}
		}
		
	}
}

