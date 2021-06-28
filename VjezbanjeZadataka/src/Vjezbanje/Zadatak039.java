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
		
		int index1 = test.codePointAt(2); // vraca char na specificnoj poziciji - codePointAt
		int index2 = test.codePointAt(10); // 
		
		System.out.println("index na poziciji 2 je : " + (char)index1); // prikazuje koji se znak nalazi na poziciji 2 to radi (char)
		System.out.println("index na poziciji 10 je : " + (char)index2); // prikazuje koji se znak nalazi na poziciji 10 to radi (char)
	}
}
