package main.java.ScientificComputingTheGame.model;

public class Spieler {
	//public String name;
	public int semester;
	private int anzahlECTS;
	private int anzahlSemester;
	
	Spieler() {
		//name = nachNamenFragen();
		anzahlECTS = 0;
		anzahlSemester = 0;
	}

	/*private String nachNamenFragen() {
		// TODO Nutzer nach Namen fragen
		return null;
	}*/

	public int getECTS() {
		return anzahlECTS;
	}

	public void addECTS(int ECTS) {
		anzahlECTS += ECTS;
	}
}
