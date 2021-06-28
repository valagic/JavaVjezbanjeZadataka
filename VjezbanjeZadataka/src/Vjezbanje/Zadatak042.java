package Vjezbanje;

public class Zadatak042 {

	public static void main(String[] args) {
		
		/* Write a Java program to compare two strings lexicographically. Two strings are lexicographically equal if they are the same length and contain the same characters in the same positions. Go to the editor

		Sample Output:
		
		String 1: This is Exercise 1                                                                                  
		String 2: This is Exercise 2                                                                                  
		"This is Exercise 1" is less than "This is Exercise 2" */
		
		String jedan = "Ovo je vjezba 1";
		String dva = "Ovo je vjezba 2";
		
		System.out.println("String 1 : " + jedan);
		System.out.println("String 2 : " + dva);
		
		int rezultat = jedan.compareTo(dva); // radi komparaciju dva stringa
		
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
