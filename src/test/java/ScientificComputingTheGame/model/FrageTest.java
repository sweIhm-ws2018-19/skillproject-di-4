package test.java.ScientificComputingTheGame.model;

import org.junit.*;

import main.java.ScientificComputingTheGame.model.Frage;
import main.java.ScientificComputingTheGame.model.AlleKurse.Analysis;

class FrageTest {
	private Frage testFrage = new Frage(Analysis.alleFragen[0]);

	@Test
	void testAllMethods() {
		Assert.assertSame(Analysis.alleFragen[0][0] + Analysis.alleFragen[0][1], testFrage.getFrage());
		Assert.assertSame(Analysis.alleFragen[0][2], testFrage.getAntwort());
		Assert.assertSame("A", testFrage.antwortAbwarten()); //TODO mock?
		Assert.assertTrue(testFrage.antwortRichtig(Analysis.alleFragen[0][2]));
	}

}
