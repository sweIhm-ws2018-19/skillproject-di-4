package main.java.ScientificComputingTheGame.model.AlleFragen;
import main.java.ScientificComputingTheGame.model.Fragen;

public class SoftwareEntwicklung1Frage1 extends Fragen {
	private String question = "Dies ist Frage 1 aus Software Entwicklung 1. Die Richtige Antwort ist A.";
	private String solutions = "Die moeglichen Loesungen sind A, B, C und D.";
	private String rightSolution = "A";
	
	public SoftwareEntwicklung1Frage1() {
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
