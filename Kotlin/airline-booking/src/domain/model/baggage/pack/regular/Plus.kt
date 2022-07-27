package domain.model.baggage.pack.regular

import domain.model.baggage.pack.BoardingTurn
import java.math.BigDecimal

class Plus(price: BigDecimal, name: String= "Regular Plus"): Regular(name, price) {
    override val boardingTurn: BoardingTurn = BoardingTurn.FIRST
}