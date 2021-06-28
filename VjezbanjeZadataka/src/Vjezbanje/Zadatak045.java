package Vjezbanje;

public class Zadatak045 {

	public static void main(String[] args) {
		
		/*Write a Java program to test if a given string contains the specified sequence of char values. Go to the editor

			Sample Output:
			
			Original String: PHP Exercises and Python Exercises                                                           
			Specified sequence of char values: and                                                                        
			true  */
		
		String jedan = "PHP Exercises and Python Exercises";
        String dva = "and";
        System.out.println("Orginalni String: " + jedan);
        System.out.println("Specified sequence of char values: " + dva);
        System.out.println(jedan.contains(dva)); // provjera da li se nalazi AND u stringu jedna, ako se nalazi bacit cu TRUE
    }
}

