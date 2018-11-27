package main.java.ScientificComputingTheGame.model;
import java.util.ArrayList;
import main.java.ScientificComputingTheGame.model.AlleKurse.*;

public class Semester {
	private ArrayList<Kurs> kurse;
	private int id;
	
	public Semester(ArrayList<Kurs> offeneKurse, int semesterID) {
		id = semesterID;
		kurse = getKurse(offeneKurse);
		pruefungsPhaseBeginnen();
		offeneKurse = offeneKurse();
		semesterBeenden();
	}
	
	public ArrayList<Kurs> getKurse(ArrayList<Kurs> offeneKurse) {
		if(id == 1) {
			offeneKurse.add(new SoftwareEntwicklung1());
			offeneKurse.add(new LineareAlgebra());
			offeneKurse.add(new Analysis());
			offeneKurse.add(new MKB());
			offeneKurse.add(new ITSysteme1());
			offeneKurse.add(waehleAWFach());
		}
		else if(id == 2) {
//			offeneKurse.add(new SoftwareEntwicklung2());
//			offeneKurse.add(new DiskreteMathematik());
//			offeneKurse.add(new AngewandteMathematik());
//			offeneKurse.add(new ITSysteme2());
//			offeneKurse.add(new TheoretischeInformatik());
//			offeneKurse.add(waehleAWFach());
		}
		else if(id == 3) {
			//TODO Kurse 3. Semester hinzufuegen
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
			momentanePruefung.pruefungBeginnen();
			if(momentanePruefung != null) {
			momentanePruefung.pruefungBeginnen();
			}
		}
	}
	
	public ArrayList<Kurs> offeneKurse() {
		for(Kurs momentanerKurs: kurse) {
			if(momentanerKurs != null && momentanerKurs.getBestanden()) {
				ScientificComputingTheGame.spieler.addECTS(momentanerKurs.getECTS());
				kurse.remove(momentanerKurs);
			}
		}
		return kurse;
	}
	
	private void semesterBeenden() {
		//TODO "Sie haben das Semester beendet...
	}
}
