package com.pruebas.aeronauticacivil.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static com.pruebas.aeronauticacivil.ui.Navegation.ESFNOV2021;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class AbreDocumento implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        OnStage.theActorInTheSpotlight().attemptsTo(

                WaitUntil.the(ESFNOV2021,isEnabled()),
                Click.on(ESFNOV2021)


        );
    }

    public static AbreDocumento en(){
        return instrumented (AbreDocumento.class,"");
    }
}
