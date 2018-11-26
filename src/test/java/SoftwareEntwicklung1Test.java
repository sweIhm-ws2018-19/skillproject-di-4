package main.java.ScientificComputingTheGame.model.test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import main.java.ScientificComputingTheGame.model.Frage;
import main.java.ScientificComputingTheGame.model.AlleKurse.SoftwareEntwicklung1;

class SoftwareEntwicklung1Test extends KursTest {

	@Test
	void testGetName() {
		SoftwareEntwicklung1 testKurs1 = new SoftwareEntwicklung1();
		assertTrue("Software Entwicklung 1" == testKurs1.getName());
	}
	
	void testGetFragen() {
		SoftwareEntwicklung1 testKurs2 = new SoftwareEntwicklung1();
		ArrayList<Frage> testFragen = testKurs2.getFragen();
		assertTrue(2 == testFragen.size() && testFragen.get(0) != testFragen.get(1));
	}
	
	void testGetAnzahlZuBeantwortenderFragen() {
		SoftwareEntwicklung1 testKurs3 = new SoftwareEntwicklung1();
		assertTrue(testKurs3.getAnzahlZuBeantwortenderFragen() == 2);
	}
}
