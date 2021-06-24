package Vjezbanje;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Zadatak018 {

	public static void main(String[] args) {
		
		// Write a program in Java to display n terms of natural numbers and their sum.
		
		/*int n, sum;
		sum=0;
		
		n = Integer.parseInt(JOptionPane.showInputDialog("unesi neki broj"));
		
		for(int i=0;i<=n;i++) {
			sum=sum+i;
		}
		System.out.println(sum);*/
		
		
		Scanner ulaz = new Scanner(System.in);
		
		System.out.println("unesi neki broj");
		int n = ulaz.nextInt();
		int sum =0;
		
		for(int i=0;i<=n;i++) {
			sum=sum+i;
		}
		System.out.println("suma unesenih brojeva od 1 do " + n + " je " + sum);
		ulaz.close();
	}
}
