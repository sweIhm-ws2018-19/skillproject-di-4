package test.java.ScientificComputingTheGame.model.AlleKurse;

import org.junit.*;
import main.java.ScientificComputingTheGame.model.AlleKurse.MKB;

class MKBTest {
	private MKB testMKB = new MKB();

	@Test
	void testAllMethods() {
		Assert.assertSame(MKB.alleFragen, testMKB.getFragen());
		Assert.assertSame(MKB.name, testMKB.getName());
		Assert.assertSame(2, testMKB.getAnzahlZuBeantwortenderFragen());
		Assert.assertSame(5, testMKB.getECTS());
	}
}
