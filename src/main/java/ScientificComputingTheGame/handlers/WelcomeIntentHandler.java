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
		ScientificComputingTheGame.main(null);
		String speechText = s.getOutput()+". Du bist jetzt im ersten Semester. Deine Kurse fuer dieses Semester sind: \n "
				+ "Softwareentwicklung 1, IT-Systeme 1, Lineare Algebra, Analysis und Mathematische Konzepte und Beweise.\n"
				+ "Um das Studium abzuschlieﬂen, musst du in jedem Semester alle Pruefungen bestehen. Damit du eine Pruefung"
				+ "bestehst, musst du alle gestellten Fragen richtig beantworten. Vorher hast du die Moeglichkeit in jedem Fach "
				+ "Uebungsfragen zu beantworten, um ein Gefuehl fuer die Pruefung zu bekommen. Es ist also so aehnlich wie in der Fahrschule."
				+ "Was? Du hast noch keinen Fuehrerschein? Dann spiel das Spiel schnell durch und geh zur Fahrschule, du fauler Sack Mu Ha Ha Ha! "
				+ "Also, wie schaut's aus? Sage mir, ob du die Pruefungs- oder die Uebungsaufgaben bearbeiten willst und aus welchem Fach diese stammen sollen. ";
		
		
		return input.getResponseBuilder()
				.withSpeech(speechText)
				.withSimpleCard("helloworld", speechText)
				.withShouldEndSession(false)
				.build();
	}

}
