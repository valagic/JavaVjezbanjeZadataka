package Vjezbanje;

import java.util.Scanner;

public class Zadatak020 {

	public static void main(String[] args) {
		
		//Write a Java program to get a number from the user and print whether it is positive or negative. Go to the editor

				/*Test Data
				Input number: 35
				Expected Output :
				Number is positive*/
		
		Scanner ulaz = new Scanner(System.in);
		System.out.println("unesi neki broj");
		
		int broj = ulaz.nextInt();
		
		if(broj>0) {
			System.out.println("broj je pozitivan");
		} else if (broj<0) {
			System.out.println("broj je negativan");
		}else {
			System.out.println("broj je 0");
		}
		ulaz.close();
	}
}
