package test.java.ScientificComputingTheGame.model.AlleKurse;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import main.java.ScientificComputingTheGame.model.Frage;
import main.java.ScientificComputingTheGame.model.AlleKurse.AWGeschichteDerBRD;

public class AWGeschichteDerBRDTest {

	AWGeschichteDerBRD awgeschTest = new AWGeschichteDerBRD();

	@Test
	public void testAllMethods() {
		awgeschTest.setAnzahlGestellterFragen(2);
		awgeschTest.setAnzahlRichtigBeantworteterFragen(2);
		awgeschTest.setIstPruefungsFrage(true);
		Assert.assertTrue(testGetFragen());
		Assert.assertSame(2, awgeschTest.getAnzahlGestellterFragen());
		Assert.assertSame(2, awgeschTest.getAnzahlRichtigBeantworteterFragen());
		Assert.assertTrue(awgeschTest.getIstPruefungsFrage());
		Assert.assertSame(AWGeschichteDerBRD.name, awgeschTest.getName());
		Assert.assertSame(2, awgeschTest.getAnzahlZuBeantwortenderFragen());
		Assert.assertSame(2, awgeschTest.getECTS());
		Assert.assertSame(AWGeschichteDerBRD.beschreibung, awgeschTest.getBeschreibung());

	}

	public boolean testGetFragen() {
		int equals = 0;
		ArrayList<Frage> fragen = awgeschTest.getFragen();
		for (int i = 0; i < AWGeschichteDerBRD.alleFragen.length; i++) {
			for (int j = 0; j < fragen.size(); j++)
				if ((AWGeschichteDerBRD.alleFragen[i][0] + " Die Antwortmoeglichkeiten sind: "
						+ AWGeschichteDerBRD.alleFragen[i][1]).equals(fragen.get(j).getFrage())
						&& AWGeschichteDerBRD.alleFragen[i][2].equals(fragen.get(j).getAntwort())) {
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
