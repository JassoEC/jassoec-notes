package domain.usecases

import domain.model.*
import domain.presentation.Formatter
import java.math.BigDecimal
import java.time.LocalDateTime
import java.time.Month

class GetFlights (
    private val formatter: Formatter<Flight>
    ){

    fun invoke(): String {
        val flight= Flight(
            number = "Y4 708",
            airCraft = AirCraft("Airbus", "A320", Airline("VL", "Volaris"),),
            price = BigDecimal(300),
            departureArrivalBooking = getAirportPair()
        )

        val flights = listOf<Flight>(
            flight,
            flight,
            flight,
        )

        return formatter.format(flights)
    }


    private fun getAirportPair(): Pair<AirportBooking, AirportBooking> {

        return Pair(
            AirportBooking(
                airport= Airport("MX", "México"),
                dateTime = LocalDateTime.of(
                    2022, Month.DECEMBER, 21, 10,0,0
                )
            ),
            AirportBooking(
                airport = Airport("LA", "Los Angles"),
                dateTime = LocalDateTime.of(
                    2022, Month.DECEMBER,22, 5,0,0
                )
            )
        )
    }

}