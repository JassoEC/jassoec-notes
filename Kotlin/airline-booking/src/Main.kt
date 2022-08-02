import domain.model.*
import domain.model.baggage.pack.regular.RegularBasic
import domain.model.seat.Seat
import domain.model.seat.SeatClass
import domain.model.seat.SeatStatus
import presentation.flight.FlightConsoleFormat
import presentation.TicketConsoleFormat
import java.math.BigDecimal
import java.time.LocalDateTime
import java.time.Month

fun main() {
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

    val flightConsoleFormatter = FlightConsoleFormat()

    val flightFormatted = flightConsoleFormatter.format(flight)

    println(flightFormatted)

    println()

    println(flightConsoleFormatter.format(flights))

    val ticket = Ticket(
        flight = flight,
        passenger = Passenger(
            name = "Emanuel Campos",
            email = "jasso@mail.com",
            phone = "55554444"
        ),
        baggagePackage = RegularBasic(BigDecimal(50)),
        Seat("2", BigDecimal(15), SeatStatus.RESERVED, SeatClass.BUSSINESS)
    )

    val ticketConsoleFormatter = TicketConsoleFormat()

    val ticketFormatted = ticketConsoleFormatter.format(ticket)
    println()
    println(ticketFormatted)

}

fun getAirportPair(): Pair<AirportBooking, AirportBooking> {

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
