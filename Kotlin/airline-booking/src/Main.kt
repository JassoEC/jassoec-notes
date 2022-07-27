import domain.model.baggage.pack.regular.Regular
import domain.model.baggage.pack.vclub.Basic
import domain.model.baggage.pack.vclub.Classic
import domain.model.baggage.pack.vclub.VClub
import domain.model.baggage.pack.regular.Basic as  RegularBasic
import domain.model.baggage.pack.regular.Classic as  RegularClassic
import domain.model.baggage.type.BaggageType
import domain.model.baggage.type.Check
import domain.model.baggage.type.Hand
import java.math.BigDecimal

fun main() {
    val basicPrice = BigDecimal(200)
    val classicPrice = BigDecimal(400)

    val basicClub: VClub  = Basic(basicPrice)
    val classicClub: VClub = Classic(classicPrice)

    println("${basicClub.name} - ${basicClub.price}")
    println("${classicClub.name} - ${classicClub.price}")

    val basic: Regular = RegularBasic(basicPrice)
    val classic: Regular = RegularClassic(classicPrice)

    println("${basic.name} - ${basic.price}")
    println("${classic.name} - ${classic.price}")
}