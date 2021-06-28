package Vjezbanje;

public class Zadatak040 {

	public static void main(String[] args) {
		
		/*  Write a Java program to get the character (Unicode code point) before the specified index within the String. Go to the editor
		
		Sample Output:
		
		Original String : w3resource.com                                                                              
		Character(unicode point) = 119                                                                                
		Character(unicode point) = 99 */
		
		String test = "w3resource.com";
		System.out.println("orginalni string je : " + test);
		
		int index1 = test.codePointBefore(2); // codePointBefore vraca jedan char prije trazenog indexa
		int index2 = test.codePointBefore(10); // 
		
		System.out.println("index na poziciji 2 je : " + (char)index1); 
		System.out.println("index na poziciji 10 je : " + (char)index2); 
	}
}
