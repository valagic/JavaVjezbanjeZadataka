package Vjezbanje;

public class Zadatak029 {

	public static void main(String[] args) {
		
		
		/* Write a Java program to print the following grid. Go to the editor

			Expected Output :
			
			- - - - - - - - - -                                                                                           
			- - - - - - - - - -                                                                                           
			- - - - - - - - - -                                                                                           
			- - - - - - - - - -                                                                                           
			- - - - - - - - - -                                                                                           
			- - - - - - - - - -                                                                                           
			- - - - - - - - - -                                                                                           
			- - - - - - - - - -                                                                                           
			- - - - - - - - - -                                                                                           
			- - - - - - - - - - */
		
		int[][] niz = new int [10][10];
		
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				System.out.printf("%2d ", niz[i][j]); // %2d je da bude 0(malo to sortira ljepse)
			}
			System.out.println();
		}
		
	}
}
