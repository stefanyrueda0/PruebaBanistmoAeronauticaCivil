package com.pruebas.aeronauticacivil.Interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actors.OnStage;

import javax.xml.bind.SchemaOutputResolver;
import java.util.ArrayList;
import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class CambioPestaña implements Interaction {

    private int pestana;

    public CambioPestaña(int pestana){
        this.pestana=pestana;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<String> tab= new ArrayList<>(getDriver().getWindowHandles());

        getDriver().switchTo().window(tab.get(pestana));
        OnStage.theActorInTheSpotlight().attemptsTo();
    }

    public CambioPestaña a(int pestana){
        return instrumented (CambioPestaña.class,pestana);
    }
}
