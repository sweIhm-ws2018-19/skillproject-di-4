package main.java.ScientificComputingTheGame.model;

public class Frage {
	private boolean awnserCorrect;
	private String fragenText;
	private String moeglicheLoesungen;
	private String richtigeLoesung;
	
	public Frage(String[] neueFrage) {
		awnserCorrect = false;
		fragenText = neueFrage[0];
		moeglicheLoesungen = neueFrage[1];
		richtigeLoesung = neueFrage[2];
	}
	
	
	
	public String getFrage() {
		return fragenText+" Die Antwortmoeglichkeiten sind: "+moeglicheLoesungen;
	}
	
	public String getAntwort() {
		return richtigeLoesung;
	}
	
	public void frageStellen() {
		//TODO Alexa says fragenText und moeglicheLoesungen
	}
	
	public void frageWiederholen() {
		//TODO Alexa says moeglicheLoesungen
	}
	
	public String antwortAbwarten() {
		//TODO evtl. repeat question (frageBeginnen() or frageWiederholen()?)
		//TODO get answer
		String nutzerAntwort = "A";		//TODO change to String from input
		return nutzerAntwort;
	}
	
	public boolean antwortRichtig(String userSolution) {
		if (userSolution.equals(richtigeLoesung)) {
			awnserCorrect = true;
		}
		return awnserCorrect;
	}
}
