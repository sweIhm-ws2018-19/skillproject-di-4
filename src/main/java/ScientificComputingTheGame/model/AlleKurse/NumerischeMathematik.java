package main.java.ScientificComputingTheGame.model.AlleKurse;

import java.util.ArrayList;
import main.java.ScientificComputingTheGame.model.Frage;
import main.java.ScientificComputingTheGame.model.Kurs;

public class NumerischeMathematik extends Kurs {
	public static final String name = "NumerischeMathematik";
	private final int anzahlZuBeantwortenderFragen;
	public static final String[][] alleFragen = { { "Frage 1 Numerische Mathematik", "Ja, Nein", "Ja" },
			{ "Frage 2 Numerische Mathematik", "Ja, Nein", "Ja" } };
	public static final String beschreibung = "TODO dieser Text fehlt";

	public NumerischeMathematik() {
		super();
		anzahlZuBeantwortenderFragen = 2;
	}

	public ArrayList<Frage> getFragen() {
		fragen = new ArrayList<Frage>();
		ArrayList<Integer> zufaelligeFragen = new ArrayList<Integer>();
		int zufaelligeFrageID;
		Frage neueFrage;
		while (zufaelligeFragen.size() < anzahlZuBeantwortenderFragen) {
			zufaelligeFrageID = (int) (Math.random() * (alleFragen.length));
			if (!zufaelligeFragen.contains(zufaelligeFrageID)) {
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
		anzahlGestellterFragen = value;
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

	public String getBeschreibung() {
		return beschreibung;
	}
}