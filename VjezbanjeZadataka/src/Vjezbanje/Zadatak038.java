package Vjezbanje;

public class Zadatak038 {
	
	public static void main(String[] args) {
		
		/* Write a Java program to get the character at the given index within the String. Go to the editor

			Sample Output:
			
			Original String = Java Exercises!                                                                             
			The character at position 0 is J                                                                              
			The character at position 10 is i */
		
		String test = "Java Exercises! ";
		System.out.println("orginalni string je : " + test);
		
		int index1 = test.charAt(0); // index na poziciji 0
		int index2 = test.charAt(10); // index na poziciji 10
		
		System.out.println("Slovo na poziciji 0 je : " + (char)index1); // char daje jedan znak
		System.out.println("Slovo na poziciji 10 je : " + (char)index2); // ako je razmak izmedju rijeci i to zauzima jedan index
	}
}
