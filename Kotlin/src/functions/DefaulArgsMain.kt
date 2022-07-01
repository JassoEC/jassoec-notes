package functions

fun main() {
    showWelcomeMessage("holis")

    // Los argumentos nombrados al llamar una funcion nombreArgumento = ValorArgumento
    showWelcomeMessage("holis", user = "Michelle")
}

fun showWelcomeMessage(text: String, user:String = "") {
    val message ="$text $user".trim()
    println(message)
}