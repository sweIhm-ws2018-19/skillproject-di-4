package main.java.ScientificComputingTheGame.model;

public class User {
	public String name;
	public int semester;
	
	public User(String name, int semester) {
		this.name = name;
		this.semester = semester;
	}
	
	public Semester semesterStarten(int id) {
		return new Semester(id);
	}
	
	public void frageBeantworten() {
		
	}
}
