package com.pruebas.aeronauticacivil.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static com.pruebas.aeronauticacivil.ui.Navegation.NOTICIAS;
import static com.pruebas.aeronauticacivil.ui.Navegation.OPCIONES;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class IrASuMajestadElUsuario implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url("https://www.aerocivil.gov.co/"),
                WaitUntil.the(OPCIONES, isEnabled()),
                Hit.the(Keys.ARROW_DOWN).into(OPCIONES),
                Hit.the(Keys.ENTER).into(OPCIONES)


        );
    }
    public static IrASuMajestadElUsuario desdeHomePage(){
        return instrumented(IrASuMajestadElUsuario.class, "");
    }
}
