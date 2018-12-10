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

		
		if (kindOfQuestion.getValue().equals("uebung")) {
			speechText = s.getFrage(kurs.getValue())+". Bitte sage nun 'Die Antwort ist' und nenne danach den Buchstaben der richtigen Antwort.";
		} else {
			if (kindOfQuestion.getValue().equals("pruefung")) {
				
				int quote=0;
				if (s.getAnzahlGestellterFragen()!=0) {
					quote =((s.getAnzahlRichtigBeantworteterFragen()*100)/(s.getAnzahlGestellterFragen()));
				}
				
				speechText = "Dies ist eine Pruefungsfrage. Um zu bestehen, musst du bei mindestens 10 beantworteter Fragen "
						+ "eine Erfolgsrate von mindestens 80 Prozent vorweisen. "
						+ "Du hast bis jetzt "+s.getAnzahlGestellterFragen()+" Pruefungsfragen beantwortet und deine Quote liegt bei "
						+ quote
						+ " Prozent. Deine naechste Frage lautet: "
						+ s.getFrage(kurs.getValue())+". "
						+ "Bitte sage nun 'Die Antwort ist' und nenne danach den Buchstaben der richtigen Antwort.";
				s.setAnzahlGestellterFragen(s.getAnzahlGestellterFragen()+1);
				s.setIstPruefungsFrage(true);
			}
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
