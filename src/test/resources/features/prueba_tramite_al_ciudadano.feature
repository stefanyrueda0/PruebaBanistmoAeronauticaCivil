#language: es

#Author: Stefany Rueda


Característica:Prueba de validación tramites al ciudadano
  Escenario: El usuario busca un trámite al ciudadano
    Dado que ingresa a la pagina de la aerocivil a la ruta TRANSPARENCIA / TRAMITES
    Cuando El usuario ingresa a la opcion Al Ciudadano
    Entonces se valida que el trámite "Permiso de operación explotador extranjero" esté en las opciones
