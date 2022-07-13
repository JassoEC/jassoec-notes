package dataclasses

fun main() {

    val firstSong = Song(
        title = "Billie jean",
        artist = "Don Maicol"
    )

    val secondSong = Song(
        title = "Billie jean",
        artist = "Don Maicol"
    )

    /*
    * por defecto == en Java compara direcciones de memoria, por lo tanto, la comparación siempre resulta falsa
    *
    * La comparación de dos instancias en Kotlin puede realizarse con ==
    * Se ejecuta el método equals
    * */
    println("Are songs equals ? : ${firstSong == secondSong}")

    val firstSongDataClass = SongDataClass("La boda del huitlacoche", "desconocido")
    val secondSongDataClass = SongDataClass("La boda del huitlacoche", "desconocido")


    println("Are data classes equals? : ${firstSongDataClass == secondSongDataClass}")
}