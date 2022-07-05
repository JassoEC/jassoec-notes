package control_structures

import kotlin.math.roundToInt

fun main() {
    val i =1
    val j = false
    val isLoggedIn = true
    val userStatus=17


    when(i){
        1-> println("Option a")
        2,3 -> println("Rest of options")
        else -> println("Invalid option") // el else se requiere cuando no se cubren los posibles valores
    }

    when{
        i>0->println("$i Es mayor que 0")
    }

    when(isLoggedIn){
        true -> println("User loggedin")
        false -> println("User not logged in")
    }

    val statusString = when(userStatus){
        0 -> "user is logged out"
        1 -> "User is logged in"
        -1 -> "down"
        in 10..20 ->"Inactive for $userStatus min"
        else -> "Not found"
    }

    println(" the user status is: $statusString")

    // Any es la clase padre de todos los objetos en Kotlin

    val productPrices: Any = doubleArrayOf(11.23,34.44,234.3)

    val total = when(productPrices){
        is DoubleArray->productPrices.sum().roundToInt().toString()
        is Double ->productPrices.roundToInt().toString()
        is Int -> productPrices.toString()
        else ->productPrices.toString()
    }

    println("Total is: $total")


    val hasAddress = true
    val userName = "Emanuel"

    val message = when{
        isLoggedIn and hasAddress -> "Lista de direcciones del usuario $userName"
        isLoggedIn and !hasAddress -> "user not has addresses"
        else -> "Sin datos"
    }

    println(message)
}