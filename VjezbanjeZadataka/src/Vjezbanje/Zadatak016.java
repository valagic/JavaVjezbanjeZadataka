package Vjezbanje;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Zadatak016 {

	public static void main(String[] args) {
		
		
		//Write a Java program that takes a year from user and print whether that year is a leap year or not.
		
		int a;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("unesi godinu"));
		
		if(a%4==0) {
			System.out.println("ovo je prijestupna godina");
		} else {
			System.out.println("nije prijestupna godina");
		}
		
		Scanner ulaz = new Scanner(System.in);
		System.out.println("unesi godinu");
		int godina = ulaz.nextInt();
		
		if(godina%4==0) {
			System.out.println("ovo je prijestupna godina");
		} else {
			System.out.println("nije prijestupna godina");
		}
		ulaz.close();
		
		
	}
}
