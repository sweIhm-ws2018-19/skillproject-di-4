package main.java.ScientificComputingTheGame.model;

import java.util.ArrayList;

public class ScientificComputingTheGame {
	static Spieler spieler;
	public static ArrayList<Kurs> offeneKurse;
	static String output = "Die Main wurde nicht ausgefuehrt";
	public static Frage gestellteFrage;
	public static Kurs kursDerFrage;
	public static int Semester = 1;
	
  
	public static void main(String args[]) {
		output = "Das Spiel wurde gestartet";
		offeneKurse = new ArrayList<Kurs>();
		spieler = new Spieler(Semester);
	}
	
	public static boolean getSemesterBestanden() {
		boolean bestanden = spieler.getSemesterBestanden();
		if (bestanden) {
			Semester += 1;
			spieler = new Spieler(Semester);
		}
			
		return bestanden;
	}
	
	public String getOutput() {
		return output;
	}
	
	public ArrayList<Kurs> getOffeneKurse() {
		return offeneKurse;
	}
	

	public static String getFrage(String kursName) {
		kursDerFrage = spieler.getFrage(kursName);
		gestellteFrage = kursDerFrage.getFrage();
		String text=gestellteFrage.getFrage();
		return text;
	}
	
	public static Frage getAntwort() {
		return gestellteFrage;
	}
}