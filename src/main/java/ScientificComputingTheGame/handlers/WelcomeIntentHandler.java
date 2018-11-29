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
		String speechText = s.getOutput()+". Du bist jetzt im ersten Semester. Deine Kurse f�r dieses Semester sind: \n "
				+ "Softwareentwicklung 1, IT-Systeme 1, Lineare Algebra, Analysis und Mathematische Konzepte und Beweise.\n"
				+ "Um das Studium abzuschlie�en, musst du in jedem Semester alle Pr�fungen bestehen. Damit du eine Pr�fung"
				+ "bestehst, musst du alle gestellten Fragen richtig beantworten. Vorher hast du die M�glichkeit in jedem Fach "
				+ "�bungsfragen zu beantworten, um ein Gef�hl f�r die Pr�fung zu bekommen. Es ist also so �hnlich wie in der Fahrschule."
				+ "Was? Du hast noch keinen F�hrerschein? Dann spiel das Spiel schnell durch und geh zur Fahrschule, du fauler Sack Mu Ha Ha Ha! "
				+ "Also, wie schaut's aus? Sage mir, ob du die Pr�fungs- oder die �bungsaufgaben bearbeiten willst und aus welchem Fach diese stammen sollen. ";
		
		
		return input.getResponseBuilder()
				.withSpeech(speechText)
				.withSimpleCard("helloworld", speechText)
				.withShouldEndSession(false)
				.build();
	}

}
