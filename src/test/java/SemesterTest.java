package main.java.ScientificComputingTheGame.model.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.java.ScientificComputingTheGame.model.Semester;

class SemesterTest {

	@Test
	void testgetKurse() {
		Semester semester1 = new Semester(null, 1);
		assertTrue(semester1.getKurse(null).isEmpty());
	}
	
	void testgetId() {
		int randomSemester = (int )(Math.random() * 10);
		Semester semester1 = new Semester(null, randomSemester);
		assertTrue(randomSemester == semester1.getId());
	}
	
	void testfragenAbrufen() {
		fail("Not yet implemented");
	}
}
