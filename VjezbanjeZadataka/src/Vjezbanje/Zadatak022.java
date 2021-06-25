package Vjezbanje;

import java.util.Scanner;

public class Zadatak022 {

	public static void main(String[] args) {
		
		/* Write a program in Java to display the cube of the number upto given an integer. Go to the editor

		Test Data
		Input number of terms : 4
		Expected Output :
		
		Number is : 1 and cube of 1 is : 1                                               
		Number is : 2 and cube of 2 is : 8                                               
		Number is : 3 and cube of 3 is : 27                                              
		Number is : 4 and cube of 4 is : 64 */
		
		int broj=0;
		
		Scanner ulaz = new Scanner(System.in);
		
		System.out.println("unesi broj");
		broj = ulaz.nextInt();

		for(int i=1;i<=broj;i++) {
			System.out.println("Broj je : " + i + " and cube of " + i + " je : " + (i*i*i) );
		}
		ulaz.close();
		
		
		
	}
}
	

	