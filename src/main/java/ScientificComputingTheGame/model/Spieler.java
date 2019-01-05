package main.java.ScientificComputingTheGame.model;

import java.util.ArrayList;

public class Spieler {
	public int semester;
	private int anzahlECTS;
	//Fuer den FrageStellenIntentHandler:
	public ArrayList<Kurs>offeneKurse = new ArrayList<Kurs>();
	public Semester momentanesSemester;
	
	public Spieler(int semester) {
		anzahlECTS = 0;
		this.semester = semester;
		momentanesSemester = new Semester(offeneKurse,semester);
	}
		
	public Kurs getFrage(String kursName) {
		return momentanesSemester.getFrage(kursName);
	}

	public int getECTS() {
		return anzahlECTS;
	}

	public void addECTS(int ECTS) {
		anzahlECTS += ECTS;
	}
}
