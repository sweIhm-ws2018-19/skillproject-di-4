/*
     Copyright 2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.

     Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file
     except in compliance with the License. A copy of the License is located at

         http://aws.amazon.com/apache2.0/

     or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS,
     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for
     the specific language governing permissions and limitations under the License.
*/

//

//Das ist ein Kommentar für den Michi, beste Grüße aus Hogwarts

package main.java.ScientificComputingTheGame;

import com.amazon.ask.Skill;
import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.Skills;
import main.java.ScientificComputingTheGame.handlers.FallbackIntentHandler;
import main.java.ScientificComputingTheGame.handlers.FrageStellenIntentHandler;
import main.java.ScientificComputingTheGame.handlers.HelpIntentHandler;
import main.java.ScientificComputingTheGame.handlers.LaunchRequestHandler;
import main.java.ScientificComputingTheGame.handlers.SessionEndedRequestHandler;
import main.java.ScientificComputingTheGame.handlers.WelcomeIntentHandler;
import main.java.ScientificComputingTheGame.model.ScientificComputingTheGame;
import main.java.ScientificComputingTheGame.handlers.CancelandStopIntentHandler;

public class ScientificComputingTheGameStreamHandler extends SkillStreamHandler {

    private static Skill getSkill() {
    	int Harry = 0;
    	ScientificComputingTheGame s = new ScientificComputingTheGame();
        return Skills.standard()
                .addRequestHandlers(
                        new LaunchRequestHandler(),
                        new CancelandStopIntentHandler(),
                        new SessionEndedRequestHandler(),
                        new HelpIntentHandler(),
                        new FallbackIntentHandler(),
                        new FrageStellenIntentHandler(s),
                        new WelcomeIntentHandler(s)
                        )
                // Add your skill id below
                .withSkillId("amzn1.ask.skill.6c52904c-e625-439f-bde3-4322e243883e")
                .build();
    }

    public ScientificComputingTheGameStreamHandler() {
        super(getSkill());
    }

}
