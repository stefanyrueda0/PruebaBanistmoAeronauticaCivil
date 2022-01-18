package com.pruebas.aeronauticacivil.ui;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Navegation {
    public static Target TRANSPARENCIA= Target.the("Menú principal TRANSPARENCIA").located(By.xpath("//*[@id=\"zz2_RootAspMenu\"]/li[7]"));
    public static Target PRESUPUESTO = Target.the("Submenú PRESUPUESTO").located(By.xpath("//*[@id=\"ctl00_PlaceHolderMain_ctl03__ControlWrapper_RichHtmlField\"]/table[2]/tbody/tr[5]/td/a"));

    public static Target ESTADOS_FINANCIEROS=  Target.the("Opción ESTADOS FINANCIEROS").located(By.xpath("//*[@id=\"ctl00_PlaceHolderMain_MenuThirdLevel\"]/ul/li[3]/a"));
}
