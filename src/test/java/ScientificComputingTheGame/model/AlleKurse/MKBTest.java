package test.java.ScientificComputingTheGame.model.AlleKurse;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import main.java.ScientificComputingTheGame.model.Frage;
import main.java.ScientificComputingTheGame.model.AlleKurse.MKB;

public class MKBTest {

	MKB mkbTest = new MKB();

	@Test
	public void testAllMethods() {
		mkbTest.setAnzahlGestellterFragen(2);
		mkbTest.setAnzahlRichtigBeantworteterFragen(2);
		mkbTest.setIstPruefungsFrage(true);
		Assert.assertTrue(testGetFragen());
		Assert.assertSame(2, mkbTest.getAnzahlGestellterFragen());
		Assert.assertSame(2, mkbTest.getAnzahlRichtigBeantworteterFragen());
		Assert.assertTrue(mkbTest.getIstPruefungsFrage());
		Assert.assertSame(MKB.name, mkbTest.getName());
		Assert.assertSame(2, mkbTest.getAnzahlZuBeantwortenderFragen());
		Assert.assertSame(5, mkbTest.getECTS());
		Assert.assertSame(MKB.beschreibung, mkbTest.getBeschreibung());
	}

	public boolean testGetFragen() {
		int equals = 0;
		ArrayList<Frage> fragen = mkbTest.getFragen();
		for (int i = 0; i < MKB.alleFragen.length; i++) {
			for (int j = 0; j < fragen.size(); j++)
				if ((MKB.alleFragen[i][0] + " Die Antwortmoeglichkeiten sind: " + MKB.alleFragen[i][1])
						.equals(fragen.get(j).getFrage())
						&& MKB.alleFragen[i][2].equals(fragen.get(j).getAntwort())) {
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
