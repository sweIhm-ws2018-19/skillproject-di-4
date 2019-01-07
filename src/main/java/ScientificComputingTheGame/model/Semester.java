package main.java.ScientificComputingTheGame.model;
import java.util.ArrayList;
import java.util.Iterator;

import main.java.ScientificComputingTheGame.model.AlleKurse.*;
import main.java.ScientificComputingTheGame.model.ScientificComputingTheGame;

public class Semester {
	private ArrayList<Kurs> kurse;
	private int id;
	
	public Semester(ArrayList<Kurs> offeneKurse, int semesterID) {
		id = semesterID;
		kurse = getKurse(offeneKurse);
	}
	
	public ArrayList<Kurs> getKurse(ArrayList<Kurs> offeneKurse) {
		switch(id) {
		case 1:
			offeneKurse.add(new SoftwareEntwicklung1());
			offeneKurse.add(new LineareAlgebra());
			offeneKurse.add(new Analysis());
			offeneKurse.add(new MKB());
			offeneKurse.add(new ITSysteme1());
			offeneKurse.add(waehleAWFach());
			break;
		case 2:
			offeneKurse.add(new SoftwareEntwicklung2());
			offeneKurse.add(new DiskreteMathematik());
			offeneKurse.add(new AngewandteMathematik());
			offeneKurse.add(new ITSysteme2());
			offeneKurse.add(new TheoretischeInformatik());
			offeneKurse.add(waehleAWFach());
			break;
		case 3:
			offeneKurse.add(new NumerischeMathematik());
			offeneKurse.add(new OperationsResearch());
			offeneKurse.add(new Differentialrechnung());
			offeneKurse.add(new AlgorithmenUndDatenstrukturen());
			offeneKurse.add(new SoftwareEngineering());
			offeneKurse.add(new Wahrscheinlichkeitsrechnung());
		case 4:
			offeneKurse.add(new Praxissemester());
		case 5:
			//TODO evtl. starte Auslandssemester
		}
		return offeneKurse;
	}
	
	public Kurs waehleAWFach() {
		if(id == 1) {
			return new AWGeschichteDerBRD();
		}
		else {
			return new AWGeografie();
		}
	}
	
	public int getId() {
		return id;
	}
	
	
	public boolean getSemesterBestanden() {
		boolean kursUnVollendet = false;
		for(Kurs k: kurse) {
			if(k.getBestanden()==false) {
				kursUnVollendet = true;
			}
		}		
		
		return !kursUnVollendet;
	}
	
	/*
	public void pruefungsPhaseBeginnen() {
		for(Kurs momentanePruefung: kurse) {
			if (momentanePruefung != null) {
				momentanePruefung.pruefungBeginnen();
			}
		}
	}
	
	public ArrayList<Kurs> getOffeneKurse() {
		Iterator<Kurs> iterator = kurse.iterator();
		Kurs momentanerKurs;
		while (iterator.hasNext()) {
			momentanerKurs = iterator.next();
			if(iterator != null && (momentanerKurs.getBestanden())) {
				ScientificComputingTheGame.spieler.addECTS(momentanerKurs.getECTS());
				iterator.remove();
			}
		}
		return kurse;
	}
	*/
	
	public Kurs getFrage(String kursName) {
		Kurs richtigerKurs = null;
		for (Kurs k: kurse) {
			if(k.getName().toLowerCase().equals(kursName.toLowerCase())) {
				richtigerKurs=k;
			}
		}
		if (richtigerKurs==null) {return null;}
		return richtigerKurs;
	}
}
