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


public class StatusIntentHandler implements RequestHandler {
	
	ScientificComputingTheGame s;
	public StatusIntentHandler(ScientificComputingTheGame s) {
		this.s = s;
	}
	

    @Override
    public boolean canHandle(HandlerInput input) {
		return input.matches(intentName("StatusIntent"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        String speechText = "!ERROR: Es konnte nicht auf den Slot zugegriffen werden!";
    	
    	Request request = input.getRequestEnvelope().getRequest();
		IntentRequest intentRequest = (IntentRequest) request;
		Intent intent = intentRequest.getIntent();
		Map<String, Slot> slots = intent.getSlots();
		Slot Course = slots.get("Course");
		input.getAttributesManager().setSessionAttributes(Collections.singletonMap(Course.getValue(), "Course"));

		
		String frage = s.getFrage(Course.getValue());
		int quote=0;
		if (s.kursDerFrage.getAnzahlGestellterFragen()!=0) {
			quote =((s.kursDerFrage.getAnzahlRichtigBeantworteterFragen()*100)/(s.kursDerFrage.getAnzahlGestellterFragen()));
		}
		
		speechText = "Um zu bestehen, musst du bei mindestens 10 beantworteter Fragen "
				+ "eine Erfolgsrate von mindestens 80 Prozent vorweisen. "
				+ "Du hast bis jetzt "+s.kursDerFrage.getAnzahlGestellterFragen()+" Pruefungsfragen beantwortet und deine Quote liegt bei "
				+ quote	+ " Prozent. ";
		
			
		
    	
        String repromptText = "Hier wird bald die erste Frage erscheinen. Work in Progress";
        return input.getResponseBuilder()
                .withSimpleCard("SCTG", speechText)
                .withSpeech(speechText)
                .withReprompt(repromptText)
                .withShouldEndSession(false)
                .build();
    }
}
