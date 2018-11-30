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
		pruefungsPhaseBeginnen();
		semesterBeenden();
	}
	
	public ArrayList<Kurs> getKurse(ArrayList<Kurs> offeneKurse) {
		if(id == 1) {
			offeneKurse.add(new SoftwareEntwicklung1());
			offeneKurse.add(new LineareAlgebra());
			offeneKurse.add(new Analysis());
			offeneKurse.add(new MKB());
			offeneKurse.add(new ITSysteme1());
//			offeneKurse.add(waehleAWFach());
		}
		else if(id == 2) {
			offeneKurse.add(new SoftwareEntwicklung2());
			offeneKurse.add(new DiskreteMathematik());
			offeneKurse.add(new AngewandteMathematik());
			offeneKurse.add(new ITSysteme2());
			offeneKurse.add(new TheoretischeInformatik());
//			offeneKurse.add(waehleAWFach());
		}
		else if(id == 3) {
			offeneKurse.add(new NumerischeMathematik());
			offeneKurse.add(new OperationsResearch());
			offeneKurse.add(new Differentialrechnung());
			offeneKurse.add(new AlgorithmenUndDatenstrukturen());
			offeneKurse.add(new SoftwareEngineering());
			offeneKurse.add(new Wahrscheinlichkeitsrechnung());
		}
		else if(id == 4) {
			//TODO evtl. starte Praxissemester
		}
		else if(id == 5) {
			//TODO evtl. starte Auslandssemester
		}
		return offeneKurse;
	}
	
	public Kurs waehleAWFach() {
		//TODO read all AWFaecher
		//TODO let player chooses AWFach
		return null;
	}
	
	public int getId() {
		return id;
	}
	
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
	
	private void semesterBeenden() {
		//TODO "Sie haben das Semester beendet...
	}
}
