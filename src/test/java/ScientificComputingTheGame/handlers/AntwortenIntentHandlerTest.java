package test.java.ScientificComputingTheGame.handlers;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.model.Response;
import com.amazon.ask.response.ResponseBuilder;

import main.java.ScientificComputingTheGame.handlers.AntwortenIntentHandler;
import main.java.ScientificComputingTheGame.model.ScientificComputingTheGame;

public class AntwortenIntentHandlerTest {
	private ScientificComputingTheGame sctg = new ScientificComputingTheGame();
	private AntwortenIntentHandler handler;

	@Before
	public void setup() {
		handler = new AntwortenIntentHandler(sctg);
		//ScientificComputingTheGame.main(null);
	}

	@Test
	public void testCanHandle() {
		final HandlerInput inputMock = Mockito.mock(HandlerInput.class);
		when(inputMock.matches(any())).thenReturn(true);
		Assert.assertTrue(handler.canHandle(inputMock));
	}

	@Test
	public void testHandle() {
		final HandlerInput inputMock = Mockito.mock(HandlerInput.class);
		when(inputMock.getResponseBuilder()).thenReturn(new ResponseBuilder());

		final Optional<Response> returnResponse = handler.handle(inputMock);

		Assert.assertTrue(returnResponse.isPresent());
		final Response response = returnResponse.get();
		Assert.assertFalse(response.getShouldEndSession());
		Assert.assertTrue(response.getOutputSpeech().toString().contains(
				" Herzlichen Glueckwunsch! Nun hast du dieses Semester geschafft! Deine neuen Kurse stehen bereit."
						+ " Herzlichen Glueckwunsch! Du hast diesen Kurs mit Erfolg abgelegt! Nun musst du hier keine Pruefungsfragen mehr beantworten, um das Semester zu bestehen."
						+ "Deine Antwort war falsch. Sage mir, ob du als naechstes eine Pruefungs- oder eine Uebungsaufgabe bearbeiten willst und aus welchem Fach diese stammen soll. "
						+ "Deine Antwort war richtig. Sage mir, ob du als naechstes eine Pruefungs- oder eine Uebungsaufgabe bearbeiten willst und aus welchem Fach diese stammen soll. "));
	}

}
