package main.java.ScientificComputingTheGame.model.AlleKurse;
import java.util.ArrayList;
import main.java.ScientificComputingTheGame.model.Frage;
import main.java.ScientificComputingTheGame.model.Kurs;

public class DiskreteMathematik extends Kurs {
	private String name = "Diskrete Mathematik";
	private final int anzahlZuBeantwortenderFragen;

	public DiskreteMathematik() {
		super();
		anzahlZuBeantwortenderFragen = 2;
	}
	
	public ArrayList<Frage> getFragen() {
		String[][] alleFragen = {
				{"Aus was bestehen Graphen?", "Knoten und Kanten, Kreise und Linien, Zahlen und Buchstaben, Quadraten und Rechtecken", "Knoten und Kanten"}, 
				{"Wieviel ist 13 Modulo 5", "12, 3, 10, 0", "3"},
				{"Wieviel ist 2 Modulo 3", "1, 3, 5, 0", "5"},
				{"Wie nennt man einen Graphen den man ohne sich schneidende Kanten zeichnen kann?", "richtig, eulersch, diskret, plaettbar", "plaettbar"},
				{"Wie viele Farben braucht man um einen planaren Graphen (zum Beispiel eine Landkarte) zu faerben?", "4, 2, 6, 15", "4"}, 
				{"Wie viele Socken muss man mindestens aus einer Schublade mit 10 grauen und 10 schwarzen mindestens hohlen um ein gleichfarbiges Paar zu erhalten?", "2, 11, 20, 5", "11"},
				{"Wie vielen Moeglichkeiten gibt es 4 Kinder in einer Reihe aufzustellen", "4, 120, 24, 17", "24"}};
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
	
	public String getName() {
		return name;
	}

	public int getAnzahlZuBeantwortenderFragen() {
		return anzahlZuBeantwortenderFragen;
	}

	public int getECTS() {
		return 5;
	}

	public String getBeschreibung() {
		return "Nach abschliessend dieses Kurses koennen Studierende einfache "
				+ "Sachverhalte in der Sprache und mit den Modellen der Diskreten "
				+ "Mathematik formulieren. Zudem erhalten sie Einblicke in einfache "
				+ "Verschlüsselungsalgorithmen, Graphenentheorie, Relationen, "
				+ "Permuationen und Rundungsfehler in der Gleitkommaarithmetik";
	}
}