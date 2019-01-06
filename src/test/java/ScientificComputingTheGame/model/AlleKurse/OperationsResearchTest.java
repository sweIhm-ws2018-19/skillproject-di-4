package test.java.ScientificComputingTheGame.model.AlleKurse;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import main.java.ScientificComputingTheGame.model.Frage;
import main.java.ScientificComputingTheGame.model.AlleKurse.OperationsResearch;

public class OperationsResearchTest {

	OperationsResearch orTest = new OperationsResearch();

	@Test
	public void testAllMethods() {
		orTest.setAnzahlGestellterFragen(2);
		orTest.setAnzahlRichtigBeantworteterFragen(2);
		orTest.setIstPruefungsFrage(true);
		Assert.assertTrue(testGetFragen());
		Assert.assertSame(2, orTest.getAnzahlGestellterFragen());
		Assert.assertSame(2, orTest.getAnzahlRichtigBeantworteterFragen());
		Assert.assertTrue(orTest.getIstPruefungsFrage());
		Assert.assertSame(OperationsResearch.name, orTest.getName());
		Assert.assertSame(2, orTest.getAnzahlZuBeantwortenderFragen());
		Assert.assertSame(5, orTest.getECTS());
		Assert.assertSame(OperationsResearch.beschreibung, orTest.getBeschreibung());
	}

	public boolean testGetFragen() {
		int equals = 0;
		ArrayList<Frage> fragen = orTest.getFragen();
		for (int i = 0; i < OperationsResearch.alleFragen.length; i++) {
			for (int j = 0; j < fragen.size(); j++)
				if ((OperationsResearch.alleFragen[i][0] + " Die Antwortmoeglichkeiten sind: "
						+ OperationsResearch.alleFragen[i][1]).equals(fragen.get(j).getFrage())
						&& OperationsResearch.alleFragen[i][2].equals(fragen.get(j).getAntwort())) {
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
