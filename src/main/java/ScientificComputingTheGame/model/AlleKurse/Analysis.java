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
	
	
	@Override
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
		return "Im Fach Analysis lernt man grundlegende Konzepte und Methoden. Unter "
				+ "anderem in den folgenden Bereichen: Reihen, Grundlagen der Logik "
				+ "und Beweisverfahren, Integration  und Differentiation sowie "
				+ "einige ihrer Anwendungen";
	}
}