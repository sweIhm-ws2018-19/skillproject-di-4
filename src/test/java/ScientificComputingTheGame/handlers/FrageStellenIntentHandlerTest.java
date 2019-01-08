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

import main.java.ScientificComputingTheGame.handlers.FrageStellenIntentHandler;
import main.java.ScientificComputingTheGame.model.ScientificComputingTheGame;

public class FrageStellenIntentHandlerTest {
	private FrageStellenIntentHandler handler;

	@Before
	public void setup() {
		//handler = new FrageStellenIntentHandler(sctg);
	}

	@Test
	public void testCanHandle() {
		/*final HandlerInput inputMock = Mockito.mock(HandlerInput.class);
		when(inputMock.matches(any())).thenReturn(true);
		Assert.assertTrue(handler.canHandle(inputMock));*/
	}

	@Test
	public void testHandle() {
		/* Test nicht korrket: es muss ein RequestEnvelope aufgebaut werden */
		/*
		final HandlerInput inputMock = Mockito.mock(HandlerInput.class);
		when(inputMock.getResponseBuilder()).thenReturn(new ResponseBuilder());

		final Optional<Response> returnResponse = handler.handle(inputMock);

		Assert.assertTrue(returnResponse.isPresent());

		final Response response = returnResponse.get();
		Assert.assertFalse(response.getShouldEndSession());
		Assert.assertTrue(response.getOutputSpeech().toString().contains("Die Antwort ist"));
        */
	}

}
