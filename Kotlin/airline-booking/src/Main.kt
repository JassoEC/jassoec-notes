import data.aircraft.AirCraftLocalSource
import data.airportbook.AirportBookingLocalSource
import data.airpot.AirportLocalSource
import data.baggage.BaggageVClubLocalSource
import data.flight.FlightLocalSource
import domain.model.Flight
import domain.presentation.Formatter
import domain.usecases.baggage.GetBaggagePackage
import domain.usecases.flight.GetFlights
import presentation.PresentationFormat
import presentation.baggage.BaggagePackageConsole
import presentation.baggage.types.BaggageTypesConsole
import presentation.flight.FlightPresentationFactory
import java.time.Month

fun main() {

    val vClubLocalSource = BaggageVClubLocalSource()
    val getVClubPackages= GetBaggagePackage(vClubLocalSource).invoke()

    println("*** VClub Baggage ***")
    getVClubPackages.forEach { (t, u) ->
        print("$t. ")
        println(
            BaggagePackageConsole(
                BaggageTypesConsole()
            ).format(u)
        )
    }
}

