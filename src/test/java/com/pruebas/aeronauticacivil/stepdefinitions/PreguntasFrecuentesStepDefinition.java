package com.pruebas.aeronauticacivil.stepdefinitions;


import com.pruebas.aeronauticacivil.task.IrAPQRD;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.pruebas.aeronauticacivil.ui.Navegation.MENU_PREGUNTAS_FRECUENTES;

public class PreguntasFrecuentesStepDefinition  {

    @Cuando("^El usuario ingresa a la PQRD para ver las preguntas frecuentes$")
    public void elUsuarioIngresaALaPQRDParaVerLasPreguntasFrecuentes() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                IrAPQRD.enHomePage()
        );
    }


    @Entonces("^se valida que la pregunta sobre  \"(.*)\" esté en las opciones$")
    public void seValidaQueLaPreguntaSobreEstéEnLasOpciones(String pregunta) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that(MENU_PREGUNTAS_FRECUENTES).text().contains(pregunta)
        );
    }




}
