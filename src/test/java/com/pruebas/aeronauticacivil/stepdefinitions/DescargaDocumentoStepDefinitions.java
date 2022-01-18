package com.pruebas.aeronauticacivil.stepdefinitions;


import com.pruebas.aeronauticacivil.task.Homepage;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class DescargaDocumentoStepDefinitions {

    @Before
    public void confactor (){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Usuario");
    }

    @Cuando("^El usuario ingresa a la ruta Estados Financieros / Balance$")
    public void el_usuario_ingresa_a_la_ruta_Estados_Financieros_Balance() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Homepage.menuPrincipal()
        );

    }


    @Cuando("^descarga el ultimo balance$")
    public void descarga_el_ultimo_balance() {

    }

    @Entonces("^se valida que el documento descargado sea el correcto$")
    public void se_valida_que_el_documento_descargado_sea_el_correcto() {

    }

}
