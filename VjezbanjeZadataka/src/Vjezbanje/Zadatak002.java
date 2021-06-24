package Vjezbanje;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Zadatak002 {

	public static void main(String[] args) {
		
		//Write a Java program to print the sum of two numbers
		int a,b;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("unesi prvi broj"));
		b = Integer.parseInt(JOptionPane.showInputDialog("unesi drugi broj"));
		System.out.println(a+b);
		
		Scanner ulaz = new Scanner(System.in);
		System.out.println("unesi prvi broj");
		int num1 = ulaz.nextInt();
		System.out.println("unesi drugi broj");
		int num2 = ulaz.nextInt();
		System.out.println(num1+num2);
		ulaz.close();
		
	}
}
