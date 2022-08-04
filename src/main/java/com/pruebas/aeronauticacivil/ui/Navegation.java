package com.pruebas.aeronauticacivil.ui;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Navegation {
    public static Target TRANSPARENCIA = Target.the("Menú principal TRANSPARENCIA").located(By.xpath("//*[@id=\"zz2_RootAspMenu\"]/li[7]"));
    public static Target PRESUPUESTO = Target.the("Submenú PRESUPUESTO").located(By.xpath("//*[@id=\"ctl00_PlaceHolderMain_ctl03__ControlWrapper_RichHtmlField\"]/table[2]/tbody/tr[5]/td/a"));
    public static Target TRAMITES_Y_SERVICIOS = Target.the("Submenú TRÁMITES Y SERVICIOS").located(By.xpath("//*[@id=\"aspnetForm\"]"));
    public static Target ESTADOS_FINANCIEROS = Target.the("Opción ESTADOS FINANCIEROS").located(By.xpath("//*[@id=\"ctl00_PlaceHolderMain_MenuThirdLevel\"]/ul/li[3]/a"));

    public static Target BALANCES = Target.the("Opción de BALANCES").located(By.xpath("//*[@id=\"WebPartWPQ10\"]/div[1]"));
    public static Target ESFNOV2021 = Target.the("Estado financiero nov 2021").located(By.xpath("//*[@id=\"paging_container3\"]/ul/li[1]/div/div/div/a[1]/img"));
    public static Target AL_CIUDADANO = Target.the("Tramites Al ciudadano").located(By.xpath("//*[@id=\"MSOZoneCell_WebPartWPQ12\"]"));
    public static Target OPCIONES_AL_CIUDADANO = Target.the("Opciones de tramite al ciudadano").located(By.xpath("//*[@id=\"WebPartWPQ13\"]/div[1]/table"));
    public static Target ATENCION_AL_CIUDADANO = Target.the("Atención al ciudadano").located(By.xpath("//*[@id=\"zz2_RootAspMenu\"]/li[6]/a/span/span[1]"));
    public static Target TELEFONO = Target.the("Informacion del telefono").located(By.xpath("//*[@id=\"WebPartWPQ11\"]/div[1]/p[3]"));
    public static Target NOTICIAS = Target.the("Pagina de noticias").located(By.xpath("//*[@id=\"cbqwpctl00_g_110d8d8d_3e9e_4ae5_9165_e994e4cdaeca\"]/ul/li[2]/a/div"));
    public static Target FECHA_ULTIMA_NOTICIA = Target.the("Fecha de la ultima noticia publicada").located(By.xpath("//*[@id=\"DeltaPlaceHolderMain\"]/div[1]/div[2]/div/div[3]/span"));
    public static Target ULTIMA_NOTICIA = Target.the("Ultima noticia").located(By.xpath("//*[@id=\"paging_container1\"]/ul/li[1]/div/div/a/h2"));


    public static Target PQRSD = Target.the("PQRD").located(By.xpath("//*[@id=\"slwp_ctl00_ctl49_g_0c4edff2_40ab_4ccf_81b3_762bd0b39a9b\"]/div/div/ul/li[2]/a/div[2]/h2"));
    public static Target PREGUNTAS_FRECUENTES = Target.the("Preguntas Frecuentes").located(By.xpath("//*[@id=\"slwp_ctl00_ctl48_g_e605484c_1d87_41ab_8b5d_9a798db5b040\"]/div/div/ul/li/a/div[2]/h3"));
    public static Target MENU_PREGUNTAS_FRECUENTES = Target.the("Opciones Preguntas frecuentes").located(By.xpath("//*[@id=\"cbqwpctl00_ctl48_g_ee2d6471_c76b_43cd_890f_4fdcfc7b6a00\"]/ul"));

    public static  Target OPCIONES=Target.the("Seliccion de opciones").located(By.xpath("//*[@id=\"selectNavigate\"]"));
}
