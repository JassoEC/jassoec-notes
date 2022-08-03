package presentation.flight

import domain.model.Flight
import domain.presentation.Formatter
import presentation.PresentationFactory
import presentation.PresentationFormat
import presentation.flight.format.FlightConsoleFormat
import presentation.flight.format.FlightHtmlFormat

class FlightPresentationFactory: PresentationFactory<Flight> {
    override fun getPresentationFormat(format: PresentationFormat): Formatter<Flight> {
        return when(format){
            PresentationFormat.HTML -> FlightHtmlFormat()
            PresentationFormat.CONSOLE -> FlightConsoleFormat()
            else -> FlightConsoleFormat()
        }
    }
}