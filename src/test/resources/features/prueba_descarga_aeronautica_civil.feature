#language: es

#Author: Stefany Rueda


  Característica:Prueba de validación de Documento PDF
    Escenario: El usuario descarga un Domuento PDF
      Cuando El usuario ingresa a la ruta Estados Financieros / Balance
      Y descarga el ultimo balance
      Entonces se valida que el documento descargado sea el correcto
