package main.java.ScientificComputingTheGame.model.AlleKurse;
import java.util.ArrayList;
import main.java.ScientificComputingTheGame.model.Frage;
import main.java.ScientificComputingTheGame.model.Kurs;

public class ITSysteme1 extends Kurs {
	private String name = "IT-Systeme 1";
	private final int anzahlZuBeantwortenderFragen;

	public ITSysteme1() {
		super();
		anzahlZuBeantwortenderFragen = 2;
	}
	
	public ArrayList<Frage> getFragen() {
		String[][] alleFragen = {
				{"Welche Dezimalzahl entspricht die folgende vierstellige Binaerzahl? 1 0 1 0", "18, 0, 215, 10", "10"},
				{"Welche Dezimalzahl entspricht die folgende vierstellige Binaerzahl? 1 1 1 1", "15, -7, 98, 8", "15"},
				{"Welche Dezimalzahl entspricht die folgende vierstellige Hexadezimalzahl? 12", "29, 18, 0, 178", "18"},
				{"Welche Dezimalzahl entspricht die folgende vierstellige Hexadezimalzahl? B", "29, 18, 11, 2", "11"}};
		fragen = new ArrayList<Frage>();
		ArrayList<Integer> zufaelligeFragen = new ArrayList<Integer>();
		int zufaelligeFrageID;
		Frage neueFrage;
		while(zufaelligeFragen.size() < anzahlZuBeantwortenderFragen) {
			zufaelligeFrageID = (int) (Math.random() * (alleFragen.length));
			if(!zufaelligeFragen.contains(zufaelligeFrageID)) {
				neueFrage = new Frage(alleFragen[zufaelligeFrageID]);
				fragen.add(neueFrage);
				}
			}
		return fragen;
	}
	
	public String getName() {
		return name;
	}

	public int getAnzahlZuBeantwortenderFragen() {
		return anzahlZuBeantwortenderFragen;
	}

	public int getECTS() {
		return 5;
	}

	public String getBeschreibung() {
		return "In IT Systeme 1 lernt man Grundlagen ueber den Aufbau und die "
				+ "Funktionsweisen moderner IT Systeme. Dabei werden unter anderm "
				+ "die Themenbereiche Informationsdarstellung, einfache "
				+ "Datenstrukturen, Ablaufsteuerung, Grundlagen der Programmierung "
				+ "auf Maschinenebene und Informationsdarstellung behandelt. "
				+ "Schliesslich sollen fundierte Kentnisse ueber den Aufbau und die "
				+ "Gemeinsamkeiten moderner Computer erlangt werden.";
	}
}