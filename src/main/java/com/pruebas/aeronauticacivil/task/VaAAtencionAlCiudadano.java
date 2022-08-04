package com.pruebas.aeronauticacivil.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

import static com.pruebas.aeronauticacivil.ui.Navegation.ATENCION_AL_CIUDADANO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class VaAAtencionAlCiudadano implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Open.url("https://www.aerocivil.gov.co/"),
                Click.on(ATENCION_AL_CIUDADANO)
        );



    }

    public static VaAAtencionAlCiudadano a(){
        return instrumented(VaAAtencionAlCiudadano.class,"");
    }
}
