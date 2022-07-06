package split

fun main() {
    val mandado = listOf(
        "Leche",
        "Buevito",
        "Carne",
        "Arroz",
        "Pan"
    )

    // n primeros elementos

    val desayuno = mandado
        .take(2)
        .filterNot {
            it == "Pan"
        }

    println("Lonche: ${desayuno.joinToString()}")

    println("Pa cenar: ${mandado.takeLast(3).joinToString()}")
}