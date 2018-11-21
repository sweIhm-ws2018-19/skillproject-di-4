package main.java.ScientificComputingTheGame.model;

public class Kurs {
	private String name;
	private Fragen fragen;
	private boolean bestanden;
	
	Kurs(String name) {
		this.name = name;
		bestanden = false;
	}
	
	public Fragen getFragen() {
		//TODO get all Questions for this course
		return fragen;
	}	
}
