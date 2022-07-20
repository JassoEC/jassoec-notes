package domain.model.baggage.type

class Hand(): BaggageType(){
// cuando se estan heredando atributos siempre debe estar presente la anotación override
    override val emoji: String ="🎒"
    override val title: String = "Hand Baggage"
    val warning = "Warning message"
}
