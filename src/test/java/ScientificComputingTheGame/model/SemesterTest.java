package test.java.ScientificComputingTheGame.model;

import java.util.ArrayList;
import org.junit.*;
import main.java.ScientificComputingTheGame.model.Kurs;
import main.java.ScientificComputingTheGame.model.Semester;
import main.java.ScientificComputingTheGame.model.AlleKurse.Analysis;
import main.java.ScientificComputingTheGame.model.AlleKurse.ITSysteme1;
import main.java.ScientificComputingTheGame.model.AlleKurse.LineareAlgebra;
import main.java.ScientificComputingTheGame.model.AlleKurse.MKB;
import main.java.ScientificComputingTheGame.model.AlleKurse.SoftwareEntwicklung1;

class SemesterTest {
	
	private ArrayList<Kurs> kurse;
	private Semester testSemester = new Semester(kurse, 1);
	
	@Test
	void testAllMethods() {
		//TODO
		kurse.add(new SoftwareEntwicklung1());
		kurse.add(new LineareAlgebra());
		kurse.add(new Analysis());
		kurse.add(new MKB());
		kurse.add(new ITSysteme1());
		Assert.assertSame(kurse, testSemester.getKurse(null));
		Assert.assertSame(null, testSemester.waehleAWFach());
		Assert.assertSame(1, testSemester.getId());
//		Assert.assertSame(void, testSemester); mock ? //TODO
		Assert.assertSame(kurse,testSemester.getOffeneKurse());
//		Assert.assertSame(expected, testSemester.getFrage(kurs)); //mock TODO
	}

}
