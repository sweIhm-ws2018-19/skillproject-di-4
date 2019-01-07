package test.java.ScientificComputingTheGame.model.AlleKurse;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import main.java.ScientificComputingTheGame.model.Frage;
import main.java.ScientificComputingTheGame.model.AlleKurse.DiskreteMathematik;

public class DiskreteMathematikTest {

	DiskreteMathematik dmTest = new DiskreteMathematik();

	@Test
	public void testAllMethods() {
		dmTest.setAnzahlGestellterFragen(2);
		dmTest.setAnzahlRichtigBeantworteterFragen(2);
		dmTest.setIstPruefungsFrage(true);
		//Assert.assertTrue(testGetFragen());
		Assert.assertSame(2, dmTest.getAnzahlGestellterFragen());
		Assert.assertSame(2, dmTest.getAnzahlRichtigBeantworteterFragen());
		Assert.assertTrue(dmTest.getIstPruefungsFrage());
		Assert.assertSame(DiskreteMathematik.name, dmTest.getName());
		Assert.assertSame(2, dmTest.getAnzahlZuBeantwortenderFragen());
		Assert.assertSame(5, dmTest.getECTS());
		Assert.assertSame(DiskreteMathematik.beschreibung, dmTest.getBeschreibung());
	}

	public boolean testGetFragen() {
		int equals = 0;
		ArrayList<Frage> fragen = dmTest.getFragen();
		for (int i = 0; i < DiskreteMathematik.alleFragen.length; i++) {
			for (int j = 0; j < fragen.size(); j++)
				if ((DiskreteMathematik.alleFragen[i][0] + " Die Antwortmoeglichkeiten sind: "
						+ DiskreteMathematik.alleFragen[i][1]).equals(fragen.get(j).getFrage())
						&& DiskreteMathematik.alleFragen[i][2].equals(fragen.get(j).getAntwort())) {
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
