package test.java.ScientificComputingTheGame.model.AlleKurse;

import org.junit.*;

import main.java.ScientificComputingTheGame.model.AlleKurse.LineareAlgebra;

class LineareAlgebraTest {
	private LineareAlgebra testLinAlg = new LineareAlgebra();

	@Test
	void testAllMethods() {
		Assert.assertSame(LineareAlgebra.alleFragen, testLinAlg.getFragen());
		Assert.assertSame(LineareAlgebra.name, testLinAlg.getName());
		Assert.assertSame(2, testLinAlg.getAnzahlZuBeantwortenderFragen());
		Assert.assertSame(5, testLinAlg.getECTS());
	}

}
