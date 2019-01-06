package test.java.ScientificComputingTheGame.model;

import org.junit.Assert;
import org.junit.Test;

import main.java.ScientificComputingTheGame.model.Spieler;
import main.java.ScientificComputingTheGame.model.AlleKurse.Analysis;

public class SpielerTest {
	
	Spieler spielerTest = new Spieler(1);

	@Test
	public void testallMethods() {
		Assert.assertSame(0, spielerTest.getECTS());
		Assert.assertSame(new Analysis(), spielerTest.getFrage("Analysis"));
		spielerTest.addECTS(1);
		Assert.assertSame(1,spielerTest.getECTS());
	}

}
