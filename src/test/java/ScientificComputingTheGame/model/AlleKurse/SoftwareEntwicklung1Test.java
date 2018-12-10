package test.java.ScientificComputingTheGame.model.AlleKurse;

import org.junit.*;

import main.java.ScientificComputingTheGame.model.AlleKurse.SoftwareEntwicklung1;


class SoftwareEntwicklung1Test {
	
	private SoftwareEntwicklung1 testSoftEnt = new SoftwareEntwicklung1();
	

	@Test
	void testAllMethods() {
		Assert.assertSame(SoftwareEntwicklung1.alleFragen, testSoftEnt.getFragen());
		Assert.assertSame(SoftwareEntwicklung1.name, testSoftEnt.getName());
		Assert.assertSame(2, testSoftEnt.getAnzahlZuBeantwortenderFragen());
		Assert.assertSame(5, testSoftEnt.getECTS());
	}

}
