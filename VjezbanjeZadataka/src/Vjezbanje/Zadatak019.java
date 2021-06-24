package Vjezbanje;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Zadatak019 {

	
	public static void main(String[] args) {
		
	/* Write a program in Java to input 5 numbers from keyboard and find their sum and average. Go to the editor
		
		Test Data
		Input the 5 numbers : 1 2 3 4 5
		Expected Output :
		
		Input the 5 numbers :                                                            
		1                                                                                
		2                                                                                
		3                                                                                
		4                                                                                
		5                                                                                
		The sum of 5 no is : 15                                                          
		The Average is : 3.0  */
	
		//1 nacin 
					
		
					int a,b,c,d,e,sum;
					float avg;
			
					
					a = Integer.parseInt(JOptionPane.showInputDialog("unesi prvi broj"));
					b = Integer.parseInt(JOptionPane.showInputDialog("unesi drugi broj"));
					c = Integer.parseInt(JOptionPane.showInputDialog("unesi treci broj"));
					d = Integer.parseInt(JOptionPane.showInputDialog("unesi cetvrti broj"));
					e = Integer.parseInt(JOptionPane.showInputDialog("unesi peti broj"));
					
					sum = a+b+c+d+e;
					avg= (a+b+c+d+e)/5;
					System.out.println("Suma unesenih brojeva je = " + sum);
					System.out.println("avg broj od unesenih brojeba je = " + avg);
		
		
					//2 nacin
						
					
						Scanner ulaz = new Scanner(System.in);
						
						System.out.println("unesi prvi broj");
						int prviBroj = ulaz.nextInt();
						System.out.println("unesi drugi broj");
						int drugiBroj = ulaz.nextInt();
						System.out.println("unesi treci broj");
						int treciBroj = ulaz.nextInt();
						System.out.println("unesi cetvrti broj");
						int cetvrtiBroj = ulaz.nextInt();
						System.out.println("unesi peti broj");
						int petiBroj = ulaz.nextInt();
						
						int suma=prviBroj+drugiBroj+treciBroj+cetvrtiBroj+petiBroj;
						float avgDrugi=(prviBroj+drugiBroj+treciBroj+cetvrtiBroj+petiBroj)/5;
						System.out.println("Suma unesenih brojeva je = " + suma);
						System.out.println("avg broj od unesenih brojeba je = " + avgDrugi);

		
		
						// 3 nacin ispravan sa for petljom
		
						int i,n=0,s=0;
						double avgTreci;
						
						System.out.println("unesi 5 brojeva");
						
						for(i=0;i<5;i++) {
							Scanner novi = new Scanner(System.in);
							n = novi.nextInt();
							
							s = s+n;
						}
						avgTreci=s/5;
						
						System.out.println("Suma od 5 brojeva je : " +s+"\n prosjek je : " +avgTreci);
	}

	
}
