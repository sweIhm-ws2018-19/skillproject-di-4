package test.java.ScientificComputingTheGame.model.AlleKurse;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import main.java.ScientificComputingTheGame.model.Frage;
import main.java.ScientificComputingTheGame.model.AlleKurse.AngewandteMathematik;

public class AngewandteMathematikTest {

	AngewandteMathematik angMatTest = new AngewandteMathematik();
	
	@Test
	public void testAllMethods() {
		angMatTest.setAnzahlGestellterFragen(2);
		angMatTest.setAnzahlRichtigBeantworteterFragen(2);
		angMatTest.setIstPruefungsFrage(true);
		//Assert.assertArrayEquals(Analysis.alleFragen, analysisTest.alleFragen);
		Assert.assertTrue(testGetFragen());
		Assert.assertSame(2,angMatTest.getAnzahlGestellterFragen());
		Assert.assertSame(2, angMatTest.getAnzahlRichtigBeantworteterFragen());
		Assert.assertTrue(angMatTest.getIstPruefungsFrage());
		Assert.assertSame("Analysis", angMatTest.getName());
		Assert.assertSame(2, angMatTest.getAnzahlZuBeantwortenderFragen());
		Assert.assertSame(5, angMatTest.getECTS());
		Assert.assertSame(AngewandteMathematik.beschreibung, angMatTest.getBeschreibung());
	}

	
	public boolean testGetFragen() {
		int equals = 0;
		ArrayList<Frage> fragen = angMatTest.getFragen();
		for(int i=0; i < AngewandteMathematik.alleFragen.length;i++) {
			for(int j=0; j < fragen.size();j++)
			if((AngewandteMathematik.alleFragen[i][0]+" Die Antwortmoeglichkeiten sind: "+AngewandteMathematik.alleFragen[i][1]).equals(fragen.get(j).getFrage()) && 
					AngewandteMathematik.alleFragen[i][2].equals(fragen.get(j).getAntwort())) {
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
