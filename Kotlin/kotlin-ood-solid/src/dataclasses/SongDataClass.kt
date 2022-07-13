package dataclasses

/*
* El beneficio de usar data classes es que no es necesario sobrescribir
* los métodos equals para generar una comparación de igualdad efectiva
*
* Se utilizan para modelos que no requieren implementación/comportamiento
*
* La responsabilidad de una data class es almacenar información
*
* La inmutabilidad es otro de sus atributos
*
* */
data class SongDataClass(
    val title: String,
    val artist: String
)
