package Vjezbanje;

public class Zadatak046 {

	public static void main(String[] args) {
		
		/*Write a Java program to compare a given string to the specified character sequence. Go to the editor

		Sample Output:
		
		Comparing example.com and example.com: true                                                                   
		Comparing Example.com and example.com: false */
		
		String jedan = "example.com";
		String dva = "Example.com";
		
		CharSequence cs = "example.com";
			System.out.println("Comparing "+jedan+" and "+cs+": " + jedan.contentEquals(cs)); // provjera je li string jedan jednak charsequenceu, u ovom slucaju je
			System.out.println("Comparing "+dva+" and "+cs+": " + dva.contentEquals(cs)); // provjera je li string dva jednak charsequenceu, u ovom slucaju nije
		
		
	}
}
