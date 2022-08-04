package com.pruebas.aeronauticacivil.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.pruebas.aeronauticacivil.ui.Navegation.AL_CIUDADANO;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class TramitesPage implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(AL_CIUDADANO, isVisible()),
                Click.on(AL_CIUDADANO)
        );
    }

    public static TramitesPage a(){
        return instrumented(TramitesPage.class,"");
    }
}
