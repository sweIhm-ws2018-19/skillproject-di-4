package main.java.ScientificComputingTheGame.model.AlleKurse;
import java.util.ArrayList;
import main.java.ScientificComputingTheGame.model.Frage;
import main.java.ScientificComputingTheGame.model.Kurs;

public class AngewandteMathematik extends Kurs {
	public static final String name = "AngewandteMathematik";
	private final int anzahlZuBeantwortenderFragen;
	public static final String[][] alleFragen = {
			{"Was ist ein Perceptron?", "Ein machine learning Algorithmus, Ein Logikgatter, ein mathematisches Problem, ein Problem ohne Loesung", "Ein machine learning Algorithmus"}, 
			{"Welche Programmiersprache hat die zu Sage Math aehnlichste Syntax?", "P H P, Python, C, Java Script", "Python"}};
	
	public static final String beschreibung = "Nach Abschluss diese Faches sollen die Studierenden in der Lage "
			+ "sein, einfache mathematische Modelle fuer praktische "
			+ "Problemstellungen zu entwickeln, diese mit Hilfe eines "
			+ "Computeralgebrasystems zu loesen und die so erarbeiteten "
			+ "Ergebnisse zu interpretieren, zu visualisieren und zu "
			+ "praesentieren. Zunaechst findet fuer die Studierenden eine kurze "
			+ "Einfuehrung in das Computer Algebrasystem Sage Math statt. "
			+ "Anschliessend loesen die Studierenden vier kleine und eine grosse "
			+ "Gruppenarbeit aus der Mathematik mithilfe von Sage Math. "
			+ "Besonderes Augenmerk liegt dabei auch darauf die Faehigkeiten zu "
			+ "problemloesenden Denken, wissenschaftlich zu arbeiten,eigene "
			+ "Ergebnisse darzustellen und zu vermitteln und die Teamfaehigkeit "
			+ "zu staerken.";
	
	public AngewandteMathematik() {
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

