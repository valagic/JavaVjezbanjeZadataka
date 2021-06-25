package Vjezbanje;

import java.util.Scanner;

public class Zadatak023 {

	public static void main(String[] args) {
		
		/*  Write a program in Java to display the multiplication table of a given integer. Go to the editor

			Test Data
			Input the number (Table to be calculated) : Input number of terms : 5
			Expected Output :
			
			5 X 0 = 0                                                                        
			5 X 1 = 5                                                                        
			5 X 2 = 10                                                                       
			5 X 3 = 15                                                                       
			5 X 4 = 20                                                                       
			5 X 5 = 25*/
		
		int broj=0;
		
		Scanner ulaz = new Scanner(System.in);
		
		System.out.println("unesi broj");
		broj = ulaz.nextInt();
		
		for(int i=0;i<=broj;i++) {
			System.out.println(broj + " x " + i + " = " + (broj*i));
		}
		
	}
}
