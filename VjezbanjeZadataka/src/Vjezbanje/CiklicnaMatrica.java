package Vjezbanje;

import javax.swing.JOptionPane;

public class CiklicnaMatrica {

	public static void main(String[] args) {
		
		int brojRedova, brojStupaca;
		
		brojRedova = Integer.parseInt(JOptionPane.showInputDialog("unesi broj redova"));
		
		brojStupaca = Integer.parseInt(JOptionPane.showInputDialog("unesi broj stupaca"));
		
		int [][] matrica = new int [brojRedova][brojStupaca];
		
		int a = 1, b1 = 0, b2 = brojStupaca-1, c1 = 0, c2 = brojRedova-1;
		
		while(a<=brojRedova*brojStupaca) {
			
			for(int i = b2; i >= b1; i--) {
				matrica[c2][i] = a++;
			}
			
			for(int j = c2 - 1; j >= c1; j--) {
				matrica[j][c1] = a++;
			}
			
			for(int i = b1 + 1 ; i <= b2 ; i++) {
				matrica[c1][i] = a++;
			}
			
			for(int j = c1 + 1; j <= c2 - 1; j++) {
				matrica[j][b2] = a++;
			}
			
			b2--;
			b1++;
			c2--;
			c1++;
		}
			System.out.println("Ciklična matrica: \n");
					
					for(int i = 0; i < brojRedova; i++) {
						for(int j = 0; j < brojStupaca; j++) {
							System.out.print(matrica[i][j] + "\t");
						}
						System.out.println();
		}
	}
}
