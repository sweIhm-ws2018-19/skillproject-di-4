package main.java.ScientificComputingTheGame.model;

import java.util.ArrayList;

public abstract class Kurs {
	private boolean bestanden;
	private int anzahlRichtigBeantworteteFragen;
	protected ArrayList<Frage> fragen;
	private String momentaneAntwort;
	
	public abstract int getAnzahlZuBeantwortenderFragen();
	public abstract ArrayList<Frage> getFragen();

	protected Kurs() {
		bestanden = false;
		anzahlRichtigBeantworteteFragen = 0;
		fragen = getFragen();
		pruefungBeginnen();
		pruefungBewerten();
	}
	
	public void pruefungBeginnen() {
		for(Frage a: fragen) {
			a.frageStellen();
			momentaneAntwort = a.antwortAbwarten();
			if (a.antwortRichtig(momentaneAntwort)) {
				anzahlRichtigBeantworteteFragen++;
			}
		}
	}
	
	public void pruefungBewerten() {
		if (anzahlRichtigBeantworteteFragen >= getAnzahlZuBeantwortenderFragen()/2) {
			bestanden = true;
			kursBeenden();
		}
		else {
			kursWiederholen();
			//TODO repeat test???
		}
	}
	
	protected void kursBeenden() {
		// TODO Alexa says "Herzlichen Gluekwunsch. Du hast den Kurs getName() bestanden"
	}
	
	protected void kursWiederholen() {
		// TODO Alexa says "Leider hast du den Kurs getName() nicht bestanden."
	}
}
