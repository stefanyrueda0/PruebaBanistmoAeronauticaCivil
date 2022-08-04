package com.pruebas.aeronauticacivil.utils;

import com.pruebas.aeronauticacivil.ui.Navegation;
import net.serenitybdd.screenplay.targets.Target;

public enum MenuPrincipal {

    TRANSPARENCIA(Navegation.TRANSPARENCIA);

    private Target menuPrincipal;

    MenuPrincipal(Target menuPrincipal) {
    this.menuPrincipal=menuPrincipal;
    }

    public Target getMenuPrincipal(){
        return menuPrincipal;
    }
}
