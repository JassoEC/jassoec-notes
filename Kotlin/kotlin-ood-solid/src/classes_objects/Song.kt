package classes_objects

/*
* Método Constructor de clase, cuando va al lado de una clase
* se llama constructor primario, sirve para inicializar los atributos
*/
class Song (
    val title: String,
    val artist: String
    ) {

    /*
    * Constructor secundario
    * Este debe tener más atributos que el constructor
    * primario, porque
    *
    * */

    constructor(
        title: String,
        artist: String,
        duration:Long
    ): this(title, artist){
        /*
        * Un contructor secunario permite agregar mas
        * implementaciones, lo que podria ayudar a omitir un
        * bloque init
        * */
    }

    /*
    * SE RESPETA EL ORDEN DE DECLARACION
    * TANTO DE VARIABLES COMO DE BLOQUES INIT
    * PARA EL MOMENTO DE CRACION DEL OBJETO
    * */

    val artistUpper = artist.uppercase()

    /*
    * el codigo de inicializacion se puede poner en un bloque especial
    *
    * No puede recibir parametros
    * se llama cuando el objeto se crea
    * */
    init {
        println("Song $title created")
    }
    // es posible  crear multiples bloques init

    init {

    }

    fun play(){
        println("Playing ${this.title} - ${artistUpper}")
    }

    fun stop(){
        println("Stopping ${this.title}")
    }
}