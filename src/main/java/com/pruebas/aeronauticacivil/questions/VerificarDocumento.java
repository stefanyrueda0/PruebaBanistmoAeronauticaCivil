package com.pruebas.aeronauticacivil.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;


public class VerificarDocumento implements Question<String> {

    public static Question<String> url(){
        return  new VerificarDocumento();
    }

    @Override
    public String answeredBy(Actor actor) {
      String a=  getDriver().getCurrentUrl();
return a;
    }



}
