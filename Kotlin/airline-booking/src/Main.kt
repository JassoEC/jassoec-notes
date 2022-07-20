import domain.model.baggage.type.BaggageType
import domain.model.baggage.type.Check
import domain.model.baggage.type.Hand

fun main() {
    val hand = Hand()

    println(hand.title)
    println(hand.quantity)
    println(hand.warning)

    val bagagge: BaggageType = Check()

    println(bagagge.title)
}