package enums.constructor

enum class Color(
    val hexa: String
) {
    /*
     * como cada uno de los enumerables es una instancia debe recibir
     *  los parámetros declarados en el constructor
     */
    WHITE("#FFFFFF"),
    BLACK("#000000"),
    BLUE("#002366"),
    RED("#CB3234"),
    YELLOW("#F6BE00")
}