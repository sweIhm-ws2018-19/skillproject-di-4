package main.java.ScientificComputingTheGame.model;

import java.util.ArrayList;

public class ScientificComputingTheGame {
	static Spieler spieler;
	public static ArrayList<Kurs> offeneKurse;
	static String output = "Die Main wurde nicht ausgefuehrt";
  
	public static void main(String args[]) {
		output = "Das Spiel wurde gestartet";
		offeneKurse = new ArrayList<Kurs>();
		spieler = new Spieler();
		studiumStarten();
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
	
	;
	
}