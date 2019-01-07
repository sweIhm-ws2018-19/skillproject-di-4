package test.java.ScientificComputingTheGame.model.AlleKurse;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import main.java.ScientificComputingTheGame.model.Frage;
import main.java.ScientificComputingTheGame.model.AlleKurse.SoftwareEntwicklung1;

public class SoftwareEntwicklung1Test {

	SoftwareEntwicklung1 seTest = new SoftwareEntwicklung1();

	@Test
	public void testAllMethods() {
		seTest.setAnzahlGestellterFragen(2);
		seTest.setAnzahlRichtigBeantworteterFragen(2);
		seTest.setIstPruefungsFrage(true);
		//Assert.assertTrue(testGetFragen());
		Assert.assertSame(2, seTest.getAnzahlGestellterFragen());
		Assert.assertSame(2, seTest.getAnzahlRichtigBeantworteterFragen());
		Assert.assertTrue(seTest.getIstPruefungsFrage());
		Assert.assertSame(SoftwareEntwicklung1.name, seTest.getName());
		Assert.assertSame(2, seTest.getAnzahlZuBeantwortenderFragen());
		Assert.assertSame(8, seTest.getECTS());
		Assert.assertSame(SoftwareEntwicklung1.beschreibung, seTest.getBeschreibung());
	}

	public boolean testGetFragen() {
		int equals = 0;
		ArrayList<Frage> fragen = seTest.getFragen();
		for (int i = 0; i < SoftwareEntwicklung1.alleFragen.length; i++) {
			for (int j = 0; j < fragen.size(); j++)
				if ((SoftwareEntwicklung1.alleFragen[i][0] + " Die Antwortmoeglichkeiten sind: "
						+ SoftwareEntwicklung1.alleFragen[i][1]).equals(fragen.get(j).getFrage())
						&& SoftwareEntwicklung1.alleFragen[i][2].equals(fragen.get(j).getAntwort())) {
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
