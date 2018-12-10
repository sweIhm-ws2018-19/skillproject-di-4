package test.java.ScientificComputingTheGame.model;

import org.junit.*;
import main.java.ScientificComputingTheGame.model.Spieler;

class SpielerTest {
	
	private Spieler testSpieler = new Spieler(1);

	@Test
	void testAllMethods() {
		//TODO
//		Assert.assertSame(Frage, testSpieler.getFrage(kursname)); mock ?
		Assert.assertSame(0, testSpieler.getECTS());
//		addECTS ??
	}

}
