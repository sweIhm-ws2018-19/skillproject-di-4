package main.java.ScientificComputingTheGame.model;

import java.util.ArrayList;

public class Spieler {
	public int semester;
	//Fuer den FrageStellenIntentHandler:
	public ArrayList<Kurs>offeneKurse = new ArrayList<Kurs>();
	public Semester fSemester;
	
	
	public Spieler(int semester) {
		this.semester = semester;
		fSemester = new Semester(offeneKurse,semester);
	}
	
	
	public boolean getSemesterBestanden() {
		boolean bestanden = fSemester.getSemesterBestanden();
		semester += 1;
		if (bestanden) {
			fSemester = new Semester(new ArrayList<Kurs>(),semester);
		}
		
		return bestanden;
	}
	
	public Kurs getFrage(String kursName) {
		return fSemester.getFrage(kursName);
	}
}
