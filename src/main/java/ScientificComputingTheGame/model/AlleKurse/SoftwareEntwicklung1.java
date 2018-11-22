package main.java.ScientificComputingTheGame.model.AlleKurse;
import java.util.ArrayList;

import main.java.ScientificComputingTheGame.model.Fragen;
import main.java.ScientificComputingTheGame.model.Kurs;
import main.java.ScientificComputingTheGame.model.AlleFragen.SoftwareEntwicklung1Frage1;
import main.java.ScientificComputingTheGame.model.AlleFragen.SoftwareEntwicklung1Frage2;

public class SoftwareEntwicklung1 extends Kurs{
	private String name = "Software Entwicklung 1";
	private ArrayList<Fragen> alleFragen;

	SoftwareEntwicklung1() {
		super();
	}
	
	public ArrayList<Fragen> alleFragenErzeugen() {
		ArrayList<Fragen> alleFragen = new ArrayList<Fragen>();
		alleFragen.add(new SoftwareEntwicklung1Frage1());
		alleFragen.add(new SoftwareEntwicklung1Frage2());
		return alleFragen;
	}
	
	public int getAnzahlFragen() {
		return alleFragen.size();
	}
	
	
	public String getName() {
		return name;
	}
}