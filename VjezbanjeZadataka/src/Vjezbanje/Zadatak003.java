package Vjezbanje;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Zadatak003 {

	public static void main(String[] args) {
		
		//Write a Java program to divide two numbers and print on the screen.
		
		int a,b;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("unesi prvi broj"));
		b = Integer.parseInt(JOptionPane.showInputDialog("unesi drugi broj"));
		System.out.println(a/b);
		
		Scanner ulaz = new Scanner(System.in);
		
		System.out.println("unesi prvi broj");
		int prviBroj = ulaz.nextInt();
		System.out.println("unesi drugi broj");
		int drugiBroj = ulaz.nextInt();
		System.out.println(prviBroj/drugiBroj);
		ulaz.close();
		
	}
}
