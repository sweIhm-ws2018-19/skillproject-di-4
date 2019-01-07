package test.java.ScientificComputingTheGame.model.AlleKurse;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import main.java.ScientificComputingTheGame.model.Frage;
import main.java.ScientificComputingTheGame.model.AlleKurse.SoftwareEngineering;

public class SoftwareEngineeringTest {

	SoftwareEngineering seTest = new SoftwareEngineering();

	@Test
	public void testAllMethods() {
		seTest.setAnzahlGestellterFragen(2);
		seTest.setAnzahlRichtigBeantworteterFragen(2);
		seTest.setIstPruefungsFrage(true);
		//Assert.assertTrue(testGetFragen());
		Assert.assertSame(2, seTest.getAnzahlGestellterFragen());
		Assert.assertSame(2, seTest.getAnzahlRichtigBeantworteterFragen());
		Assert.assertTrue(seTest.getIstPruefungsFrage());
		Assert.assertSame(SoftwareEngineering.name, seTest.getName());
		Assert.assertSame(2, seTest.getAnzahlZuBeantwortenderFragen());
		Assert.assertSame(5, seTest.getECTS());
		Assert.assertSame(SoftwareEngineering.beschreibung, seTest.getBeschreibung());
	}

	public boolean testGetFragen() {
		int equals = 0;
		ArrayList<Frage> fragen = seTest.getFragen();
		for (int i = 0; i < SoftwareEngineering.alleFragen.length; i++) {
			for (int j = 0; j < fragen.size(); j++)
				if ((SoftwareEngineering.alleFragen[i][0] + " Die Antwortmoeglichkeiten sind: "
						+ SoftwareEngineering.alleFragen[i][1]).equals(fragen.get(j).getFrage())
						&& SoftwareEngineering.alleFragen[i][2].equals(fragen.get(j).getAntwort())) {
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
