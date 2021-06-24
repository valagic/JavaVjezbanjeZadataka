package Vjezbanje;

public class Zadatak013 {

	public static void main(String[] args) {
		
		/* Write a Java program to print the area and perimeter of a rectangle. Go to the editor
		Test Data:
		Width = 5.5 Height = 8.5

		Expected Output
		Area is 5.6 * 8.5 = 47.60
		Perimeter is 2 * (5.6 + 8.5) = 28.20 */
		
		final double Width = 5.6;
		final double Height = 8.5;
		
		double area,perimeter;
		perimeter = 2*(Height+Width);
		area = Height*Width;
		
		System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f \n", Height, Width, perimeter);
		System.out.printf("Area is %.1f * %.1f = %.2f \n", Width, Height, area);
	}
}
