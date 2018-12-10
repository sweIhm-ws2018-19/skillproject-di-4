package test.java.ScientificComputingTheGame.model.AlleKurse;

import org.junit.*;
import main.java.ScientificComputingTheGame.model.AlleKurse.Analysis;

class AnalysisTest {
	
	private Analysis testAnalysis = new Analysis();

	@Test
	void testAllMethods() {
		Assert.assertSame(Analysis.alleFragen, testAnalysis.getFragen());
		Assert.assertSame(Analysis.name, testAnalysis.getName());
		Assert.assertSame(2, testAnalysis.getAnzahlZuBeantwortenderFragen());
		Assert.assertSame(5, testAnalysis.getECTS());
	}
	
}
