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
		analysisTest.setAnzahlGestellterFragen(2);
		analysisTest.setAnzahlRichtigBeantworteterFragen(2);
		analysisTest.setIstPruefungsFrage(true);
		Assert.assertTrue(testGetFragen());
		Assert.assertSame(2, analysisTest.getAnzahlGestellterFragen());
		Assert.assertSame(2, analysisTest.getAnzahlRichtigBeantworteterFragen());
		Assert.assertTrue(analysisTest.getIstPruefungsFrage());
		Assert.assertSame(Analysis.name, analysisTest.getName());
		Assert.assertSame(2, analysisTest.getAnzahlZuBeantwortenderFragen());
		Assert.assertSame(5, analysisTest.getECTS());
		Assert.assertSame(Analysis.beschreibung, analysisTest.getBeschreibung());
	}

	public boolean testGetFragen() {
		int equals = 0;
		ArrayList<Frage> fragen = analysisTest.getFragen();
		for (int i = 0; i < Analysis.alleFragen.length; i++) {
			for (int j = 0; j < fragen.size(); j++)
				if ((Analysis.alleFragen[i][0] + " Die Antwortmoeglichkeiten sind: " + Analysis.alleFragen[i][1])
						.equals(fragen.get(j).getFrage())
						&& Analysis.alleFragen[i][2].equals(fragen.get(j).getAntwort())) {
					equals++;
				}
		}
		if (equals == fragen.size()) {
			return true;
		} else {
			return false;
		}
	}

}