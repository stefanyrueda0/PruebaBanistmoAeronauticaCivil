package com.pruebas.aeronauticacivil.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.pruebas.aeronauticacivil.ui.Navegation.NOTICIAS;
import static com.pruebas.aeronauticacivil.ui.Navegation.ULTIMA_NOTICIA;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class IraNoticias implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        BrowseTheWeb.as(actor).getDriver().manage().window().maximize();
        OnStage.theActorInTheSpotlight().attemptsTo(
                Open.url("https://www.aerocivil.gov.co/"),
                WaitUntil.the(NOTICIAS, isEnabled()),
                Click.on(NOTICIAS),
                WaitUntil.the(ULTIMA_NOTICIA, isVisible()),
                Click.on(ULTIMA_NOTICIA)
        );

    }

    public static IraNoticias aUlitima(){
        return instrumented(IraNoticias.class,"");
    }
}
