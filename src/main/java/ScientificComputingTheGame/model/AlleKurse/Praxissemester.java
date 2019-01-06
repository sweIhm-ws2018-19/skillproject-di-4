package main.java.ScientificComputingTheGame.model.AlleKurse;
import java.util.ArrayList;
import main.java.ScientificComputingTheGame.model.Frage;
import main.java.ScientificComputingTheGame.model.Kurs;

public class Praxissemester extends Kurs {
	public static final String name = "Praxissemester";
	private final int anzahlZuBeantwortenderFragen;
	public static final String[][] alleFragen = {
			{"Was musst du am Ende deiner abgeleisteten 24 Wochen abgeben?", "A Nichts, B Ein Bericht, C Ein Bericht und eine Praesentation?, D Nur eine Praesentation. ", "C"}
	};

	public static final String beschreibung = "Im Fach Analysis lernt man grundlegende Konzepte und Methoden. Unter "
			+ "anderem in den folgenden Bereichen: Reihen, Grundlagen der Logik "
			+ "und Beweisverfahren, Integration  und Differentiation sowie "
			+ "einige ihrer Anwendungen";

	public Praxissemester() {
		super();
		anzahlZuBeantwortenderFragen = 1; 
	}
	
	@Override
	public ArrayList<Frage> getFragen() {
		fragen = new ArrayList<Frage>();
		ArrayList<Integer> zufaelligeFragen = new ArrayList<Integer>();
		int zufaelligeFrageID;
		Frage neueFrage;
		while(fragen.size() < anzahlZuBeantwortenderFragen) {
			zufaelligeFrageID = (int) (Math.random() * (alleFragen.length));
			if(!zufaelligeFragen.contains(zufaelligeFrageID)) {
				neueFrage = new Frage(alleFragen[zufaelligeFrageID]);
				fragen.add(neueFrage);
				}
			}
		return fragen;
	}
	
	@Override
	public int getAnzahlGestellterFragen() {
		return anzahlGestellterFragen;
	}
	
	@Override
	public int getAnzahlRichtigBeantworteterFragen() {
		return anzahlRichtigBeantworteterFragen;
	}

	@Override
	public boolean getIstPruefungsFrage() {
		return istPruefungsFrage;
	}

	@Override
	public void setAnzahlGestellterFragen(int value) {
		anzahlGestellterFragen=value;
	}

	@Override
	public void setAnzahlRichtigBeantworteterFragen(int value) {
		anzahlRichtigBeantworteterFragen = value;
	}

	@Override
	public void setIstPruefungsFrage(boolean value) {
		istPruefungsFrage = value;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getAnzahlZuBeantwortenderFragen() {
		return anzahlZuBeantwortenderFragen;
	}

	@Override
	public int getECTS() {
		return 5;
	}
	
	@Override
	public String getBeschreibung() {
		return beschreibung;
	}
}