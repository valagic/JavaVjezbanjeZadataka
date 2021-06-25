package Vjezbanje;

import java.util.Scanner;

public class Zadatak025 {

	public static void main(String[] args) {
		
		/* Write a program in Java to display the pattern like right angle triangle with a number. Go to the editor
			
			Test Data
			Input number of rows : 10
			Expected Output :
			
			1                                                                                
			12                                                                               
			123                                                                              
			1234                                                                             
			12345                                                                            
			123456                                                                           
			1234567                                                                          
			12345678                                                                         
			123456789                                                                        
			12345678910 */
		
		
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


