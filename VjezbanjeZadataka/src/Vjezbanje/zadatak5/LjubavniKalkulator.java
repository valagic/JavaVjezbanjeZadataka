package Vjezbanje.zadatak5;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class LjubavniKalkulator {

	public static void main(String[] args) {
	
		String prvoIme = String.valueOf(JOptionPane.showInputDialog("unesi prvo ime"));
		String drugoIme = String.valueOf(JOptionPane.showInputDialog("unesi drugo ime"));
		
		String imeConcat = prvoIme + drugoIme;
		
		String[] niz = new String[imeConcat.length()];

		int count = 0;
		
		
		
		String[] niz1 = new String[prvoIme.length()];
		String[] niz2 = new String[drugoIme.length()];

		for (int i = 0; i < niz.length; i++) {

			if (i < prvoIme.length()) {
				niz1[i] = niz[i];
			} else if (i >= prvoIme.length()) {
				niz2[i - prvoIme.length()] = niz[i];
			}
		}

		System.out.println();
		System.out.print("Niz prvog imena: " + Arrays.toString(niz1));
		System.out.println();
		System.out.print("Niz drugog imena: " + Arrays.toString(niz2));
		
		
	}
}
