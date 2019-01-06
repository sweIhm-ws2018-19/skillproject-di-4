package test.java.ScientificComputingTheGame.model;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import main.java.ScientificComputingTheGame.model.Kurs;
import main.java.ScientificComputingTheGame.model.Semester;
import main.java.ScientificComputingTheGame.model.AlleKurse.Analysis;


class SemesterTest {
	
	ArrayList<Kurs> testKurse;
	Semester sem1Test = new Semester(testKurse,1);

	@Test
	void testAllMethods() {
		Assert.assertNull(sem1Test.waehleAWFach());
		Assert.assertSame(1, sem1Test.getId());
		//ruefungsPhaseBeginnen?
		//getOffeneKurse?
		Assert.assertSame(new Analysis(),sem1Test.getFrage("Analysis"));
	}

}
