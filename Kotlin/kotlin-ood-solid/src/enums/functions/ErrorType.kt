package enums.functions

enum class ErrorType(
    val message: String
) {
    UNKNOWN_ERROR("Unknown error") {
        /*
        * Debido a que cada enumerable es una instancia
        * los objetos se crean al interior de la misma clase para implementar
        * sus miembros abstractos
        * */
        override val userMessage: String = "Unexpected error occurred"

        override fun getCodeError(): String = "00E1"
    },

    CONNECTIVITY_ERROR("Connectivity error") {
        override val userMessage: String = "Connectivity error occurred"

        override fun getCodeError(): String = "00C1"

        override fun getRetriesIntents(): Int = 3
    },

    NOT_LOGGED_IN_ERROR("Not logged in error") {
        override val userMessage: String = "Authentication error occurred"

        override fun getCodeError(): String = "00A1"

        override fun getRetriesIntents(): Int = 2
    }; // los enumerables concluyen con un ;

    //Abstract: algo muy general, como templates, al momento de definirlos abstractos son obligatorios
    abstract  val userMessage: String
    abstract  fun getCodeError():String

    // Open es opcional realizar la implementación
    open fun getRetriesIntents(): Int = 1

    // No se puede sobreescribir una función común de la clase
    fun otherFunction():Boolean = false

}