#language: es

#Author: Stefany Rueda


Característica:Prueba de validación de la fecha de la ultima noticia publicada
  Escenario: El usuario valida que hoy dia calendario se haya publicado una noticia
    Cuando El usuario ingresa a noticias
    Entonces se valida que la fecha de la ultima noticia publicada sea hoy
