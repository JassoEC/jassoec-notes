package enums

import enums.constructor.Color
import enums.functions.ErrorType

fun main() {
    println(ConnectionType.WIFI)

    val whiteHex = Color.WHITE.hexa

    println(whiteHex)

    val attempts = ErrorType.CONNECTIVITY_ERROR.getRetriesIntents()

    print("Attempts available $attempts")
}