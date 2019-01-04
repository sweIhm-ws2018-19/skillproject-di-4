package main.java.ScientificComputingTheGame.model.AlleKurse;
import java.util.ArrayList;
import main.java.ScientificComputingTheGame.model.Frage;
import main.java.ScientificComputingTheGame.model.Kurs;

public class Analysis extends Kurs {
	private String name = "Analysis";
	private final int anzahlZuBeantwortenderFragen;
	public static final String[][] alleFragen = {
			{"Wie lautet die Ableitung von e hoch x?", "A e, B 2 e hoch 3, C e hoch x, D x hoch e", "C"}, 
			{"Wie lautet die Ableitung von Sinus 2 x?", "A 2 mal Cosinus 2 x, B Cosinus x, C Sinus x, D 2 mal Sinus 2 x", "A"},
			{"Wie lautet die Ableitung von 3 Cosinus 2 x?", "A minus 6 Sinus 2 x, B 3 Sinus 6 x, C minus Sinus 2 x, D 6 Cosinus 2x", "A"},
			{"Wie lautet die Ableitung von 2 e hoch x?", "A e, B 2 e hoch 3, C 2 e hoch x, D x hoch e", "B"}, 
			{"Wie lautet die Ableitung von Sinus x mal Cosinus x?", "A 3 Sinus x, B Cosinus von x hoch 2 minus Sinus von x hoch 2, C Sinus x + Cosinus x, D 2 mal Sinus 2 x", "B"},
			{"Wie lautet die Ableitung von Cosinus 3 x?", "A minus 6 Sinus 2 x, B 3 Sinus 6 x, C minus Sinus 2 x, D - 3 Sinus 3 x", "D"},
			{"Wie lautet das Integral von e hoch x", "A e hoch 2 x, B x hoch e, C e hoch x plus x hoch e, D e hoch x", "D"},
			{"Wie lautet das Integral von 3 x plus 7?","A 3 x, B 10 x, C 3 x Quadrat plus 7 x, D 0","C"},
			{"Wie lautet das Integral von Sinus x?", "A minus Cosinus x, B minus Cosinus x , C Sinus x hoch 2, D 15 Sinus x mal Cosinus x", "B"},
			{"Wie lautet das Integral von 5 Cosinus x?", "A 5 Sinus x, B Cosinus 5 x C x mal Sinus von 5, D 5 mal x Cosinus 5 mal x", "A"}};

	public Analysis() {
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
	
	@Override
	public String getBeschreibung() {
		return "Im Fach Analysis lernt man grundlegende Konzepte und Methoden. Unter "
				+ "anderem in den folgenden Bereichen: Reihen, Grundlagen der Logik "
				+ "und Beweisverfahren, Integration  und Differentiation sowie "
				+ "einige ihrer Anwendungen";
	}
}