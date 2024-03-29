package domain.usecases.seat

import domain.model.seat.SeatSection
import domain.usecases.flight.GetFlightSaved

class GetSeatSection(
    val getFlightSaved: GetFlightSaved
) {
    operator  fun invoke(): Map<Int, SeatSection>{
        val flight= getFlightSaved()
        return flight
            ?.airCraft
            ?.seatSections
            ?.mapIndexed{index, seatSection ->
                index + 1 to seatSection
            }?.toMap() ?: mapOf()
    }
}