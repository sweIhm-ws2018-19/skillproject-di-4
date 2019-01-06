package test.java.ScientificComputingTheGame.model.AlleKurse;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import main.java.ScientificComputingTheGame.model.Frage;
import main.java.ScientificComputingTheGame.model.AlleKurse.ITSysteme1;

public class ITSysteme1Test {

	ITSysteme1 itTest = new ITSysteme1();

	@Test
	public void testAllMethods() {
		itTest.setAnzahlGestellterFragen(2);
		itTest.setAnzahlRichtigBeantworteterFragen(2);
		itTest.setIstPruefungsFrage(true);
		Assert.assertTrue(testGetFragen());
		Assert.assertSame(2, itTest.getAnzahlGestellterFragen());
		Assert.assertSame(2, itTest.getAnzahlRichtigBeantworteterFragen());
		Assert.assertTrue(itTest.getIstPruefungsFrage());
		Assert.assertSame(ITSysteme1.name, itTest.getName());
		Assert.assertSame(2, itTest.getAnzahlZuBeantwortenderFragen());
		Assert.assertSame(5, itTest.getECTS());
		Assert.assertSame(ITSysteme1.beschreibung, itTest.getBeschreibung());
	}

	public boolean testGetFragen() {
		int equals = 0;
		ArrayList<Frage> fragen = itTest.getFragen();
		for (int i = 0; i < ITSysteme1.alleFragen.length; i++) {
			for (int j = 0; j < fragen.size(); j++)
				if ((ITSysteme1.alleFragen[i][0] + " Die Antwortmoeglichkeiten sind: " + ITSysteme1.alleFragen[i][1])
						.equals(fragen.get(j).getFrage())
						&& ITSysteme1.alleFragen[i][2].equals(fragen.get(j).getAntwort())) {
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
