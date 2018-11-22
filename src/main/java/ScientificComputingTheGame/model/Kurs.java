package main.java.ScientificComputingTheGame.model;

import java.util.ArrayList;

public abstract class Kurs {
	private boolean bestanden;
	private int anzahlRichtigBeantworteteFragen;
	protected ArrayList<Fragen> fragen;
	private String momentaneAntwort;
	
	public abstract int getAnzahlZuBeantwortenderFragen();
	public abstract ArrayList<Fragen> getFragen();

	protected Kurs() {
		bestanden = false;
		anzahlRichtigBeantworteteFragen = 0;
		fragen = getFragen();
		pruefungBeginnen();
		pruefungBewerten();
	}
	public void pruefungBeginnen() {
		for(Fragen a: fragen) {
			a.frageBeginnen();
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
			//TODO repeat test???
		}
	}
	protected void kursBeenden() {
		// TODO Alexa says "Herzlichen Gluekwunsch. Du hast den Kurs getName() bestanden"
	}
}
