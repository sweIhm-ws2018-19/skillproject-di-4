package test.java.ScientificComputingTheGame.model;

import org.junit.Assert;
import org.junit.Test;


import main.java.ScientificComputingTheGame.model.ScientificComputingTheGame;
import main.java.ScientificComputingTheGame.model.AlleKurse.Analysis;

public class ScientificComputingTheGameTest {
	
	ScientificComputingTheGame sTest = new ScientificComputingTheGame();
	
	
	
	@Test
	public void testAllMethods() {
		Assert.assertSame(ScientificComputingTheGame.offeneKurse, sTest.getOffeneKurse());
		Assert.assertTrue(getFrageTest());
		Assert.assertSame(ScientificComputingTheGame.gestellteFrage,ScientificComputingTheGame.getAntwort());
	}
	
	private boolean getFrageTest() {
		String frage = ScientificComputingTheGame.getFrage("Analysis");
		for (int i=0; i < Analysis.alleFragen.length;i++) {
			if(frage.equals(Analysis.alleFragen[i][0]+" Die Antwortmoeglichkeiten sind: "+Analysis.alleFragen[i][1])) {
				return true;
			}
		}
		return false;
	}

}
