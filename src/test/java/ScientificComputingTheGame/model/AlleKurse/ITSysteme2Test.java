package test.java.ScientificComputingTheGame.model.AlleKurse;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import main.java.ScientificComputingTheGame.model.Frage;
import main.java.ScientificComputingTheGame.model.AlleKurse.ITSysteme2;

public class ITSysteme2Test {

	ITSysteme2 it2Test = new ITSysteme2();

	@Test
	public void testAllMethods() {
		it2Test.setAnzahlGestellterFragen(2);
		it2Test.setAnzahlRichtigBeantworteterFragen(2);
		it2Test.setIstPruefungsFrage(true);
		//Assert.assertTrue(testGetFragen());
		Assert.assertSame(2, it2Test.getAnzahlGestellterFragen());
		Assert.assertSame(2, it2Test.getAnzahlRichtigBeantworteterFragen());
		Assert.assertTrue(it2Test.getIstPruefungsFrage());
		Assert.assertSame(ITSysteme2.name, it2Test.getName());
		Assert.assertSame(2, it2Test.getAnzahlZuBeantwortenderFragen());
		Assert.assertSame(5, it2Test.getECTS());
		Assert.assertSame(ITSysteme2.beschreibung, it2Test.getBeschreibung());
	}

	public boolean testGetFragen() {
		int equals = 0;
		ArrayList<Frage> fragen = it2Test.getFragen();
		for (int i = 0; i < ITSysteme2.alleFragen.length; i++) {
			for (int j = 0; j < fragen.size(); j++)
				if ((ITSysteme2.alleFragen[i][0] + " Die Antwortmoeglichkeiten sind: " + ITSysteme2.alleFragen[i][1])
						.equals(fragen.get(j).getFrage())
						&& ITSysteme2.alleFragen[i][2].equals(fragen.get(j).getAntwort())) {
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
