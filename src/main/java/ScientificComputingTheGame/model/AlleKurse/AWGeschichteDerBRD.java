package main.java.ScientificComputingTheGame.model.AlleKurse;
import java.util.ArrayList;
import main.java.ScientificComputingTheGame.model.Frage;
import main.java.ScientificComputingTheGame.model.Kurs;

public class AWGeschichteDerBRD extends Kurs {
	public static final String name = "Geschichte der BRD";
	private final int anzahlZuBeantwortenderFragen;
	public static final String[][] alleFragen = {
			{"Wann wurde die B R D gegruendet?", "A 1457, B 1949, C 1918, D 2003", "B"}, 
			{"Wie hiess der erste Bundeskanzler der BRD?", "A Friedrich Genscher, B Angela Bissmarck, C Johann Bach, D Konrad Adenauer", "D"},
			{"Wie heisst die Verfassung der BRD?", " A Grundgesetz, B Buergerliches Gesetzbuch, C Deutsche Verfassung, D AGB BRD AG", "A"},
			{"Wie viele Parteien stellten Bundeskanzler zwischen 1949 und 1990?", " A 2, B 4, C 1, D 5", "A"},
			{"In welcher Stadt tagte der Bundestag vor der Wiedervereinigung?", "A Hamburg, B Dresden, C Bonn, D Lindau", "C"},
			{"Welche Partei tratt nicht bei der Bundestagswahl 1961 an?", " A S P D, B C D U, C F D P, D die Gruenen", "D"}};
	
	public static final String beschreibung = "Dies ist das A W Fach "
			+ "Geschichte der Bundesrepublik Deutschland.";

	public AWGeschichteDerBRD() {
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
		return 2;
	}

	public String getBeschreibung() {
		return beschreibung;
	}
}