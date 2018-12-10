package main.java.ScientificComputingTheGame.model;

import java.util.ArrayList;

public class Spieler {
	//public String name;
	public int semester;
	private int anzahlECTS;
	private int anzahlSemester;
	//Fuer den FrageStellenIntentHandler:
	public ArrayList<Kurs>offeneKurse = new ArrayList<Kurs>();
	public Semester fSemester;
	
	Spieler(int semester) {
		//name = nachNamenFragen();
		anzahlECTS = 0;
		anzahlSemester = 0;
		this.semester = semester;
		fSemester = new Semester(offeneKurse,semester);
	}
	
	
		

	/*private String nachNamenFragen() {
		// TODO Nutzer nach Namen fragen
		return null;
	}*/
	
	public Kurs getFrage(String kursName) {
		return fSemester.getFrage(kursName);
	}

	public int getECTS() {
		return anzahlECTS;
	}

	public void addECTS(int ECTS) {
		anzahlECTS += ECTS;
	}
}
