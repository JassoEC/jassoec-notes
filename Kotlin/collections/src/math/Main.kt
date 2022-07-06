package math

import java.math.BigDecimal

fun main() {
    val prices = listOf(
        BigDecimal(33.5),
        BigDecimal(99.99),
        BigDecimal(50.5),
        BigDecimal(10.5)
    )

    val  economyPrices = prices
        .count {
            it<= BigDecimal(50)
        }
    println(economyPrices)
    val total = prices
        .sumOf {
            it.toBigInteger()
        }

    println(total)

    val ramdomPrice = prices.random()

    println(ramdomPrice)

    val scores = listOf(5.0, 4.9,4.6,4.7)

    // programacion funcional es pensar en que sale un dato y sale otro y como lo uso
    val averageScore = scores
        .average()
        .toFloat()

    println(averageScore)
}