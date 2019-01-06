package main.java.ScientificComputingTheGame.model.AlleKurse;
import java.util.ArrayList;
import main.java.ScientificComputingTheGame.model.Frage;
import main.java.ScientificComputingTheGame.model.Kurs;

public class AWGeografie extends Kurs {
	public static final String name = "Geografie";
	private final int anzahlZuBeantwortenderFragen;
	public static final String[][] alleFragen = {
			{"Welche Himmlesrichtung gibt es nicht?", "A Osten, B Westen, C Norden, D Bosten", "D"}, 
			{"Durch welchen Ort verlaeuft der Nullmeridian?", "A Greenwich, B Berlin, C Oster Inseln, D Hochschule Muenchen", "A"},
			{"Wie werden Koordinaten angegeben?", " A in Celsius, B in Laengen und Breitengraden, C in Nautischen Meilen, D metern und Grad Celsius", "B"},
			{"Wie heisst der nordlichste Punkt der Erde?", " A Flensburg, B Nowograd, C Nordpol, D Australien", "C"},
			{"Wann entdechte Christoph Kolumbus Amerika?", "A 2003, B 1105, C 1956, D 1492", "D"},
			{"Welcher der Folgenden ist kein Kontinent?", " A Australien, B Japan, C Afrika, D Europa", "B"}};
	
	public static final String beschreibung = "Dies ist das A W Fach "
			+ "Geografie.";

	public AWGeografie() {
		super();
		anzahlZuBeantwortenderFragen = 2;
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
		return 2;
	}

	public String getBeschreibung() {
		return beschreibung;
	}
}