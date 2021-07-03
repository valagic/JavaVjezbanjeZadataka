package Vjezbanje.zadatak1;

import javax.swing.JOptionPane;


public class Program {

	//Napi�ite program koji za Ra�unalo unosi 3 svojstva
	//Program unosi 5 ra�unala
	//Program ispisuje jedno odabrano svojstvo ra�unala
	
	private Racunalo[] racunala;
	
	public Program () {
	racunala = new Racunalo[5];
	ucitajRacunala();
	ispisiUcitano();
	}
	
	private void ucitajRacunala () {
		Racunalo racunalo;
		for(int i=0;i<5;i++) {
			racunalo = new Racunalo();
			racunalo.setBojaRacunala(JOptionPane.showInputDialog((i+1) + ". boja"));
			racunalo.setModelRacunala(JOptionPane.showInputDialog((i+1) + ". model"));
			racunalo.setVelicaRacunala(
					Integer.parseInt(
							JOptionPane.showInputDialog((i+1) + ". velicina")
							)
					);
			racunala[i]=racunalo;
		}
	}
	
	private void ispisiUcitano () {
		for(Racunalo racunalo: racunala) {
			System.out.println(racunalo.getBojaRacunala() +
					" " + racunalo.getModelRacunala());
		}
	}
	
	
	
	public static void main(String[] args) {
		new Program();
	}
	
}
