package com.pruebas.aeronauticacivil.stepdefinitions;

import com.pruebas.aeronauticacivil.task.VaAAtencionAlCiudadano;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.pruebas.aeronauticacivil.ui.Navegation.TELEFONO;

public class ContactoTelefonoStepDefinition {


    @Cuando("^El usuario ingresa a la opcion Atencion Al Ciudadano$")
    public void elUsuarioIngresaALaOpcionAtencionAlCiudadano() {
        OnStage.theActorInTheSpotlight().attemptsTo(

                VaAAtencionAlCiudadano.a()
        );

    }

    @Entonces("^se valida que el telefono sea (.*)$")
    public void seValidaQueElTelefonoSea(String telefono) {
        OnStage.theActorInTheSpotlight().attemptsTo(

                Ensure.that(TELEFONO).text().contains(telefono)
        );

    }

}
