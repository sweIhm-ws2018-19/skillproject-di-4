package main.java.ScientificComputingTheGame.model.AlleKurse;
import java.util.ArrayList;

import main.java.ScientificComputingTheGame.model.Fragen;
import main.java.ScientificComputingTheGame.model.Kurs;
import main.java.ScientificComputingTheGame.model.AlleFragen.SoftwareEntwicklung1Frage1;
import main.java.ScientificComputingTheGame.model.AlleFragen.SoftwareEntwicklung1Frage2;
import main.java.ScientificComputingTheGame.model.AlleFragen.SoftwareEntwicklung1Frage3;

public class SoftwareEntwicklung1 extends Kurs{
	private String name = "Software Entwicklung 1";
	private int anzahlZuBeantwortenderFragen;
	private int anzahlAllerFragen;

	SoftwareEntwicklung1() {
		super();
		anzahlZuBeantwortenderFragen = 2;
		anzahlAllerFragen = 3;
	}
	
	public ArrayList<Fragen> getFragen() {
		fragen = new ArrayList<Fragen>();
		ArrayList<Integer> zufaelligeFragen = new ArrayList<Integer>();
		int zufaelligeFrageID;
		while(zufaelligeFragen.size() < anzahlZuBeantwortenderFragen) {
			zufaelligeFrageID = (int) (Math.random() * (anzahlAllerFragen));
			if(!zufaelligeFragen.contains(zufaelligeFrageID)) {
				switch(zufaelligeFrageID) {
				case 0:
		            fragen.add(new SoftwareEntwicklung1Frage1());
		            break;				
				case 1:
					fragen.add(new SoftwareEntwicklung1Frage2());
					break;
				case 2:
					fragen.add(new SoftwareEntwicklung1Frage3());
					break;
				}
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
}