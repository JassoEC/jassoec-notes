package presentation.ticket

import domain.model.Ticket
import domain.presentation.Formatter

class TicketConsoleFormat: Formatter<Ticket> {
    override fun format(t: Ticket): String {
        return """
           Passenger: ${t.passenger.name}
           Flight Number: ${t.flight.number}
           Departure: ${t.flight.departureArrivalBooking.first.airport.name}
           Arrival: ${t.flight.departureArrivalBooking.second.airport.name}
           Baggage: ${t.baggagePackage.name}
           Flight Price: ${t.flight.price}
           Seat ${t.seat.number}
           Total: ${t.totalPrice}
        """.trimIndent()
    }
}