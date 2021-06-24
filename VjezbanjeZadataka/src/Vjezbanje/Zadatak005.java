package Vjezbanje;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Zadatak005 {

	public static void main(String[] args) {
		
		//  Write a Java program that takes two numbers as input and display the product of two numbers
		/*Test Data:
		Input first number: 25
		Input second number: 5
		Expected Output :
		25 x 5 = 125 */
		
		
		int a,b;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("unesi prvi broj"));
		b = Integer.parseInt(JOptionPane.showInputDialog("unesi drugi broj"));
		System.out.println(a + " x " + b + " = " + a*b);
		
		Scanner ulaz = new Scanner(System.in);
		
		System.out.println("unesi prvi broj");
		int num1 = ulaz.nextInt();
		System.out.println("unesi drugi broj");
		int num2 = ulaz.nextInt();
		System.out.println(num1 + " x " + num2 + " = " + num1*num2);
		
		
		
	}
}
