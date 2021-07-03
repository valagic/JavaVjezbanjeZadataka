package Vjezbanje.zadatak2;

import javax.swing.JOptionPane;



public class Program {

		//Napi�ite program koji za ekipe unosi 3 svojstva
		//Program unosi 5 ekipa
		//Program ispisuje jedno odabrano svojstvo ekipe
	
	private Ekipa[] ekipe;
	
	
	public Program () {
		ekipe = new Ekipa[5];
		ucitajEkipe();
		ispisiEkipe();
	}
	
	private void ucitajEkipe() {
		Ekipa ekipa;
		for(int i=0;i<5;i++) {
			ekipa = new Ekipa();
			ekipa.setBojaDresova(JOptionPane.showInputDialog((i+1) + ". boja dresova je : " ));
			ekipa.setImeEKipe(JOptionPane.showInputDialog((i+1) + ". ime ekipe je : " ));
			ekipa.setBrojeviDresova(Integer.parseInt(JOptionPane.showInputDialog((i+1) + ". brojevi dresova su : " )));
			ekipe[i] = ekipa;
		}
	}
	
	private void ispisiEkipe() {
		for(Ekipa ekipa : ekipe) {
			System.out.println(ekipa.getBojaDresova() + " " + ekipa.getImeEKipe() + " " + ekipa.getBrojeviDresova());
		}
	}
	
	
	public static void main(String[] args) {
		new Program();
	}
}
