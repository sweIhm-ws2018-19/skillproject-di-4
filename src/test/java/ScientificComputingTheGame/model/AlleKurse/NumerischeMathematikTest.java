package test.java.ScientificComputingTheGame.model.AlleKurse;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import main.java.ScientificComputingTheGame.model.Frage;
import main.java.ScientificComputingTheGame.model.AlleKurse.NumerischeMathematik;

class NumerischeMathematikTest {

	NumerischeMathematik numMatTest = new NumerischeMathematik();

	@Test
	public void testAllMethods() {
		numMatTest.setAnzahlGestellterFragen(2);
		numMatTest.setAnzahlRichtigBeantworteterFragen(2);
		numMatTest.setIstPruefungsFrage(true);
		Assert.assertTrue(testGetFragen());
		Assert.assertSame(2, numMatTest.getAnzahlGestellterFragen());
		Assert.assertSame(2, numMatTest.getAnzahlRichtigBeantworteterFragen());
		Assert.assertTrue(numMatTest.getIstPruefungsFrage());
		Assert.assertSame(NumerischeMathematik.name, numMatTest.getName());
		Assert.assertSame(2, numMatTest.getAnzahlZuBeantwortenderFragen());
		Assert.assertSame(5, numMatTest.getECTS());
		Assert.assertSame(NumerischeMathematik.beschreibung, numMatTest.getBeschreibung());
	}

	public boolean testGetFragen() {
		int equals = 0;
		ArrayList<Frage> fragen = numMatTest.getFragen();
		for (int i = 0; i < NumerischeMathematik.alleFragen.length; i++) {
			for (int j = 0; j < fragen.size(); j++)
				if ((NumerischeMathematik.alleFragen[i][0] + " Die Antwortmoeglichkeiten sind: "
						+ NumerischeMathematik.alleFragen[i][1]).equals(fragen.get(j).getFrage())
						&& NumerischeMathematik.alleFragen[i][2].equals(fragen.get(j).getAntwort())) {
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
