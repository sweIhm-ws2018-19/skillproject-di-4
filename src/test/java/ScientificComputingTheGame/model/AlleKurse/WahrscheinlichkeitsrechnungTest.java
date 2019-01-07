package test.java.ScientificComputingTheGame.model.AlleKurse;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import main.java.ScientificComputingTheGame.model.Frage;
import main.java.ScientificComputingTheGame.model.AlleKurse.Wahrscheinlichkeitsrechnung;

public class WahrscheinlichkeitsrechnungTest {

	Wahrscheinlichkeitsrechnung wahrschTest = new Wahrscheinlichkeitsrechnung();

	@Test
	public void testAllMethods() {
		wahrschTest.setAnzahlGestellterFragen(2);
		wahrschTest.setAnzahlRichtigBeantworteterFragen(2);
		wahrschTest.setIstPruefungsFrage(true);
		//Assert.assertTrue(testGetFragen());
		Assert.assertSame(2, wahrschTest.getAnzahlGestellterFragen());
		Assert.assertSame(2, wahrschTest.getAnzahlRichtigBeantworteterFragen());
		Assert.assertTrue(wahrschTest.getIstPruefungsFrage());
		Assert.assertSame(Wahrscheinlichkeitsrechnung.name, wahrschTest.getName());
		Assert.assertSame(2, wahrschTest.getAnzahlZuBeantwortenderFragen());
		Assert.assertSame(5, wahrschTest.getECTS());
		Assert.assertSame(Wahrscheinlichkeitsrechnung.beschreibung, wahrschTest.getBeschreibung());
	}

	public boolean testGetFragen() {
		int equals = 0;
		ArrayList<Frage> fragen = wahrschTest.getFragen();
		for (int i = 0; i < Wahrscheinlichkeitsrechnung.alleFragen.length; i++) {
			for (int j = 0; j < fragen.size(); j++)
				if ((Wahrscheinlichkeitsrechnung.alleFragen[i][0] + " Die Antwortmoeglichkeiten sind: "
						+ Wahrscheinlichkeitsrechnung.alleFragen[i][1]).equals(fragen.get(j).getFrage())
						&& Wahrscheinlichkeitsrechnung.alleFragen[i][2].equals(fragen.get(j).getAntwort())) {
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
