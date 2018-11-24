package main.java.ScientificComputingTheGame.model;

import java.util.ArrayList;

public class Semester {
	private ArrayList<Kurs> kurse;
	private int id;
	
	public Semester(int id) {
		this.id = id;
		kurse = new ArrayList<Kurs>();
	}
	
	public ArrayList<Kurs> getKurse() {
		return kurse;
	}
	
	public int getId() {
		return id;
	}
	
	public void addKurs(Kurs kurs) {
		kurse.add(kurs);
	}
	
	public String fragenAbrufen(Kurs kurs) {
		//TODO
		return null;
	}
}
