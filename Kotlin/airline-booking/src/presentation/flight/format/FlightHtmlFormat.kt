package presentation.flight.format

import domain.model.Flight
import domain.presentation.Formatter
import java.time.format.DateTimeFormatter

class FlightHtmlFormat: Formatter<Flight> {
    override fun format(flight: Flight): String {
        val departure = flight.departureArrivalBooking.first
        val arrival = flight.departureArrivalBooking.second
        return """
            <p><strong>${flight.number}</strong><br />
            Origin: ${departure.airport.name}<br />
            Destination: ${arrival.airport.name}<br />
            Departure: ${departure.dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)}<br />
            Arrival Date: ${arrival.dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)}<br />
            Duration: ${flight.duration}<br />
            <strong>Price: ${'$'}${flight.price}</strong>
            </p>
            
        """.trimIndent()
    }
}