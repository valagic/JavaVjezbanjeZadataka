package Vjezbanje;

public class Zadatak041 {

	public static void main(String[] args) {
		
		 /*Write a Java program to count a number of Unicode code points in the specified text range of a String. Go to the editor

		 Sample Output:

		 Original String : w3rsource.com                                                                               
		 Codepoint count = 9*/
		
		String test = "w3resources.com";
		System.out.println("orginalni string je : " + test);
		
		int index = test.codePointCount(1, 10);
		
		System.out.println("codepoint count je : " + index);
		
		
	}
}
