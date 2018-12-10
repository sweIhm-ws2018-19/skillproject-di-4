package main.java.ScientificComputingTheGame.handlers;

import static com.amazon.ask.request.Predicates.intentName;

import java.util.Optional;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import main.java.ScientificComputingTheGame.model.ScientificComputingTheGame;

public class AntwortIntentHandler implements RequestHandler{
	ScientificComputingTheGame s;
	
	public AntwortIntentHandler(ScientificComputingTheGame s) {
		this.s = s;
	}

	@Override
	public boolean canHandle(HandlerInput input) {
		return input.matches(intentName("AntwortIntent"));
	}

	@Override
	public Optional<Response> handle(HandlerInput input) {
		//Frage finden, damit die Antwort validiert werden kann
		if(true/*Antwort ist richtig*/) {
			//setzte richtig = true
			//Gebe zurueck, dass Antwort korrekt
		}
		else {
			//Gebe zurueck, dass Antwort falsch und sage richtige Antwort
		}
		if(true/*Pruefung*/) {
			//counter erhoehen wie viele Fragen noch beantwortet werden muessen
			if(true/*richtig == true*/) {
			//richtige Antworten counter erhoeht werden
			}
		}
		
		String speechText = s.getOutput()+"Deine Antwort war richtig";
		
		return input.getResponseBuilder()
				.withSpeech(speechText)
				.withSimpleCard("helloworld", speechText)
				.withShouldEndSession(false)
				.build();
	}

}
