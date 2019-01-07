package main.java.ScientificComputingTheGame.model.AlleKurse;
import java.util.ArrayList;
import main.java.ScientificComputingTheGame.model.Frage;
import main.java.ScientificComputingTheGame.model.Kurs;

public class DiskreteMathematik extends Kurs {
	public static final String name = "DiskreteMathematik";
	private final int anzahlZuBeantwortenderFragen;
	public static final String[][] alleFragen = {
			{"Aus was bestehen Graphen?", "A Knoten und Kanten, B Kreise und Linien, C Zahlen und Buchstaben, D Quadraten und Rechtecken", "A"}, 
			{"Wieviel ist 13 Modulo 5", "12, 3, 10, 0", "3"},
			{"Wieviel ist 2 Modulo 3", "1, 3, 5, 0", "5"},
			{"Wie nennt man einen Graphen den man ohne sich schneidende Kanten zeichnen kann?", "richtig, eulersch, diskret, plaettbar", "plaettbar"},
			{"Wie viele Farben braucht man um einen planaren Graphen (zum Beispiel eine Landkarte) zu faerben?", "4, 2, 6, 15", "4"}, 
			{"Wie viele Socken muss man mindestens aus einer Schublade mit 10 grauen und 10 schwarzen mindestens hohlen um ein gleichfarbiges Paar zu erhalten?", "2, 11, 20, 5", "11"},
			{"Wie vielen Moeglichkeiten gibt es 4 Kinder in einer Reihe aufzustellen", "4, 120, 24, 17", "24"}};
	public static final String beschreibung = "Nach abschliessend dieses Kurses koennen Studierende einfache "
			+ "Sachverhalte in der Sprache und mit den Modellen der Diskreten "
			+ "Mathematik formulieren. Zudem erhalten sie Einblicke in einfache "
			+ "Verschluesselungsalgorithmen, Graphenentheorie, Relationen, "
			+ "Permuationen und Rundungsfehler in der Gleitkommaarithmetik";

	public DiskreteMathematik() {
		super();
		anzahlZuBeantwortenderFragen = 2;
	}
	
	public ArrayList<Frage> getFragen() {
		fragen = new ArrayList<Frage>();
		ArrayList<Integer> zufaelligeFragen = new ArrayList<Integer>();
		int zufaelligeFrageID;
		Frage neueFrage;
		while(zufaelligeFragen.size() < anzahlZuBeantwortenderFragen) {
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
	
	public String getBeschreibung() {
		return beschreibung;
	}
}
