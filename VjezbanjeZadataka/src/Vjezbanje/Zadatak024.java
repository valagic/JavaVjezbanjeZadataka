package Vjezbanje;

import java.util.Scanner;

public class Zadatak024 {

	public static void main(String[] args) {
		
		/* Write a program in Java to display the n terms of odd natural number and their sum. Go to the editor

		Test Data
		Input number of terms is: 5
		Expected Output :
		
		The odd numbers are :                                                            
		1                                                                                
		3                                                                                
		5                                                                                
		7                                                                                
		9                                                                                
		The Sum of odd Natural Number upto 5 terms is: 25*/
		
		int suma=0,n;
		
		Scanner ulaz = new Scanner(System.in);
		System.out.println("unesi neki broj");
		n = ulaz.nextInt();
		System.out.println("Neparni brojevi su :\n");
		for(int i=1;i<=n;i++) {
			System.out.println(2*i-1);
			suma+=2*i-1;
		}
		System.out.println("suma neparnih brojeva je :" + suma);
		
	}
}