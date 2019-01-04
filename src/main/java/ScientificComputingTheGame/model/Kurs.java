package main.java.ScientificComputingTheGame.model;

import java.util.*;

public abstract class Kurs {
	private boolean bestanden;
	private int anzahlRichtigBeantworteteFragen;
	protected ArrayList<Frage> fragen;
	private String momentaneAntwort;
	public int anzahlGestellterFragen=0;
	public int anzahlRichtigBeantworteterFragen=0;
	public boolean istPruefungsFrage = false;
	
	public abstract ArrayList<Frage> getFragen();
	public abstract int getAnzahlGestellterFragen();
	public abstract int getAnzahlRichtigBeantworteterFragen();
	public abstract boolean getIstPruefungsFrage();
	public abstract void setAnzahlGestellterFragen(int value);
	public abstract void setAnzahlRichtigBeantworteterFragen(int value);
	public abstract void setIstPruefungsFrage(boolean value);
	public abstract String getName();
	public abstract int getAnzahlZuBeantwortenderFragen();
	public abstract int getECTS();
	public abstract String getBeschreibung();
	
	protected Kurs() {
		bestanden = false;
		anzahlRichtigBeantworteteFragen = 0;
		fragen = getFragen();
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
		}
	}
	
	public boolean getBestanden() {
		return bestanden;
	}
}