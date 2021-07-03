package Vjezbanje.zadatak3;

import javax.swing.JOptionPane;


public class Program {

	private Auto[] autii;
	
	public Program() {
		autii = new Auto[5];
		ucitajAute();
		ispisiAute();
	}
	
	private void ucitajAute() {
		Auto auti;
		for(int i=0;i<5;i++) {
			auti = new Auto();
			auti.setBojaAuta(JOptionPane.showInputDialog((i+1) + ". boja auta je : " ));
			auti.setModelAuta(JOptionPane.showInputDialog((i+1) + ". model auta je : " ));
			auti.setGodinaProizvodnje(Integer.parseInt(JOptionPane.showInputDialog((i+1) + ". godina proizvodnje je : " )));
			autii[i] = auti;
		}
	}
	
	private void ispisiAute() {
		for(Auto auti : autii) {
			System.out.println(auti.getBojaAuta() + " " + auti.getModelAuta() + " " + auti.getGodinaProizvodnje());
		}
	}
	
	
	public static void main(String[] args) {
		
		new Program();
	}
	
}
