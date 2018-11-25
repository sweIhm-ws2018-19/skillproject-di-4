package main.java.ScientificComputingTheGame.model;

public class Spieler {
	public String name;
	public int semester;
	private int anzahlECTS;
	private int anzahlSemester;
	
	Spieler(String name) {
		this.name = name;
		anzahlECTS = 0;
		anzahlSemester = 0;
	}

	public int getECTS() {
		return anzahlECTS;
	}

	public void addECTS(int ECTS) {
		anzahlECTS += ECTS;
	}
}
