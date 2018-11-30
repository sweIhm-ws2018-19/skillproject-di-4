package main.java.ScientificComputingTheGame.model.AlleKurse;
import java.util.ArrayList;
import main.java.ScientificComputingTheGame.model.Frage;
import main.java.ScientificComputingTheGame.model.Kurs;

public class Analysis extends Kurs {
	private String name = "Analysis";
	private final int anzahlZuBeantwortenderFragen;

	public Analysis() {
		super();
		anzahlZuBeantwortenderFragen = 2; 
	}
	
	public ArrayList<Frage> getFragen() {
		String[][] alleFragen = {
				{"Dies ist Frage 1 aus Analysis. Die Richtige Antwort ist A.", " A, B, C, D", "A"}, 
				{"Dies ist Frage 2 aus Analysis. Die Richtige Antwort ist A.", " A, B, C, D", "A"},
				{"Dies ist Frage 3 aus Analysis. Die Richtige Antwort ist A.", " A, B, C, D", "A"},
				{"Dies ist Frage 4 aus Analysis. Die Richtige Antwort ist A.", " A, B, C, D", "A"}};
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
		return "Im Fach Analysis lernt man grundlegende Konzepte und Methoden. Unter "
				+ "anderem in den folgenden Bereichen: Reihen, Grundlagen der Logik "
				+ "und Beweisverfahren, Integration  und Differentiation sowie "
				+ "einige ihrer Anwendungen";
	}
}