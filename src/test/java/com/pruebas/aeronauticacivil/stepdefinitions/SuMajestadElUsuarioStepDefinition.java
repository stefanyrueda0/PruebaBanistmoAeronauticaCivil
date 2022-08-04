package com.pruebas.aeronauticacivil.stepdefinitions;

import com.pruebas.aeronauticacivil.task.IrASuMajestadElUsuario;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

public class SuMajestadElUsuarioStepDefinition {

    @Cuando("^El usuario ingresa a la opcion Su majestad el usuario$")
    public void elUsuarioIngresaALaOpcionSuMajestadElUsuario() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                IrASuMajestadElUsuario.desdeHomePage()
        );
    }


    @Entonces("^se valida que el tutorial aun no está disponible$")
    public void seValidaQueElTutorialAunNoEstáDisponible() {

    }



}
