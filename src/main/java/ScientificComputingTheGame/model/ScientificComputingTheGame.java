package main.java.ScientificComputingTheGame.model;

import java.util.ArrayList;

public class ScientificComputingTheGame {
	static Spieler spieler;
	public static ArrayList<Kurs> offeneKurse;
	static String output = "Die Main wurde nicht ausgefuehrt";
	public static Frage gestellteFrage;
	
	//Fuer den FrageStellenIntentHandler:
	
	
  
	public static void main(String args[]) {
		output = "Das Spiel wurde gestartet";
		offeneKurse = new ArrayList<Kurs>();
		spieler = new Spieler(1);
		
		//Eigentlich hier semester und nicht in Konstruktor von Spieler
		//System.out.println(getFrage("analysis"));
		//studiumStarten();
	}
	
	private static void studiumStarten() {
		Semester aktuellesSemester;
		int semesterID = 0;
		while(spieler.getECTS() < 210) {
			semesterID++;
			aktuellesSemester = new Semester(offeneKurse, semesterID);
			offeneKurse = aktuellesSemester.getOffeneKurse();
			spieler.addECTS(210); //For Testing
		}
	}
	
	public String getOutput() {
		return output;
	}
	
	public ArrayList<Kurs> getOffeneKurse() {
		return offeneKurse;
	}
	
	public static String getFrage(String kursName) {
		Frage frage = spieler.getFrage(kursName);
		gestellteFrage = frage;
		String text=frage.getFrage();
		//System.out.println(frage);
		return text;
	}
	
	public static Frage getAntwort() {
		return gestellteFrage;
	}
}