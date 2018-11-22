package main.java.ScientificComputingTheGame.model.AlleKurse;
import java.util.ArrayList;

import main.java.ScientificComputingTheGame.model.Fragen;
import main.java.ScientificComputingTheGame.model.Kurs;
import main.java.ScientificComputingTheGame.model.AlleFragen.SoftwareEntwicklung1Frage1;
import main.java.ScientificComputingTheGame.model.AlleFragen.SoftwareEntwicklung1Frage2;

public class SoftwareEntwicklung1 extends Kurs{
	private String name = "Software Entwicklung 1";
	private int anzahlFragen = 2;
	private Fragen[] alleFragen = new Fragen[anzahlFragen];

	SoftwareEntwicklung1() {
		super();
	}
	
	public void alleFragenErzeugen() {
		alleFragen[0] = new SoftwareEntwicklung1Frage1();
		alleFragen[1] = new SoftwareEntwicklung1Frage2();
	}
	
	public int getAnzahlFragen() {
		return anzahlFragen;
	}
	
	public ArrayList<Fragen> getFragen() {
		fragen = new ArrayList<Fragen>();
		while (fragen.size() < anzahlFragen) {
			int indexDerFrage = (int) (Math.random() * (anzahlFragen));
			if (alleFragen[indexDerFrage].getAktiv()) {
				fragen.add(alleFragen[indexDerFrage]);
				alleFragen[indexDerFrage].aktivSchalten();
			}
		}
		return fragen;
	}
	public String getName() {
		return name;
	}
}
