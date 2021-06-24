package Vjezbanje;

public class Zadatak011 {

	public static void main(String[] args) {
		
		/* Write a Java program to print the area and perimeter of a circle. Go to the editor
		Test Data:
		Radius = 7.5
		Expected Output
		Perimeter is = 47.12388980384689
		Area is = 176.71458676442586 */
		
		double Radius = 7.5;
		double Perimetar = 2 * Math.PI*Radius;
		double Area = Math.PI*(Radius*Radius);
		
		System.out.println(" Perimetar is = " + Perimetar);
		System.out.println(" Area is = " + Area);
		
	}
}
