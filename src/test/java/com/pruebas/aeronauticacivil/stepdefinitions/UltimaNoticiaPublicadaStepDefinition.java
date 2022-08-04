package com.pruebas.aeronauticacivil.stepdefinitions;

import com.pruebas.aeronauticacivil.task.IraNoticias;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

import static com.pruebas.aeronauticacivil.ui.Navegation.FECHA_ULTIMA_NOTICIA;

public class UltimaNoticiaPublicadaStepDefinition {

    @Cuando("^El usuario ingresa a noticias$")
    public void elUsuarioIngresaANoticias() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                IraNoticias.aUlitima()
        );

    }


    @Entonces("^se valida que la fecha de la ultima noticia publicada sea hoy$")
    public void seValidaQueLaFechaDeLaUltimaNoticiaPublicadaSeaHoy() {

        SimpleDateFormat dtf = new SimpleDateFormat("M/dd/yyyy");
        Calendar calendar = Calendar.getInstance();

        Date dateObj = calendar.getTime();
        String formattedDate = dtf.format(dateObj);

        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that(FECHA_ULTIMA_NOTICIA).text().contains(formattedDate)
        );

    }

}
