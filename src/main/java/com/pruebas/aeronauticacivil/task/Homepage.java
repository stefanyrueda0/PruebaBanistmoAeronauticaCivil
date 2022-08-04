package com.pruebas.aeronauticacivil.task;

import com.pruebas.aeronauticacivil.utils.MenuPrincipal;
import com.pruebas.aeronauticacivil.utils.MenuTransparencia;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static com.pruebas.aeronauticacivil.ui.Navegation.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Homepage implements Task {

    private MenuPrincipal menuPrincipal;
    private MenuTransparencia menuTransparencia;

    public Homepage(MenuPrincipal menuPrincipal, MenuTransparencia menuTransparencia){
        this.menuPrincipal=menuPrincipal;
        this.menuTransparencia=menuTransparencia;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url("https://www.aerocivil.gov.co/"),
                WaitUntil.the(menuPrincipal.getMenuPrincipal(), isVisible()),
                Click.on(menuPrincipal.getMenuPrincipal()),
                WaitUntil.the(menuTransparencia.getMenuTransparencia(),isEnabled()),
                Click.on(menuTransparencia.getMenuTransparencia())
        );
    }

    public static Homepage menuPrincipal(MenuPrincipal menuPrincipal, MenuTransparencia menuTransparencia){
        return instrumented(Homepage.class, menuPrincipal, menuTransparencia );
    }


}
