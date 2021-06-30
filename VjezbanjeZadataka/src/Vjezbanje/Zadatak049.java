package Vjezbanje;

import java.util.Scanner;

public class Zadatak049 {

	public static void main(String[] args) {
		
		Scanner ulaz = new Scanner(System.in);
		System.out.print("unesi prvi broj ");
		double prviBroj = ulaz.nextDouble();
		System.out.print("unesi drugi broj ");
		double drugiBroj = ulaz.nextDouble();
		System.out.print("unesi treci broj ");
		double treciBroj = ulaz.nextDouble();
		
		System.out.println("srednja vrijednost je  " + avg(prviBroj, drugiBroj, treciBroj)+"\n" );
		ulaz.close();
		
	}
	
	public static double avg(double prviBroj, double drugiBroj, double treciBroj) {
		return (prviBroj+drugiBroj+treciBroj) / 3;
	}
	
}
