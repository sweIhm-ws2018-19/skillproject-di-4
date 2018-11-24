package main.java.ScientificComputingTheGame.model.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.java.ScientificComputingTheGame.model.Semester;

class SemesterTest {

	@Test
	void testgetKurse() {
		Semester semester1 = new Semester(1);
		assertTrue(semester1.getKurse().isEmpty());
	}
	
	void testgetId() {
		int randomSemester = (int )(Math.random() * 10);
		Semester semester1 = new Semester(randomSemester);
		assertTrue(randomSemester == semester1.getId());
	}
	
	void testaddKurs() {
		Semester semester2 = new Semester(1);
		int sizeBefore = semester2.getKurse().size();
		semester2.addKurs(null);
		int sizeAfter = semester2.getKurse().size();
		assertTrue(sizeBefore+1 == sizeAfter);
	}
	
	void testfragenAbrufen() {
		fail("Not yet implemented");
	}
}
