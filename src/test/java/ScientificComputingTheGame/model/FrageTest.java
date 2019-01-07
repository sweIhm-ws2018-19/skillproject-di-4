package test.java.ScientificComputingTheGame.model;

import org.junit.Assert;
import org.junit.Test;

import main.java.ScientificComputingTheGame.model.Frage;

public class FrageTest {

	private String[] testFrage = { "Frage", "moeglicheLsg", "Antwort" };
	private Frage frage = new Frage(testFrage);

	@Test
	public void testAllMethods() {
		//Assert.assertSame(testFrage[0] + " Die Antwortmoeglichkeiten sind: " + testFrage[1], frage.getFrage());
		Assert.assertSame(testFrage[2], frage.getAntwort());
		// frageStellen?
		// frageWiederholen?
		Assert.assertSame("A", frage.antwortAbwarten());
		Assert.assertTrue(frage.antwortRichtig("Antwort"));
	}

}
