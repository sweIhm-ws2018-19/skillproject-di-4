package main.java.ScientificComputingTheGame.model;
import java.util.ArrayList;
import main.java.ScientificComputingTheGame.model.AlleKurse.*;

public class Semester1 {
	private ArrayList<Kurs> kurse;
	private int id;
	
	public Semester1() {
		this.id = 1;
		kurse = getKurse();
	}
	
	public ArrayList<Kurs> getKurse() {
		kurse = new ArrayList<Kurs>();
		kurse.add(new SoftwareEntwicklung1());
		kurse.add(new LineareAlgebra());
		kurse.add(new Analysis());
		kurse.add(new MKB());
		kurse.add(new ITSysteme1());
		kurse.add(waehleAWFach());
		return kurse;
	}
	
	public Kurs waehleAWFach() {
		//TODO read all AWFaecher
		//TODO let player choose AWFach
		return null;
	}
	
	public int getId() {
		return id;
	}
	
	public void pruefungsPhaseBeginnen() {
		for(Kurs momentanePruefung: kurse) {
			momentanePruefung.pruefungBeginnen();
		}
	}
	
	public ArrayList<Kurs> offeneKurse() {
		ArrayList<Kurs> offeneKurse = new ArrayList<Kurs>();
		for(Kurs momentanerKurs: kurse) {
			if(momentanerKurs.getBestanden()) {
				offeneKurse.add(momentanerKurs);
			}
		}
		return offeneKurse;
	}
}
