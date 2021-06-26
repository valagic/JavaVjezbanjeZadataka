package Vjezbanje;

public class Zadatak031 {

	// Write a Java program to test if an array contains a specific value.
	
	public static boolean contains(int[] arr, int broj) {
		
		for(int n : arr) {  // for each petlja
			if( broj == n) {
				return true;
			}
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		
		int[] niz = {
	            1789, 2035, 1899, 1456, 2013, 
	            1458, 2458, 1254, 1472, 2365, 
	            1456, 2265, 1457, 2456};
	      System.out.println(contains(niz, 2013));
	      System.out.println(contains(niz, 2015));
		
		
	}
}
