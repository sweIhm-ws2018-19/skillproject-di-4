package test.java.ScientificComputingTheGame.model.AlleKurse;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import main.java.ScientificComputingTheGame.model.Frage;
import main.java.ScientificComputingTheGame.model.AlleKurse.TheoretischeInformatik;

public class TheoretischeInformatikTest {

	TheoretischeInformatik tiTest = new TheoretischeInformatik();

	@Test
	public void testAllMethods() {
		tiTest.setAnzahlGestellterFragen(2);
		tiTest.setAnzahlRichtigBeantworteterFragen(2);
		tiTest.setIstPruefungsFrage(true);
		//Assert.assertTrue(testGetFragen());
		Assert.assertSame(2, tiTest.getAnzahlGestellterFragen());
		Assert.assertSame(2, tiTest.getAnzahlRichtigBeantworteterFragen());
		Assert.assertTrue(tiTest.getIstPruefungsFrage());
		Assert.assertSame(TheoretischeInformatik.name, tiTest.getName());
		Assert.assertSame(2, tiTest.getAnzahlZuBeantwortenderFragen());
		Assert.assertSame(5, tiTest.getECTS());
		Assert.assertSame(TheoretischeInformatik.beschreibung, tiTest.getBeschreibung());
	}

	public boolean testGetFragen() {
		int equals = 0;
		ArrayList<Frage> fragen = tiTest.getFragen();
		for (int i = 0; i < TheoretischeInformatik.alleFragen.length; i++) {
			for (int j = 0; j < fragen.size(); j++)
				if ((TheoretischeInformatik.alleFragen[i][0] + " Die Antwortmoeglichkeiten sind: "
						+ TheoretischeInformatik.alleFragen[i][1]).equals(fragen.get(j).getFrage())
						&& TheoretischeInformatik.alleFragen[i][2].equals(fragen.get(j).getAntwort())) {
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
