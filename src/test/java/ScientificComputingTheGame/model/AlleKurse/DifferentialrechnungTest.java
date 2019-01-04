package test.java.ScientificComputingTheGame.model.AlleKurse;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import main.java.ScientificComputingTheGame.model.Frage;
import main.java.ScientificComputingTheGame.model.AlleKurse.Differentialrechnung;

public class DifferentialrechnungTest {
	
	Differentialrechnung diffTest = new Differentialrechnung();
	
	@Test
	public void testAllMethods() {
		diffTest.setAnzahlGestellterFragen(2);
		diffTest.setAnzahlRichtigBeantworteterFragen(2);
		diffTest.setIstPruefungsFrage(true);
		//Assert.assertArrayEquals(Analysis.alleFragen, analysisTest.alleFragen);
		Assert.assertTrue(testGetFragen());
		Assert.assertSame(2,diffTest.getAnzahlGestellterFragen());
		Assert.assertSame(2, diffTest.getAnzahlRichtigBeantworteterFragen());
		Assert.assertTrue(diffTest.getIstPruefungsFrage());
		Assert.assertSame(Differentialrechnung.name, diffTest.getName());
		Assert.assertSame(2, diffTest.getAnzahlZuBeantwortenderFragen());
		Assert.assertSame(5, diffTest.getECTS());
		Assert.assertSame(Differentialrechnung.beschreibung, diffTest.getBeschreibung());
	}

	
	public boolean testGetFragen() {
		int equals = 0;
		ArrayList<Frage> fragen = diffTest.getFragen();
		for(int i=0; i < Differentialrechnung.alleFragen.length;i++) {
			for(int j=0; j < fragen.size();j++)
			if((Differentialrechnung.alleFragen[i][0]+" Die Antwortmoeglichkeiten sind: "+Differentialrechnung.alleFragen[i][1]).equals(fragen.get(j).getFrage()) && 
					Differentialrechnung.alleFragen[i][2].equals(fragen.get(j).getAntwort())) {
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
