#language: es

#Author: Stefany Rueda


  Característica:Prueba de validación de Documento PDF
    Escenario: El usuario abre un Domuento PDF
      Dado que ingresa a la pagina de la aerocivil a la ruta TRANSPARENCIA / PRESUPUESTO
      Cuando ingresa a la ruta Estados Financieros / Balance
      Y abre el ultimo balance
      Entonces se valida que el documento descargado sea el correcto
