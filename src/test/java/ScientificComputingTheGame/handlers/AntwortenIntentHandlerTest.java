package test.java.ScientificComputingTheGame.handlers;

import org.junit.Before;
import org.junit.Test;

import main.java.ScientificComputingTheGame.handlers.AntwortenIntentHandler;
import main.java.ScientificComputingTheGame.model.ScientificComputingTheGame;

public class AntwortenIntentHandlerTest {
	private AntwortenIntentHandler handler;
	
	@Before 
	public void setup() {
		handler = new AntwortenIntentHandler(new ScientificComputingTheGame());
		ScientificComputingTheGame.main(null);
	}
	
	@Test
	public void testAllMethods() {
		
	}

}
