package domain.model.baggage.type

/*
* En kotlin todas las clases son "final",
* es decir que por defecto están restringidas para herencia
*/

/*
* Para que una clase se pueda heredar debe declararse como OPEN
* en Kotlin se recomienda aplicar herencia solo en coso de que el diseño lo requiera
* aunque la clase sea OPEN no significa que sus atributos lo sean también
*/

// Las data clases no pueden ser OPEN

open class BaggageType{
    //Cada atributo que puede ser heredable debe declararse OPEN
    open val emoji: String = "🛄"
    open val quantity: Int = 1
    open val title: String = ""
    open val description: String = ""
}
