package com.pruebas.aeronauticacivil.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.requirements.reports.ScenarioSummaryOutcome;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static com.pruebas.aeronauticacivil.ui.Navegation.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;


public class InformacionFinancieraPage implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {

        OnStage.theActorInTheSpotlight().attemptsTo(

                WaitUntil.the(ESTADOS_FINANCIEROS,isVisible()),
                Click.on(ESTADOS_FINANCIEROS),
                WaitUntil.the(BALANCES,isEnabled()),
                Click.on(BALANCES)



        );
    }

    public static  InformacionFinancieraPage estados (){
        return instrumented(InformacionFinancieraPage.class,"");
    }
}
