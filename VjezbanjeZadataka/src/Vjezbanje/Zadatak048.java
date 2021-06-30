package Vjezbanje;

import java.util.Scanner;

public class Zadatak048 {

	public static void main(String[] args) {

		/*Write a Java method to find the smallest number among three numbers. Go to the editor
		Test Data:
		Input the first number: 25
		Input the Second number: 37
		Input the third number: 29
		Expected Output:
		
		The smallest value is 25.0 */
		
		Scanner ulaz = new Scanner(System.in);
		System.out.print("unesi prvi broj");
		double prviBroj = ulaz.nextInt();
		System.out.print("unesi drugi broj");
		double drugiBroj = ulaz.nextInt();
		System.out.print("unesi treci broj");
		double treciBroj = ulaz.nextInt();
		System.out.print("Najmanji broj je : " + najmanji(prviBroj, drugiBroj, treciBroj)+"\n" );
				ulaz.close();
		
		}
	
	public static double najmanji(double prviBroj, double drugiBroj, double treciBroj) {
		
		return Math.min(Math.min(prviBroj, drugiBroj), treciBroj); // math.min trazi najmanji broj
	
	}
}