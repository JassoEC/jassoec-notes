package presentation.flight.format

import domain.model.Flight
import domain.presentation.Formatter
import java.time.format.DateTimeFormatter

class FlightConsoleFormat: Formatter<Flight> {
    override fun format(flight: Flight): String {
        val departure = flight.departureArrivalBooking.first
        val arrival = flight.departureArrivalBooking.second

        return """
            Origin: ${departure.airport.name}
            Origin Datetime ${departure.dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)}
            Arrival: ${arrival.airport.name}
            Arrival: ${arrival.dateTime.format(DateTimeFormatter.ISO_LOCAL_TIME)}
            Duration: ${flight.duration}
            Price: $${flight.price}
            
        """.trimIndent()
    }
}