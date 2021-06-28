package Vjezbanje;

public class Zadatak043 {

	public static void main(String[] args) {
		
		/* Write a Java program to compare two strings lexicographically, ignoring case differences. Go to the editor
			
			Sample Output:
			
			String 1: This is exercise 1                                                                                  
			String 2: This is Exercise 1                                                                                  
			"This is exercise 1" is equal to "This is Exercise 1" */
		
		String jedan = "Ovo je vjezba 1";
		String dva = "Ovo je Vjezba 1";
		
		System.out.println("String 1 : " + jedan);
		System.out.println("String 2 : " + dva);
		
		int rezultat = jedan.compareToIgnoreCase(dva); // radi komparaciju dva stringa, ignorira velika i mala slova
		
		if(rezultat<0) {
			System.out.println("\"" + jedan + "\"" +
	                " is less than " +
	                "\"" + dva + "\"");
		}
		else if (rezultat == 0) {
			System.out.println("\"" + jedan + "\"" +
	                " is equal to " +
	                "\"" + dva + "\"");
		}
		else // if (rezultat > 0)
        {
            System.out.println("\"" + jedan + "\"" +
                " is greater than " +
                "\"" + dva + "\"");
        }
	}
}

