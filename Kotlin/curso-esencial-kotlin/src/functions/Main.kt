package functions

fun main() {
    val appName = "My fabulous app"
    val welcome = "Welcome to the best experience";
    val name = "Emanuel Campos"

    println(addStars(appName,4))
    println(addStars(welcome, 3))
    println(addStars(name, 2))

    println()
    println(addStars(appName))
    println(addStars(name))
}

fun addStars(text: String, starsNumber: Int):String{
    val newText = StringBuilder(text)

    newText.insert(0," ")
    newText.insert(newText.length," ")

    for (i in 0 until starsNumber){
        newText.insert(0,"*")
        newText.insert(newText.length, "*")
    }

    return  newText.toString()
}

// Sobre carga de metodos
fun addStars(text: String): String = addStars(text,2);