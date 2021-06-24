package Vjezbanje;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Zadatak006 {

	public static void main(String[] args) {
		
		/*Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers. Go to the editor
		Test Data:
		Input first number: 125
		Input second number: 24
		Expected Output :
		125 + 24 = 149
		125 - 24 = 101
		125 x 24 = 3000
		125 / 24 = 5
		125 mod 24 = 5    */
		
		int a,b;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("unesi prvi broj"));
		b = Integer.parseInt(JOptionPane.showInputDialog("unesi drugi broj"));
		
		System.out.println(a + " + " + b + " = " + (a+b));
		System.out.println(a + " - " + b + " = " + (a-b));
		System.out.println(a + " x " + b + " = " + (a*b));
		System.out.println(a + " / " + b + " = " + (a/b));
		System.out.println(a + " mod " + b + " = " + (a%b));
		
		
		Scanner ulaz = new Scanner(System.in);
		
		System.out.println("unesi prvi broj");
		int prviBroj = ulaz.nextInt();
		System.out.println("unesi drugi broj");
		int drugiBroj = ulaz.nextInt();
		System.out.println(prviBroj + " + " + drugiBroj + " = " + (prviBroj+drugiBroj));
		System.out.println(prviBroj + " - " + drugiBroj + " = " + (prviBroj-drugiBroj));
		System.out.println(prviBroj + " x " + drugiBroj + " = " + (prviBroj*drugiBroj));
		System.out.println(prviBroj + " / " + drugiBroj + " = " + (prviBroj/drugiBroj));
		System.out.println(prviBroj + " mod " + drugiBroj + " = " + (prviBroj%drugiBroj));
		ulaz.close();
	}
}
