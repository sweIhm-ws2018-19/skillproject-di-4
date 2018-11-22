package main.java.ScientificComputingTheGame.model;

import java.util.ArrayList;

public abstract class Kurs {
	private boolean bestanden;
	private int anzahlRichtigBeantworteteFragen;
	protected ArrayList<Fragen> fragen;
	
	public abstract void alleFragenErzeugen();
	public abstract ArrayList<Fragen> getFragen();
	public abstract int getAnzahlFragen();
	
	protected Kurs() {
		bestanden = false;
		anzahlRichtigBeantworteteFragen = 0;
		alleFragenErzeugen();
		fragen = getFragen();
		pruefungBeginnen();
		pruefungBewerten();
	}
	
	public void pruefungBeginnen() {
		for(Fragen a: fragen) {
			a.frageBeginnen();
			a.antwortAbwarten();
			if (a.antwortRichtig("")) {
				anzahlRichtigBeantworteteFragen++;
			}
		}
	}
	public void pruefungBewerten() {
		if (anzahlRichtigBeantworteteFragen >= getAnzahlFragen()/2) {
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
