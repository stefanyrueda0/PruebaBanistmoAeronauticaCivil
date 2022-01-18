package com.pruebas.aeronauticacivil.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith (CucumberWithSerenity.class)

@CucumberOptions(
        features="src/test/resources/features/prueba_descarga_aeronautica_civil.feature",
        glue="com.pruebas.aeronauticacivil.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)

public class DescargaDocumentoRunner {

}
