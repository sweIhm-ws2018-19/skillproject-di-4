package main.java.ScientificComputingTheGame.model.AlleKurse;
import java.util.ArrayList;
import main.java.ScientificComputingTheGame.model.Frage;
import main.java.ScientificComputingTheGame.model.Kurs;

public class LineareAlgebra extends Kurs {
	public static final String name = "LineareAlgebra";
	private final int anzahlZuBeantwortenderFragen;
	public static final String[][] alleFragen = {
			{"Was erhaelt man wenn man einen Zeilenvektor transponiert?", "einen Zeilenvektor, einen Spaltenvektor, eine Matrix, die Einheitsmatrix", "Spaltenvektor"}, 
			{"Was erhaelt man wenn man einen Zeilenvektor mit einem Spaltenvektor multipliziert?", "einen Zeilenvektor, einen Spaltenvektor, eine Matrix, die Einheitsmatrix", "Matrix"},
			{"Wofuer stehen L und U bei der L U zerlegung?", "A: Ludwig Unger Methode, B: Lower und Upper Matrix, C: Loewe und Uhu Matrix, D: Lettland und Ungarn", "B"},
			{"Was ist der Rang einer Matrix?", "A: Die Anzahl der Zeilen, B: Die Anzahl der Spalten, C: Die Anzahl der Zeilen, D: Die Anzahl der liear unabhaengigen Zeilen und Spalten", "D"},
			{"Was ist die Determinante der 4 Kreuz 4 Einheitsmatix?", "4, 1, 16, 0", "Eins"},
			{"Was ist das quadrat der komplexen Zahl i?", "A: minus 1, B: 1, C: 0, D: nicht definiert", "A"},
			{"Gegeben ist das Gleichungssystem 3 mal x plus 2 y ist gleich 10 und 6 mal x plus 4 mal y ist gleich z. Fuer welchen Wert von z hat das System keine Loesung?", "", "zehn"},
			{"Gegeben ist das Gleichungssystem 3 mal x plus 2 y ist gleich 10 und 6 mal x plus 4 mal y ist gleich z. Fuer welchen Wert von z hat das System unendlich viele Loesungen?", "", "zehn"}};
	public static final String beschreibung = "Im Kurs Lineare Algebra lernen die Studierenden wichtige "
			+ "grundlegende Begriffe und Methoden die sie unter anderem in der "
			+ "Numerik benoetigen. Behandelt werden unter anderem Vektorraeume, "
			+ "lineare Gleichungssysteme, Skalarprodukt, Eigenwerte und L U "
			+ "Zerlegung.";

	public LineareAlgebra() {
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
		return 5;
	}
	
	public String getBeschreibung() {
		return beschreibung;
	}
}