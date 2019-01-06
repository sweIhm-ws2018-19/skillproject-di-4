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
		
		int quote = 0;
		if(possibleAnswer.getValue() != null) {
			if (possibleAnswer.getValue().toLowerCase().equals(ScientificComputingTheGame.getAntwort().getAntwort().toLowerCase())) {
				
				if(s.kursDerFrage.istPruefungsFrage) {
					s.kursDerFrage.anzahlRichtigBeantworteterFragen++;
					s.kursDerFrage.istPruefungsFrage=false;
				}
				
				speechText = "Deine Antwort war richtig. Sage mir, ob du als naechstes eine Pruefungs- oder eine Uebungsaufgabe bearbeiten willst und aus welchem Fach diese stammen soll. ";
			} else {
				s.kursDerFrage.istPruefungsFrage=false;
				speechText = "Deine Antwort war falsch. Sage mir, ob du als naechstes eine Pruefungs- oder eine Uebungsaufgabe bearbeiten willst und aus welchem Fach diese stammen soll. ";
				}
			quote =((s.kursDerFrage.getAnzahlRichtigBeantworteterFragen()*100)/(s.kursDerFrage.getAnzahlGestellterFragen()));

			if (s.kursDerFrage.anzahlRichtigBeantworteterFragen>=1 && quote>=80) {
				speechText = " Herzlichen Glueckwunsch! Du hast diesen Kurs mit Erfolg abgelegt! Nun musst du hier keine Pruefungsfragen mehr beantworten, um das Semester zu bestehen.";
				
				if (s.getSemesterBestanden()) {
					speechText += " Herzlichen Glueckwunsch! Nun hast du dieses Semester geschafft! Deine neuen Kurse stehen bereit.";
					
				}
			}
		}
		

        String repromptText = "Hier wird bald die erste Frage erscheinen. Work in Progress";
        return input.getResponseBuilder()
                .withSimpleCard("Antworten", speechText)
                .withSpeech(speechText)
                .withReprompt(repromptText)
                .withShouldEndSession(false)
                .build();
    }
}
