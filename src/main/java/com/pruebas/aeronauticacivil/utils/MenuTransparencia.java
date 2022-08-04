package com.pruebas.aeronauticacivil.utils;

import com.pruebas.aeronauticacivil.ui.Navegation;
import net.serenitybdd.screenplay.targets.Target;

public enum MenuTransparencia {

    PRESUPUESTO(Navegation.PRESUPUESTO),
    TRAMITES(Navegation.TRAMITES_Y_SERVICIOS);

    private Target menuTransparencia;

    MenuTransparencia(Target menuTransparencia) {
        this.menuTransparencia=menuTransparencia;
    }

    public Target getMenuTransparencia(){
        return menuTransparencia;
    }

}
