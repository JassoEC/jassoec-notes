import classes_objects.Song

fun main() {

    val firstSong = Song(
        title = "Botella tras botella",
        artist = "C. Nodal"
    )

    val secondSong = Song(
        title = "Luna",
        artist = "Zoe"
    )

    val thirdSong = Song(
        title = "Cómo fue",
        artist = "Benny More"
    )

    secondSong.play()
    secondSong.stop()
    thirdSong.play()
}