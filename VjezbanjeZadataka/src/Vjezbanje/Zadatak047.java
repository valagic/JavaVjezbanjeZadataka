package Vjezbanje;

public class Zadatak047 {

	public static void main(String[] args) {
		/*  Write a Java program to create a new String object with the contents of a character array. Go to the editor

			Sample Output:
			
			The book contains 234 pages. */
		
		
		 // char niz s vrijednostima
        char[] niz = new char[] { '1', '2', '3', '4' };

        // kreiramo string niz
        // krece od indexa 1 sto je 2, length do 3 sto daje 234
        String str = String.copyValueOf(niz, 1, 3);

        // rezultat novog stringa
        System.out.println("\nKnjiga sadrzi " + str +" stranice.\n");
    }
}

