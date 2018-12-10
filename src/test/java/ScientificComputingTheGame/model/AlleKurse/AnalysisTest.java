package test.java.ScientificComputingTheGame.model.AlleKurse;

import org.junit.Assert;
import org.junit.jupiter.api.*;
import main.java.ScientificComputingTheGame.model.AlleKurse.Analysis;


class AnalysisTest {
	
	private Analysis testAnalysis = new Analysis();
	private String[][] alleFragen = {
			{"Dies ist Frage 1 aus Analysis. Die Richtige Antwort ist A.", " A, B, C, D", "A"}, 
			{"Dies ist Frage 2 aus Analysis. Die Richtige Antwort ist A.", " A, B, C, D", "A"},
			{"Dies ist Frage 3 aus Analysis. Die Richtige Antwort ist A.", " A, B, C, D", "A"},
			{"Dies ist Frage 4 aus Analysis. Die Richtige Antwort ist A.", " A, B, C, D", "A"}};

	@Test
	void testAnalysis() {
		Assert.assertSame("Analysis", testAnalysis.getName());
		Assert.assertSame(2, testAnalysis.getAnzahlZuBeantwortenderFragen());
		Assert.assertSame(5, testAnalysis.getECTS());
		Assert.assertSame(alleFragen, testAnalysis.getFragen());
	}

}
