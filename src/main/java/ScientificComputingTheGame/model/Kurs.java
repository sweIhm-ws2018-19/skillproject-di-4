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

	public int anzahlGestellterFragen=0;
	public int anzahlRichtigBeantworteterFragen=0;
	public boolean istPruefungsFrage = false;
	
	//Fuer den FrageStellenIntentHandler:
	public abstract int getAnzahlGestellterFragen();
	public abstract int getAnzahlRichtigBeantworteterFragen();
	public abstract boolean getIstPruefungsFrage();
	public abstract void setAnzahlGestellterFragen(int value);
	public abstract void setAnzahlRichtigBeantworteterFragen(int value);
	public abstract void setIstPruefungsFrage(boolean value);

	protected Kurs() {
		bestanden = false;
		anzahlRichtigBeantworteteFragen = 0;
		fragen = getFragen();

		//pruefungBeginnen();
		//pruefungBewerten();
	}
	
	public Frage getFrage() {
		fragen=getFragen();
		int next=fragen.size()-1;
		Random r = new Random();
		int pos=r.nextInt(next);
		return fragen.get(pos);
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
