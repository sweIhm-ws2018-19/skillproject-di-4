package main.java.ScientificComputingTheGame.handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Intent;
import com.amazon.ask.model.IntentRequest;
import com.amazon.ask.model.Request;
import com.amazon.ask.model.Response;
import com.amazon.ask.model.Slot;

import java.util.Collections;
import java.util.Map;


import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;
import main.java.ScientificComputingTheGame.model.ScientificComputingTheGame;


public class BeschreibungIntentHandler implements RequestHandler {
	
	ScientificComputingTheGame s;
	public BeschreibungIntentHandler(ScientificComputingTheGame s) {
		this.s = s;
	}
	

    @Override
    public boolean canHandle(HandlerInput input) {
		return input.matches(intentName("BeschreibungIntent"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        String speechText = "!ERROR: Es konnte nicht auf den Slot zugegriffen werden!";
    	
    	Request request = input.getRequestEnvelope().getRequest();
		IntentRequest intentRequest = (IntentRequest) request;
		Intent intent = intentRequest.getIntent();
		Map<String, Slot> slots = intent.getSlots();
		Slot Beschreibung = slots.get("Beschreibung");
		input.getAttributesManager().setSessionAttributes(Collections.singletonMap(Beschreibung.getValue(), "Beschreibung"));

		
		String frage = s.getFrage(Beschreibung.getValue());
		int quote=0;
		if (!s.kursDerFrage.getBeschreibung().equals(null)) {
			speechText = s.kursDerFrage.getBeschreibung();
		}
		
    	
        String repromptText = "Hier wird bald die erste Frage erscheinen. Work in Progress";
        return input.getResponseBuilder()
                .withSimpleCard("SCTG", speechText)
                .withSpeech(speechText)
                .withReprompt(repromptText)
                .withShouldEndSession(false)
                .build();
    }
}
