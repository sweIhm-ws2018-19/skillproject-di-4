package main.java.ScientificComputingTheGame.model;

import java.util.ArrayList;

public class ScientificComputingTheGame {
	static Spieler spieler;
	public static ArrayList<Kurs> offeneKurse;
	static String output = "Die Main wurde nicht ausgefuehrt";
	public static Frage gestellteFrage;
	public static Kurs kursDerFrage;
//	public static int anzahlGestellterFragen=0;
//	public static int anzahlRichtigBeantworteterFragen=0;
//	public static boolean istPruefungsFrage = false;
	
//	//Fuer den FrageStellenIntentHandler:
//	public static int getAnzahlGestellterFragen() {
//		return anzahlGestellterFragen;
//	}
//	public static int getAnzahlRichtigBeantworteterFragen() {
//		return anzahlRichtigBeantworteterFragen;
//	}
//	public static boolean getIstPruefungsFrage() {
//		return istPruefungsFrage;
//	}
//	public static void setAnzahlGestellterFragen(int value) {
//		anzahlGestellterFragen=value;
//	}
//	public static void setAnzahlRichtigBeantworteterFragen(int value) {
//		anzahlRichtigBeantworteterFragen=value;
//	}
//	public static void setIstPruefungsFrage(boolean value) {
//		istPruefungsFrage=value;
//	}
	
	
  
	public static void main(String args[]) {
		output = "Das Spiel wurde gestartet";
		offeneKurse = new ArrayList<Kurs>();
		spieler = new Spieler(1);
		//System.out.println(getFrage("SoftwareEntwicklung1"));
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
		kursDerFrage = spieler.getFrage(kursName);
		gestellteFrage = kursDerFrage.getFrage();
		String text=gestellteFrage.getFrage();
		return text;
	}
	
	public static Frage getAntwort() {
		return gestellteFrage;
	}
}