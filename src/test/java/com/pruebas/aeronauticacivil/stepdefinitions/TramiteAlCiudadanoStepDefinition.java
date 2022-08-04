package com.pruebas.aeronauticacivil.stepdefinitions;


import com.pruebas.aeronauticacivil.task.TramitesPage;

import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.pruebas.aeronauticacivil.ui.Navegation.OPCIONES_AL_CIUDADANO;

public class TramiteAlCiudadanoStepDefinition {

    @Before
    public void confactor (){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Usuario1");
    }

    @Cuando("^El usuario ingresa a la opcion Al Ciudadano$")
    public void elUsuarioIngresaALaOpcionAlCiudadano() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                TramitesPage.a()
        );

    }


    @Entonces("^se valida que el trámite \"(.*)\" esté en las opciones$")
    public void seValidaQueElTrámiteEstéEnLasOpciones(String tramite) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that(OPCIONES_AL_CIUDADANO).containsElements(tramite)

        );
    }


}
