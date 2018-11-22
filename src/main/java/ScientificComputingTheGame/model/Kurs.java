package main.java.ScientificComputingTheGame.model;

import java.util.ArrayList;

public abstract class Kurs {
	private boolean bestanden;
	private int anzahlRichtigBeantworteteFragen;
	protected ArrayList<Fragen> fragen;
	protected ArrayList<Fragen> alleFragen;
	
	public abstract ArrayList<Fragen> alleFragenErzeugen();
	public abstract int getAnzahlFragen();
	
	protected Kurs() {
		bestanden = false;
		anzahlRichtigBeantworteteFragen = 0;
		alleFragenErzeugen();
		alleFragen = alleFragenErzeugen();
		fragen = getFragen();
		pruefungBeginnen();
		pruefungBewerten();
	}
	public ArrayList<Fragen> getFragen() {
		fragen = new ArrayList<Fragen>();
		while (fragen.size() < alleFragen.size()) {
			int indexDerFrage = (int) (Math.random() * (alleFragen.size()));
			if (alleFragen.get(indexDerFrage).getAktiv()) {
				fragen.add(alleFragen.get(indexDerFrage));
				alleFragen.get(indexDerFrage).aktivSchalten();
			}
		}
		return fragen;
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
