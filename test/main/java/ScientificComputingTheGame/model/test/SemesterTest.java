package main.java.ScientificComputingTheGame.model.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.java.ScientificComputingTheGame.model.Semester1;

class SemesterTest {

	@Test
	void testgetKurse() {
		Semester1 semester1 = new Semester1(1);
		assertTrue(semester1.getKurse().isEmpty());
	}
	
	void testgetId() {
		int randomSemester = (int )(Math.random() * 10);
		Semester1 semester1 = new Semester1(randomSemester);
		assertTrue(randomSemester == semester1.getId());
	}
	
	void testaddKurs() {
		Semester1 semester2 = new Semester1(1);
		int sizeBefore = semester2.getKurse().size();
		semester2.addKurs(null);
		int sizeAfter = semester2.getKurse().size();
		assertTrue(sizeBefore+1 == sizeAfter);
	}
	
	void testfragenAbrufen() {
		fail("Not yet implemented");
	}
}
