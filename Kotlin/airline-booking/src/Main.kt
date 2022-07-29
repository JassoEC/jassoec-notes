import domain.model.baggage.pack.regular.Regular
import domain.model.baggage.pack.vclub.ClubBasic
import domain.model.baggage.pack.vclub.ClubClassic
import domain.model.baggage.pack.vclub.VClub
import domain.model.baggage.pack.regular.RegularBasic
import domain.model.baggage.pack.regular.RegularClassic
import java.math.BigDecimal

fun main() {
    val basicPrice = BigDecimal(200)
    val classicPrice = BigDecimal(400)

    val clubBasicClub: VClub  = ClubBasic(basicPrice)
    val clubClassicClub: VClub = ClubClassic(classicPrice)

    println("${clubBasicClub.name} - ${clubBasicClub.price}")
    println("${clubClassicClub.name} - ${clubClassicClub.price}")

    val basic: Regular = RegularBasic(basicPrice)
    val classic: Regular = RegularClassic(classicPrice)

    println("${basic.name} - ${basic.price}")
    println("${classic.name} - ${classic.price}")

}