package main.java.ScientificComputingTheGame.model;

public abstract class Fragen {
	private boolean awnserCorrect;
	private boolean aktiv;
	
	public abstract void frageStellen();
	public abstract void frageWiederholen();
	public abstract String getRichtigeLoesung();
	
	protected Fragen() {
		awnserCorrect = false;
		aktiv = false;
	}
	public void frageBeginnen() {
		frageStellen();
	}
	public String antwortAbwarten() {
		//TODO evtl. repeat question (frageBeginnen() or frageWiederholen()?)
		//TODO get answer
		String nutzerAntwort = "A";		//TODO change to String from input
		return nutzerAntwort;
	}
	public boolean antwortRichtig(String userSolution) {
		if (userSolution.equals(this.getRichtigeLoesung())) {
			awnserCorrect = true;
		}
		return awnserCorrect;
	}
	public void aktivSchalten() {
		aktiv = true;
	}
	public boolean getAktiv() {
		return aktiv;
	}
}
