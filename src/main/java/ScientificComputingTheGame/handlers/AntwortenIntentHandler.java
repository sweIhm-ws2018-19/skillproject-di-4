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


public class AntwortenIntentHandler implements RequestHandler {
	
	ScientificComputingTheGame s;
	public AntwortenIntentHandler(ScientificComputingTheGame s) {
		this.s = s;
	}
	

    @Override
    public boolean canHandle(HandlerInput input) {
		return input.matches(intentName("AntwortenIntent"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        String speechText = "!ERROR: Es konnte nicht auf den Slot zugegriffen werden!";
    	
    	Request request = input.getRequestEnvelope().getRequest();
		IntentRequest intentRequest = (IntentRequest) request;
		Intent intent = intentRequest.getIntent();
		Map<String, Slot> slots = intent.getSlots();
		Slot possibleAnswer = slots.get("Antwort");
		input.getAttributesManager().setSessionAttributes(Collections.singletonMap(possibleAnswer.getValue(), "Antwort"));
		
		if(possibleAnswer.getValue() != null) {
			if (possibleAnswer.getValue().equals(s.getAntwort().getAntwort())) {
				speechText = "Deine Antwort war richtig. Moechtest du mit der naechsten Frage fortfahren?";
			} else {speechText = "Deine Antwort war falsch. Moechtest du mit der naechsten Frage fortfahren?";}
		}
		
        //speechText = kindOfQuestion.getValue();

        String repromptText = "Hier wird bald die erste Frage erscheinen. Work in Progress";
        return input.getResponseBuilder()
                .withSimpleCard("FrageStellen", speechText)
                .withSpeech(speechText)
                .withReprompt(repromptText)
                .withShouldEndSession(false)
                .build();
    }
}
