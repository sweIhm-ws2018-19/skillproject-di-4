package test.java.ScientificComputingTheGame.model.AlleKurse;

import org.junit.*;
import main.java.ScientificComputingTheGame.model.AlleKurse.ITSysteme1;

class ITSysteme1Test {
	
	private ITSysteme1 testITSys = new ITSysteme1();
	
	@Test
	void testAllMethods() {
		Assert.assertSame(ITSysteme1.alleFragen, testITSys.getFragen());
		Assert.assertSame(ITSysteme1.name, testITSys.getName());
		Assert.assertSame(2, testITSys.getAnzahlZuBeantwortenderFragen());
		Assert.assertSame(5, testITSys.getECTS());
	}

}
