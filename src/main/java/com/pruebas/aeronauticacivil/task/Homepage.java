package com.pruebas.aeronauticacivil.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.pruebas.aeronauticacivil.ui.Navegation.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Homepage implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url("https://www.aerocivil.gov.co/"),
                WaitUntil.the(TRANSPARENCIA, isVisible()),
                Click.on(TRANSPARENCIA),
                WaitUntil.the(PRESUPUESTO,isEnabled()),
                Click.on(PRESUPUESTO),
                WaitUntil.the(ESTADOS_FINANCIEROS,isVisible()),
                Click.on(ESTADOS_FINANCIEROS)
        );
    }

    public static Homepage menuPrincipal(){
        return instrumented(Homepage.class,"");
    }


}
