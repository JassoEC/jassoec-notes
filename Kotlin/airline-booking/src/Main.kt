import domain.model.Flight
import domain.presentation.Formatter
import domain.usecases.GetFlights
import presentation.PresentationFormat
import presentation.flight.FlightPresentationFactory

fun main() {

    val format = PresentationFormat.HTML
    val flightFormat : Formatter<Flight> = FlightPresentationFactory().getPresentationFormat(format)
    val flights = GetFlights(flightFormat).invoke()
    println(flights)
}

