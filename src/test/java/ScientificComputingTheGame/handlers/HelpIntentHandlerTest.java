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

import main.java.ScientificComputingTheGame.handlers.HelpIntentHandler;

public class HelpIntentHandlerTest {

	private HelpIntentHandler handler;

	@Before
	public void setup() {
		handler = new HelpIntentHandler();
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
		Assert.assertTrue(response.getOutputSpeech().toString()
				.contains("Dieses Spiel ist einem Quiz sehr aehnlich. Du beantwortest Fragen, steigst Level"
        		+ " beziehungsweise Semester auf und gewinnst, wenn du alle bestanden hast."
        		+ " Um Uebungsfragen zu erhalten sage: 'uebung' und das Fach oder 'pruefung' und das Fach,"
        		+ " um bei der Pruefung anzufangen oder fortzufahren."));
		Assert.assertTrue(response.getReprompt().toString().contains("Bitte sage mir Deine Lieblingsfarbe."));

	}

}
