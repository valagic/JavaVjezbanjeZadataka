package Vjezbanje;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Zadatak012 {

	public static void main(String[] args) {
		
		//Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
		
		double a,b,c;
		
		a = Double.parseDouble(JOptionPane.showInputDialog("unesi prvi broj"));
		b = Double.parseDouble(JOptionPane.showInputDialog("Unesi drugi broj"));
		c = Double.parseDouble(JOptionPane.showInputDialog("Unesi treci broj"));
		
		System.out.println((a+b+c)/3);
		
		Scanner ulaz = new Scanner(System.in);
		
		System.out.println("unesi prvi broj");
		double prviBroj = ulaz.nextDouble(); // ako smo unijeli decimalni broj, za cijeli ide int
		System.out.println("unesi drugi broj");
		double drugiBroj = ulaz.nextDouble();
		System.out.println("unesi treci broj");
		double treciBroj = ulaz.nextDouble();
		
		System.out.println((prviBroj+drugiBroj+treciBroj)/3);
		ulaz.close();
		
		
	}
}
