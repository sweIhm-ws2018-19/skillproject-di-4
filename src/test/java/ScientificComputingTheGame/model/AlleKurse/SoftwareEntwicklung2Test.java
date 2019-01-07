package test.java.ScientificComputingTheGame.model.AlleKurse;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import main.java.ScientificComputingTheGame.model.Frage;
import main.java.ScientificComputingTheGame.model.AlleKurse.SoftwareEntwicklung2;

public class SoftwareEntwicklung2Test {

	SoftwareEntwicklung2 se2Test = new SoftwareEntwicklung2();

	@Test
	public void testAllMethods() {
		se2Test.setAnzahlGestellterFragen(2);
		se2Test.setAnzahlRichtigBeantworteterFragen(2);
		se2Test.setIstPruefungsFrage(true);
		//Assert.assertTrue(testGetFragen());
		Assert.assertSame(2, se2Test.getAnzahlGestellterFragen());
		Assert.assertSame(2, se2Test.getAnzahlRichtigBeantworteterFragen());
		Assert.assertTrue(se2Test.getIstPruefungsFrage());
		Assert.assertSame(SoftwareEntwicklung2.name, se2Test.getName());
		Assert.assertSame(2, se2Test.getAnzahlZuBeantwortenderFragen());
		Assert.assertSame(8, se2Test.getECTS());
		Assert.assertSame(SoftwareEntwicklung2.beschreibung, se2Test.getBeschreibung());
	}

	public boolean testGetFragen() {
		int equals = 0;
		ArrayList<Frage> fragen = se2Test.getFragen();
		for (int i = 0; i < SoftwareEntwicklung2.alleFragen.length; i++) {
			for (int j = 0; j < fragen.size(); j++)
				if ((SoftwareEntwicklung2.alleFragen[i][0] + " Die Antwortmoeglichkeiten sind: "
						+ SoftwareEntwicklung2.alleFragen[i][1]).equals(fragen.get(j).getFrage())
						&& SoftwareEntwicklung2.alleFragen[i][2].equals(fragen.get(j).getAntwort())) {
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
