package com.pruebas.aeronauticacivil.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith (CucumberWithSerenity.class)

@CucumberOptions(
        features="src/test/resources/features/prueba_descarga_aeronautica_civil.feature",
        glue="com.pruebas.aeronauticacivil.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class DescargaDocumentoRunner {

}
