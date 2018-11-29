package main.java.ScientificComputingTheGame.model.AlleKurse;
import java.util.ArrayList;
import main.java.ScientificComputingTheGame.model.Frage;
import main.java.ScientificComputingTheGame.model.Kurs;

public class LineareAlgebra extends Kurs {
	private String name = "Lineare Algebra";
	private final int anzahlZuBeantwortenderFragen;

	public LineareAlgebra() {
		super();
		anzahlZuBeantwortenderFragen = 2;
	}
	
	public ArrayList<Frage> getFragen() {
		String[][] alleFragen = {
				{"Dies ist Frage 1 aus Lineare Algebra. Die Richtige Antwort ist A.", " A, B, C, D", "A"}, 
				{"Dies ist Frage 2 aus Lineare Algebra. Die Richtige Antwort ist A.", " A, B, C, D", "A"},
				{"Dies ist Frage 3 aus Lineare Algebra. Die Richtige Antwort ist A.", " A, B, C, D", "A"},
				{"Dies ist Frage 4 aus Lineare Algebra. Die Richtige Antwort ist A.", " A, B, C, D", "A"}};
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
}