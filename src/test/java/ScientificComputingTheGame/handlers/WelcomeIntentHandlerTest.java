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

import main.java.ScientificComputingTheGame.handlers.WelcomeIntentHandler;
import main.java.ScientificComputingTheGame.model.ScientificComputingTheGame;

public class WelcomeIntentHandlerTest {
	private WelcomeIntentHandler handler;

	@Before
	public void setup() {
		handler = new WelcomeIntentHandler(new ScientificComputingTheGame());
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
		Assert.assertTrue(response.getOutputSpeech().toString()
				.contains(". Du bist jetzt im ersten Semester. Deine Kurse fuer dieses Semester sind: \n "
						+ "Softwareentwicklung 1, IT-Systeme 1, Lineare Algebra, Analysis und Mathematische Konzepte und Beweise.\n"
						+ "Um das Studium abzuschliessen, musst du in jedem Semester alle Pruefungen bestehen. Damit du eine Pruefung"
						+ "bestehst, musst du alle gestellten Fragen richtig beantworten. Vorher hast du die Moeglichkeit in jedem Fach "
						+ "Uebungsfragen zu beantworten, um ein Gefuehl fuer die Pruefung zu bekommen. Es ist also so aehnlich wie in der Fahrschule."
						+ "Was? Du hast noch keinen Fuehrerschein? Dann spiel das Spiel schnell durch und geh zur Fahrschule, du fauler Sack Mu Ha Ha Ha! "
						+ "Also, wie schaut's aus? Sage mir, ob du die Pruefungs- oder die Uebungsaufgaben bearbeiten willst und aus welchem Fach diese stammen sollen. "));

	}
}
