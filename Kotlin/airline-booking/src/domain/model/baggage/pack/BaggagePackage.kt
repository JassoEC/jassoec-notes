package domain.model.baggage.pack

import domain.model.baggage.type.BaggageType
import domain.model.baggage.type.BigHand
import domain.model.baggage.type.Check
import domain.model.baggage.type.Hand
import java.math.BigDecimal

/*
* Una clase abstracta no será instanciada, no tiene sentido tener instancias tan abstractos,
* se usan para fungir como "MOLDES"
* */
abstract class BaggagePackage {

    // un atributo abstracto siempre debe ser implementado por las clases hijas
    abstract val name: String
    abstract val price: BigDecimal
    abstract val boardingTurn: BoardingTurn

    // un atributo open es opcional para implementar
    open val baggageTypes:List<BaggageType> = arrayListOf(
        Hand(),
        BigHand(),
        Check()
    )
}