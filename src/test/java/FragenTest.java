package main.java.ScientificComputingTheGame.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.java.ScientificComputingTheGame.model.Frage;

class FragenTest {

	@Test
	void testAntwortRichtig() {
		String[] neueFrage = {"A", "B", "C"};
		Frage frage1 = new Frage(neueFrage);
		assertTrue(frage1.antwortRichtig("C"));
	}
}
