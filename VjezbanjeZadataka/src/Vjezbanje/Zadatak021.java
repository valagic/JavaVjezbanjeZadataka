package Vjezbanje;

import java.util.Scanner;

public class Zadatak021 {

	public static void main(String[] args) {
		
		/* Take three numbers from the user and print the greatest number. Go to the editor
		
		Test Data
		Input the 1st number: 25
		Input the 2nd number: 78
		Input the 3rd number: 87
		Expected Output :
		The greatest: 87 */
		
		Scanner ulaz = new Scanner(System.in);
		
		System.out.println("unesi prvi broj");
		int prviBroj = ulaz.nextInt();
		System.out.println("unesi drugi broj");
		int drugiBroj = ulaz.nextInt();
		System.out.println("unesi treci broj");
		int treciBroj = ulaz.nextInt();
		
		System.out.println();
		if(prviBroj>drugiBroj) {
			System.out.println("Najveci broj od 3 ponudjena je : " + prviBroj);
		} else if (drugiBroj>treciBroj) {
			System.out.println("Najveci broj od 3 ponudjena je : " + drugiBroj);
		} else {

			System.out.println("Najveci broj od 3 ponudjena je : " + treciBroj);
		}
		
		
	}
}
