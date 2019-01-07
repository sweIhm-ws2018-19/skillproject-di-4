package main.java.ScientificComputingTheGame.model.AlleKurse;
import java.util.ArrayList;
import main.java.ScientificComputingTheGame.model.Frage;
import main.java.ScientificComputingTheGame.model.Kurs;

public class MKB extends Kurs {
	public static final String name = "MKB";
	private final int anzahlZuBeantwortenderFragen;
	public static final String[][] alleFragen = {
			{"'Es existiert ein x, fuer das gilt' und 'fuer jedes x gilt' sind ","A-Operatoren, B-Junktoren, C-Quantoren oder D-Iteratoren","C"}};
	
	public static final String beschreibung = "Bei Mathematische Konzepte und Beweise dreht sich alles um Logik "
			+ "und Beweise. Im Fokus steht dabei die Einfuehrung neuer "
			+ "Studierender in die Denkweisen dieses Bereichs. Behandelt werden "
			+ "unter anderem Beweistechniken wie Beweise durch Widerspruch und "
			+ "Teilbarkeitsbeweise.";

	public MKB() {
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