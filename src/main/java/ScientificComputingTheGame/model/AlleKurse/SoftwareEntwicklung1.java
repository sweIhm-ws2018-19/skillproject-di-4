package main.java.ScientificComputingTheGame.model.AlleKurse;
import java.util.ArrayList;
import main.java.ScientificComputingTheGame.model.Frage;
import main.java.ScientificComputingTheGame.model.Kurs;

public class SoftwareEntwicklung1 extends Kurs {

	private String name = "SoftwareEntwicklung1";
	private final int anzahlZuBeantwortenderFragen;

	public SoftwareEntwicklung1() {
		super();
		anzahlZuBeantwortenderFragen = 2;
	}
	
	@Override
	public ArrayList<Frage> getFragen() {
		String[][] alleFragen = {
				{"Mit dem Modifier final wird eine einzige Wertzuweisung an eine Variable akzeptiert. Jede weitere wird als Fehler abgelehnt. ", "Ja, Nein", "Ja"}, 
				{"Selbstentwickelte Klassen sind in Java immer implizit von der Basisklasse java.lang.Object abgeleitet.", "Ja, Nein", "Ja"},
				{"Was gibt die Methode int m int a zurueck, wenn sie aufgerufen wird mit m()?", "Syntaxfehler, null, eine Exception, ein String Array", "Syntaxfehler"},
				{"Was kann die main Methode nicht?", "neue Objekte der eigenen Klasse anlegen, normale eigene Methoden aufrufen, Ein Interface implementieren, Variablen neue Werte zuweisen", "Ein Interface implementieren"},
				{"Eine lokale Variable (einer Methode) muss definiert werden", "zu Beginn der Methode, an beliebiger Stelle im Methodenrumpf unabhaengig von der Nutzung, vor der ersten Nutzung", "vor der ersten Nutzung"},
				{"Der Operator ist gleich ist gleich vergleicht zwei Objekte hinsichtlich ihrer Identitaet.", "Ja, Nein", "Ja"},
				{"Jede For Schleife kann in eine While Schleife umgewandelt werden.", "Ja, Nein", "Ja"},
				{"Zwei Objekte sind identisch, wenn ihre Datenwerte uebereinstimmen.", "Ja, Nein", "Ja"}};
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

	public String getBeschreibung() {
		return "In Softwareentwicklung 1 erhalten die Studierenden eine Einfuehrung "
				+ "in die Programmiersprache Java. In mehreren Abgaben und "
				+ "Uebungsprojekten werden Schleifen, primitive Datentypen, "
				+ "Klassen, Methoden und Vererbung eingeuebt. Schliesslich koennen "
				+ "die Studierenden das Erworbene Grundwissen ueber Java in "
				+ "Softwareentwicklung 2 noch weiter ausbauen.";
	}
}