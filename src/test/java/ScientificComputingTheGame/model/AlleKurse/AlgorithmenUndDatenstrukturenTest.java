package test.java.ScientificComputingTheGame.model.AlleKurse;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import main.java.ScientificComputingTheGame.model.Frage;
import main.java.ScientificComputingTheGame.model.AlleKurse.AlgorithmenUndDatenstrukturen;

public class AlgorithmenUndDatenstrukturenTest {

	AlgorithmenUndDatenstrukturen algDatTest = new AlgorithmenUndDatenstrukturen();

	@Test
	public void testAllMethods() {
		algDatTest.setAnzahlGestellterFragen(2);
		algDatTest.setAnzahlRichtigBeantworteterFragen(2);
		algDatTest.setIstPruefungsFrage(true);
		//Assert.assertTrue(testGetFragen());
		Assert.assertSame(2, algDatTest.getAnzahlGestellterFragen());
		Assert.assertSame(2, algDatTest.getAnzahlRichtigBeantworteterFragen());
		Assert.assertTrue(algDatTest.getIstPruefungsFrage());
		Assert.assertSame(AlgorithmenUndDatenstrukturen.name, algDatTest.getName());
		Assert.assertSame(2, algDatTest.getAnzahlZuBeantwortenderFragen());
		Assert.assertSame(5, algDatTest.getECTS());
		Assert.assertSame(AlgorithmenUndDatenstrukturen.beschreibung, algDatTest.getBeschreibung());
	}

	public boolean testGetFragen() {
		int equals = 0;
		ArrayList<Frage> fragen = algDatTest.getFragen();
		for (int i = 0; i < AlgorithmenUndDatenstrukturen.alleFragen.length; i++) {
			for (int j = 0; j < fragen.size(); j++)
				if ((AlgorithmenUndDatenstrukturen.alleFragen[i][0] + " Die Antwortmoeglichkeiten sind: "
						+ AlgorithmenUndDatenstrukturen.alleFragen[i][1]).equals(fragen.get(j).getFrage())
						&& AlgorithmenUndDatenstrukturen.alleFragen[i][2].equals(fragen.get(j).getAntwort())) {
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
