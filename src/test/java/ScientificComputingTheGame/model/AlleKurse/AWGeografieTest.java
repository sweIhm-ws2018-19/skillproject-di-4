package test.java.ScientificComputingTheGame.model.AlleKurse;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import main.java.ScientificComputingTheGame.model.Frage;
import main.java.ScientificComputingTheGame.model.AlleKurse.AWGeografie;

public class AWGeografieTest {

	AWGeografie awgeoTest = new AWGeografie();

	@Test
	public void testAllMethods() {
		awgeoTest.setAnzahlGestellterFragen(2);
		awgeoTest.setAnzahlRichtigBeantworteterFragen(2);
		awgeoTest.setIstPruefungsFrage(true);
		Assert.assertTrue(testGetFragen());
		Assert.assertSame(2, awgeoTest.getAnzahlGestellterFragen());
		Assert.assertSame(2, awgeoTest.getAnzahlRichtigBeantworteterFragen());
		Assert.assertTrue(awgeoTest.getIstPruefungsFrage());
		Assert.assertSame(AWGeografie.name, awgeoTest.getName());
		Assert.assertSame(2, awgeoTest.getAnzahlZuBeantwortenderFragen());
		Assert.assertSame(5, awgeoTest.getECTS());
		Assert.assertSame(AWGeografie.beschreibung, awgeoTest.getBeschreibung());

	}

	public boolean testGetFragen() {
		int equals = 0;
		ArrayList<Frage> fragen = awgeoTest.getFragen();
		for (int i = 0; i < AWGeografie.alleFragen.length; i++) {
			for (int j = 0; j < fragen.size(); j++)
				if ((AWGeografie.alleFragen[i][0] + " Die Antwortmoeglichkeiten sind: " + AWGeografie.alleFragen[i][1])
						.equals(fragen.get(j).getFrage())
						&& AWGeografie.alleFragen[i][2].equals(fragen.get(j).getAntwort())) {
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
