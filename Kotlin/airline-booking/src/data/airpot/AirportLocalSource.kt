package data.airpot

import domain.datasource.airport.AirportDataSource
import domain.model.Airport

class AirportLocalSource: AirportDataSource {
    override fun getAirports(): List<Airport> = listOf(
        Airport("QMX", "México City"),
        Airport("CHI", "Chicago"),
        Airport("BOG", "Bogotá"),
        Airport("CUN", "Cancún"),
    )
}