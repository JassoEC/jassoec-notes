package functions



fun main() {

    val welcome = getWelcomeText()
    println(welcome)
    println(cleanText(welcome))

}

// Expresion simple de la funcion
fun getWelcomeText():String = "** Welcome to the best experience **"

// Expresion con multiples declaraciones
fun cleanText (text:String): String = text
    .removePrefix("**")
    .removeSuffix("**")
    .trim()