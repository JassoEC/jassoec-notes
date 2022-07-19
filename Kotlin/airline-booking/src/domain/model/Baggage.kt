package domain.model

import java.math.BigDecimal

data class Baggage(
    val name: String,
    val price: BigDecimal,
    val personalQuantity: Int,
    val handQuantity: Int,
    val checked: Int,
)
