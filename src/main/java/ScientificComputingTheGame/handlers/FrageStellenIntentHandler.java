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
import static com.amazon.ask.request.Predicates.requestType;
import static com.amazon.ask.request.Predicates.intentName;
import com.amazon.ask.response.ResponseBuilder;

import main.java.ScientificComputingTheGame.model.ScientificComputingTheGame;


public class FrageStellenIntentHandler implements RequestHandler {
	
	ScientificComputingTheGame s;
	public FrageStellenIntentHandler(ScientificComputingTheGame s) {
		this.s = s;
	}
	

    @Override
    public boolean canHandle(HandlerInput input) {
		return input.matches(intentName("FrageStellen"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        String speechText = "!ERROR: Es konnte nicht auf den Slot zugegriffen werden!";
    	
    	Request request = input.getRequestEnvelope().getRequest();
		IntentRequest intentRequest = (IntentRequest) request;
		Intent intent = intentRequest.getIntent();
		Map<String, Slot> slots = intent.getSlots();
		Slot kindOfQuestion = slots.get("Abfrage");
		input.getAttributesManager().setSessionAttributes(Collections.singletonMap(kindOfQuestion.getValue(), "Abfrage"));
		Slot kurs = slots.get("Kurs");
		input.getAttributesManager().setSessionAttributes(Collections.singletonMap(kurs.getValue(), "Kurs"));

		
		if (kindOfQuestion.getValue().equals("übung")) {
			speechText = s.getFrage(kurs.getValue());
		} else {speechText = "!ERROR: Keine Frage gefunden!";}
    	
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
