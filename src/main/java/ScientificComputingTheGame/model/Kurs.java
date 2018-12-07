package main.java.ScientificComputingTheGame.model;

import java.util.*;

public abstract class Kurs {
	private boolean bestanden;
	private int anzahlRichtigBeantworteteFragen;
	protected ArrayList<Frage> fragen;
	private String momentaneAntwort;
	
	public abstract int getAnzahlZuBeantwortenderFragen();
	public abstract String getName();
	public abstract ArrayList<Frage> getFragen();
	public abstract int getECTS();

	protected Kurs() {
		bestanden = false;
		anzahlRichtigBeantworteteFragen = 0;
		fragen = getFragen();
		System.out.println(fragen.size());

		//pruefungBeginnen();
		//pruefungBewerten();
	}
	
	public String getFrage() {
		int next=fragen.size()-1;
		System.out.println(next);
		Random r = new Random();
		int pos=r.nextInt(next);
		return fragen.get(pos).getFrage();
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
	}
	
	protected void kursBeenden() {
		// TODO Alexa says "Herzlichen Gluekwunsch. Du hast den Kurs getName() bestanden"
	}
	
	protected void kursWiederholen() {
		// TODO Alexa says "Leider hast du den Kurs getName() nicht bestanden."
	}
	
	public boolean getBestanden() {
		return bestanden;
	}
}
