package Vjezbanje;

import java.util.Arrays;

public class Zadatak027 {

	public static void main(String[] args) {
		
		
		// Write a Java program to sort a numeric array and a string array.
		
		int[] nizPrvi = { 4,5,2,1,6,8,3,9,7 }; // integer niz
		String[] nizDrugi = {"c","a","d","b","g","e","f","i","j","h"}; // string niz
		

		System.out.println("Orginalni poredak niza je : " + Arrays.toString(nizPrvi));
		Arrays.sort(nizPrvi); // naredba koja sortira po redu niz
		System.out.println("poredak po brojevima je : " + Arrays.toString(nizPrvi));

		System.out.println("Orginalni poredak niza je : " + Arrays.toString(nizDrugi));
		Arrays.sort(nizDrugi);// naredba koja sortira po redu niz
		System.out.println("poredak po abecedi je :" + Arrays.toString(nizDrugi));
	}
	
}
