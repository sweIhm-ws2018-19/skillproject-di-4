package main.java.ScientificComputingTheGame.model.AlleFragen;
import main.java.ScientificComputingTheGame.model.Fragen;

public class SoftwareEntwicklung1Frage2 extends Fragen {
	private String question = "Dies ist Frage 2 aus Software Entwicklung 1. Die Richtige Antwort ist A.";
	private String solutions = "Die moeglichen Loesungen sind A, B, C und D.";
	private String rightSolution = "B";
	
	public SoftwareEntwicklung1Frage2() {
		super();
	}

	public void frageStellen() {
		//TODO ask question
	}
	
	public void frageWiederholen() {
		//TODO ask question again/ maybe just use frageStellen()
	}
	
	public String getRichtigeLoesung() {
		return rightSolution;
	}
}
