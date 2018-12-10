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
				{"Wofuer stehen L und U bei der L U zerlegung?", "Ludwig Unger Methode, Lower und Upper Matrix, Loewe und Uhu Matrix, Lettland und Ungarn", "Lower und Upper Matrix"}};
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
}