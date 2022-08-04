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

public class IrAPQRD implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Open.url("https://www.aerocivil.gov.co/"),
                WaitUntil.the(PQRSD, isEnabled()),
                Click.on(PQRSD),
                WaitUntil.the(PREGUNTAS_FRECUENTES, isVisible()),
                Click.on(PREGUNTAS_FRECUENTES)
        );
    }

    public static IrAPQRD enHomePage(){
        return instrumented(IrAPQRD.class, "");
    }

}
