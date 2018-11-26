package main.java.ScientificComputingTheGame.model;

import java.util.ArrayList;

public class ScientificComputingTheGame {
	static Spieler spieler;
	
	public static void main(String args[]) {
		ArrayList<Kurs> offeneKurse = new ArrayList<Kurs>();
		spieler = new Spieler();
		studiumStarten(offeneKurse);
	}
	
	private static void studiumStarten(ArrayList<Kurs> offeneKurse) {
		Semester aktuellesSemester;
		int semesterID = 0;
		while(spieler.getECTS() < 210) {
			semesterID++;
			aktuellesSemester = new Semester(offeneKurse, semesterID);
			offeneKurse = aktuellesSemester.offeneKurse();
			spieler.addECTS(210);
		}
	}
}
