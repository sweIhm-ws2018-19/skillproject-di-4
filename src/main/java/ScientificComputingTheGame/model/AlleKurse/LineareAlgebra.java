package main.java.ScientificComputingTheGame.model.AlleKurse;
import java.util.ArrayList;
import main.java.ScientificComputingTheGame.model.Frage;
import main.java.ScientificComputingTheGame.model.Kurs;

public class LineareAlgebra extends Kurs {
	private String name = "LineareAlgebra";
	private final int anzahlZuBeantwortenderFragen;

	public LineareAlgebra() {
		super();
		anzahlZuBeantwortenderFragen = 2;
	}
	
	@Override
	public ArrayList<Frage> getFragen() {
		String[][] alleFragen = {
				{"Was erhaelt man wenn man einen Zeilenvektor transponiert?", "einen Zeilenvektor, einen Spaltenvektor, eine Matrix, die Einheitsmatrix", "einen Spaltenvektor"}, 
				{"Was erhaelt man wenn man einen Zeilenvektor mit einem Spaltenvektor multipliziert?", "einen Zeilenvektor, einen Spaltenvektor, eine Matrix, die Einheitsmatrix", "eine Matrix"},
				{"Wofuer stehen L und U bei der L U zerlegung?", "Ludwig Unger Methode, Lower und Upper Matrix, Loewe und Uhu Matrix, Lettland und Ungarn", "Lower und Upper Matrix"},
				{"Was ist der Rang einer Matrix?", "Die Anzahl der Zeilen, Die Anzahl der Spalten, Die Anzahl der Zeilen, Die Anzahl der liear unabhaengigen Zeilen und Spalten", "Die Anzahl der Zeilen, Die Anzahl der liear unabhaengigen Zeilen und Spalten"},
				{"Was ist die Determinante der 4 Kreuz 4 Einheitsmatix?", "4, 1, 16, 0", "1"},
				{"Was ist das quadrat der komplexen Zahl i?", "minus 1, 1, 0, nicht definiert", "minus 1"},
				{"Gegeben ist das Gleichungssystem 3 mal x plus 2 y ist gleich 10 und 6 mal x plus 4 mal y ist gleich z. Fuer welchen Wert von z hat das System keine Loesung?", "", "10"},
				{"Gegeben ist das Gleichungssystem 3 mal x plus 2 y ist gleich 10 und 6 mal x plus 4 mal y ist gleich z. Fuer welchen Wert von z hat das System unendlich viele Loesungen?", "", "10"}};
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
		return "Im Kurs Lineare Algebra lernen die Studierenden wichtige "
				+ "grundlegende Begriffe und Methoden die sie unter anderem in der "
				+ "Numerik benoetigen. Behandelt werden unter anderem Vektorraeume, "
				+ "lineare Gleichungssysteme, Skalarprodukt, Eigenwerte und L U "
				+ "Zerlegung.";
	}
}