package Vjezbanje;

public class Zadatak039 {

	public static void main(String[] args) {
		
		/* Write a Java program to get the character (Unicode code point) at the given index within the String. Go to the editor

		Sample Output:
		
		Original String : w3resource.com                                                                              
		Character(unicode point) = 51                                                                                 
		Character(unicode point) = 101 */
		
		String test = "w3resource.com";
		System.out.println("orginalni string je : " + test);
		
		int index1 = test.charAt(2);
		int index2 = test.charAt(10);
		
		System.out.println("index na poziciji 2 je : " + (char)index1);
		System.out.println("index na poziciji 10 je : " + (char)index2);
	}
}
