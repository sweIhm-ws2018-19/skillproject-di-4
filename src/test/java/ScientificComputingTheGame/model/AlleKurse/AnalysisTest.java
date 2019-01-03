package test.java.ScientificComputingTheGame.model.AlleKurse;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import main.java.ScientificComputingTheGame.model.Frage;
import main.java.ScientificComputingTheGame.model.AlleKurse.Analysis;

public class AnalysisTest {
	
	Analysis analysisTest = new Analysis();

	@Test
	public void testAllMethods() {
		//Assert.assertArrayEquals(Analysis.alleFragen, analysisTest.alleFragen);
		Assert.assertTrue(testGetFragen());
		
	}

	
	public boolean testGetFragen() {
		int equals = 0;
		ArrayList<Frage> fragen = analysisTest.getFragen();
		for(int i=0; i < Analysis.alleFragen.length;i++) {
			for(int j=0; j < fragen.size();j++)
			if((Analysis.alleFragen[i][0]+Analysis.alleFragen[i][1]).equals(fragen.get(j).getFrage()) && Analysis.alleFragen[i][2].equals(fragen.get(j).getAntwort())) {
				equals++;
			}
		}
		if(equals == fragen.size()) {
			return true;
		}else {
			return false;
		}
	}

}