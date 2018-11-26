package main.java.ScientificComputingTheGame.handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import main.java.ScientificComputingTheGame.model.ScientificComputingTheGame;

import java.util.Optional;
import static com.amazon.ask.request.Predicates.intentName;

public class WelcomeIntentHandler implements RequestHandler{
	ScientificComputingTheGame s;
	public WelcomeIntentHandler(ScientificComputingTheGame s) {
		this.s = s;
	}

	@Override
	public boolean canHandle(HandlerInput input) {
		// TODO Auto-generated method stub
		return input.matches(intentName("welcome"));
	}

	@Override
	public Optional<Response> handle(HandlerInput input) {
		//ScientificComputingTheGame s = new ScientificComputingTheGame();
		s.main(null);
		String speechText = s.getOutput()+". Du bist jetzt im ersten Semester bitte wähle deine Kurse";
		return input.getResponseBuilder()
				.withSpeech(speechText)
				.withSimpleCard("helloworld", speechText)
				.build();
	}

}
