package Vjezbanje;

public class Zadatak052 {

	public static void main(String[] args) {
		
		// Kreirajte metodu razlika tipa int koja
		// prima dva parametra tipa String
		// Metoda vraæa razliku prvog i drugog primljenog broja
		
		System.out.println(razlika("4","3442"));
		
	}
	
	
	public static int razlika(String a, String b) {
		int c = Integer.valueOf(a);
		int d = Integer.valueOf(b);
		
		return c-d;
	}
}
