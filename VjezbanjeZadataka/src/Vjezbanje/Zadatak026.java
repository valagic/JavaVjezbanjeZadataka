package Vjezbanje;

import java.util.Scanner;

public class Zadatak026 {

	public static void main(String[] args) {
		
		/* Write a program in Java to make such a pattern like right angle triangle with a number which will repeat a number in a row.The pattern is as follows : Go to the editor
		
		1
		22
		333
		4444 */
				
		
		
		int n;
		
		Scanner ulaz = new Scanner(System.in);
		System.out.println("unesi neki broj");
		n = ulaz.nextInt();
		
		for(int i=1;i<=n;i++) { 
			for(int j=1;j<=i;j++)
				System.out.print(i);
			System.out.println("");
				
		}
		ulaz.close();
	}
}
