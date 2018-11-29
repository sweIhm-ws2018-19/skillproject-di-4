package main.java.ScientificComputingTheGame.handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;
import static com.amazon.ask.request.Predicates.requestType;
import static com.amazon.ask.request.Predicates.intentName;
import com.amazon.ask.response.ResponseBuilder;


public class FrageStellenIntentHandler implements RequestHandler {
    @Override
    public boolean canHandle(HandlerInput input) {
		return input.matches(intentName("FrageStellen"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        String speechText = "Hier wird bald die erste Frage erscheinen. Work in Progress";
        String repromptText = "Hier wird bald die erste Frage erscheinen. Work in Progress";
        return input.getResponseBuilder()
                .withSimpleCard("FrageStellen", speechText)
                .withSpeech(speechText)
                .withReprompt(repromptText)
                .withShouldEndSession(false)
                .build();
    }
}
