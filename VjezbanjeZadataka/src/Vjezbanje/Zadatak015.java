package Vjezbanje;

import java.util.Scanner;

public class Zadatak015 {

	public static void main(String[] args) {
		
		//Write a Java program to swap two variables.
		
		int a,b,c; // da bi se moglo odraditi swapanje potrebno je uvesti trecu varijablu
		a=5;
		b=8;
		
		System.out.println("prije promjena : a, b = "+a+", "+ b);
		c=a;
		a=b;
		b=c;
		System.out.println("nakon promjena : a, b = "+a+", "+ b);
		
		
		Scanner ulaz = new Scanner(System.in);
		
		int t;
		System.out.println("unesi prvi broj");
		int prviBroj = ulaz.nextInt();
		System.out.println("unesi drugi broj");
		int drugiBroj = ulaz.nextInt();
		
		t=prviBroj;
		prviBroj=drugiBroj;
		drugiBroj=t;
		
		System.out.println("nakon promjena : prviBroj, drugiBroj = "+prviBroj+", "+ drugiBroj);
		ulaz.close();
		
		
		
	}
}
