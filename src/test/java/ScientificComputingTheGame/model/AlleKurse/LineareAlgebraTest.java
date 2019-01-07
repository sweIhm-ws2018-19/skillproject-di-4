package test.java.ScientificComputingTheGame.model.AlleKurse;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import main.java.ScientificComputingTheGame.model.Frage;
import main.java.ScientificComputingTheGame.model.AlleKurse.LineareAlgebra;

public class LineareAlgebraTest {

	LineareAlgebra linAlgTest = new LineareAlgebra();

	@Test
	public void testAllMethods() {
		linAlgTest.setAnzahlGestellterFragen(2);
		linAlgTest.setAnzahlRichtigBeantworteterFragen(2);
		linAlgTest.setIstPruefungsFrage(true);
		//Assert.assertTrue(testGetFragen());
		Assert.assertSame(2, linAlgTest.getAnzahlGestellterFragen());
		Assert.assertSame(2, linAlgTest.getAnzahlRichtigBeantworteterFragen());
		Assert.assertTrue(linAlgTest.getIstPruefungsFrage());
		Assert.assertSame(LineareAlgebra.name, linAlgTest.getName());
		Assert.assertSame(2, linAlgTest.getAnzahlZuBeantwortenderFragen());
		Assert.assertSame(5, linAlgTest.getECTS());
		Assert.assertSame(LineareAlgebra.beschreibung, linAlgTest.getBeschreibung());
	}

	public boolean testGetFragen() {
		int equals = 0;
		ArrayList<Frage> fragen = linAlgTest.getFragen();
		for (int i = 0; i < LineareAlgebra.alleFragen.length; i++) {
			for (int j = 0; j < fragen.size(); j++)
				if ((LineareAlgebra.alleFragen[i][0] + " Die Antwortmoeglichkeiten sind: " + LineareAlgebra.alleFragen[i][1])
						.equals(fragen.get(j).getFrage())
						&& LineareAlgebra.alleFragen[i][2].equals(fragen.get(j).getAntwort())) {
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
