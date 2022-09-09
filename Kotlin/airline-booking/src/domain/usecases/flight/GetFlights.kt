package domain.usecases.flight

import domain.datasource.flight.FlightDataSource
import domain.model.*
import java.math.BigDecimal
import java.time.LocalDateTime
import java.time.Month

class GetFlights(
    private val flightDataSource: FlightDataSource
) {
    fun invoke(month: Month): Map<Int,Flight> {

        return flightDataSource
            .getFlights()
            .filter { flightEntry ->
                flightEntry.value.departureArrivalBooking.first.dateTime.month == month
            }
    }
}