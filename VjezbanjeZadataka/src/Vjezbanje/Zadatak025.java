package Vjezbanje;

import java.util.Scanner;

public class Zadatak025 {

	public static void main(String[] args) {
		
		int n,i,j;
		
		Scanner ulaz = new Scanner(System.in);
		System.out.println("unesi neki broj");
		n = ulaz.nextInt();
		
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) 
				System.out.print(j);
				
				System.out.println("");
					
		}
		
		
	}
}


