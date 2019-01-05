package main.java.ScientificComputingTheGame.model.AlleKurse;
import java.util.ArrayList;
import main.java.ScientificComputingTheGame.model.Frage;
import main.java.ScientificComputingTheGame.model.Kurs;

public class SoftwareEntwicklung1 extends Kurs {

	public static final String name = "SoftwareEntwicklung1";
	private final int anzahlZuBeantwortenderFragen;
	public static final String[][] alleFragen = {
			{"Mit dem Modifier final wird eine einzige Wertzuweisung an eine Variable akzeptiert. Jede weitere wird als Fehler abgelehnt. ", "A Ja, B Nein", "A"}, 
			{"Selbstentwickelte Klassen sind in Java immer implizit von der Basisklasse java.lang.Object abgeleitet.", "A Ja, B Nein", "A"},
			{"Was gibt die Methode int m int a zurueck, wenn sie aufgerufen wird mit m()?", "A Syntaxfehler, B null, C eine Exception, D ein String Array", "D"},
			{"Was kann die main Methode nicht?", "A neue Objekte der eigenen Klasse anlegen, B normale eigene Methoden aufrufen, C Ein Interface implementieren, D Variablen neue Werte zuweisen", "C"},
			{"Eine lokale Variable (einer Methode) muss definiert werden", "A zu Beginn der Methode, B an beliebiger Stelle im Methodenrumpf unabhaengig von der Nutzung, C vor der ersten Nutzung", "C"},
			{"Der Operator ist gleich ist gleich vergleicht zwei Objekte hinsichtlich ihrer Identitaet.", "A Ja, B Nein", "A"},
			{"Jede For Schleife kann in eine While Schleife umgewandelt werden.", "A Ja, B Nein", "A"},
			{"Zwei Objekte sind identisch, wenn ihre Datenwerte uebereinstimmen.", "A Ja, B Nein", "A"}};
	public static final String beschreibung = "In Softwareentwicklung 1 erhalten die Studierenden eine Einfuehrung "
			+ "in die Programmiersprache Java. In mehreren Abgaben und "
			+ "Uebungsprojekten werden Schleifen, primitive Datentypen, "
			+ "Klassen, Methoden und Vererbung eingeuebt. Schliesslich koennen "
			+ "die Studierenden das Erworbene Grundwissen ueber Java in "
			+ "Softwareentwicklung 2 noch weiter ausbauen.";

	public SoftwareEntwicklung1() {
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
		return 8;
	}

	@Override
	public String getBeschreibung() {
		return beschreibung;
	}
}