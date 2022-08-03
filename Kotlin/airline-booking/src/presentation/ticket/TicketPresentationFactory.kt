package presentation.ticket

import domain.model.Ticket
import domain.presentation.Formatter
import presentation.PresentationFactory
import presentation.PresentationFormat

class TicketPresentationFactory: PresentationFactory<Ticket> {
    override fun getPresentationFormat(format: PresentationFormat): Formatter<Ticket> {
        return TicketConsoleFormat()
    }
}