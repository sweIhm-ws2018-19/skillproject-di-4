package main.java.ScientificComputingTheGame.model;

import java.util.ArrayList;

public class Semester {
	public ArrayList<Kurs> kurse = new ArrayList<Kurs>();
	public int id;
	
	public Semester(int id) {
		this.id = id;
	}
	
	public ArrayList<Kurs> getKurse() {
		return kurse;
	}
	
	public void addKurs(Kurs kurs) {
		kurse.add(kurs);
	}
	
	public String fragenAbrufen(Kurs kurs) {
		//TODO
		return null;
	}
}
