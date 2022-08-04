package com.pruebas.aeronauticacivil.stepdefinitions;

import com.pruebas.aeronauticacivil.Interactions.CambioPestaña;
import com.pruebas.aeronauticacivil.task.AbreDocumento;
import com.pruebas.aeronauticacivil.task.Homepage;
import com.pruebas.aeronauticacivil.task.InformacionFinancieraPage;
import com.pruebas.aeronauticacivil.utils.MenuPrincipal;
import com.pruebas.aeronauticacivil.utils.MenuTransparencia;

import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class DescargaDocumentoStepDefinitions {

    @Before
    public void confactor (){
        OnStage.setTheStage(new OnlineCast());

        OnStage.theActorCalled("usuario");
    }

    @Dado("^que ingresa a la pagina de la aerocivil a la ruta (.*) / (.*)$")
    public void queIngresaALaPaginaDeLaAerocivilALaRuta( MenuPrincipal MenuPrincipal, MenuTransparencia MenuSecundario) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Homepage.menuPrincipal(MenuPrincipal,MenuSecundario)
        );
    }



    @Cuando("^ingresa a la ruta Estados Financieros / Balance$")
    public void el_usuario_ingresa_a_la_ruta_Estados_Financieros_Balance() {
        OnStage.theActorInTheSpotlight().attemptsTo(

                new CambioPestaña(1),
                InformacionFinancieraPage.estados()
        );

    }


    @Cuando("^abre el ultimo balance$")
    public void abre_el_ultimo_balance() {
        OnStage.theActorInTheSpotlight().wasAbleTo(
                AbreDocumento.en(),
                new CambioPestaña(2)
                );
    }

    @Entonces("^se valida que el documento descargado sea el correcto$")
    public void se_valida_que_el_documento_descargado_sea_el_correcto() {

        String a=  getDriver().getCurrentUrl();
        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that(a).isEqualTo("https://www.aerocivil.gov.co/atencion/presupuesto/Estados%20Financieros/Estado%20de%20Situaci%C3%B3n%20Financiera%20a%2028%20de%20febrero%20de%202022.pdf"));


    }



}
