package Vjezbanje;

public class Zadatak044 {

	public static void main(String[] args) {
		
		/* Write a Java program to concatenate a given string to the end of another string. Go to the editor

		Sample Output:
		
		String 1: PHP Exercises and                                                                                   
		String 2: Python Exercises                                                                                    
		The concatenated string: PHP Exercises and Python Exercises */
		
		String jedan = "PHP Exercises and ";
		String dva = "Python Exercises";
		
		System.out.println("Orginalni string je : " + jedan);
		System.out.println("Orginalni string je : " + dva);
		
		String tri = jedan.concat(dva); // spoji dva stringa u jedan
		
		System.out.println("nakon concata String glasi : " + tri);
		
	}
}
