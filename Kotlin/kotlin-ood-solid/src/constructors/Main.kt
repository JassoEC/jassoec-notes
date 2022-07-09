package constructors

import java.time.LocalDateTime
import java.time.Month

fun main() {
    val post = Post(
        name="Tutorial de Kotlin",
        author = "Emanuel Campos",
        date = LocalDateTime.of(
            2022,
            Month.JANUARY,
            30,
            10,
            25
        )
    )

    println(post.publish())

    val detailedPost = Post(
        name = "Clases de Kotlin",
        author = "Emanuel Campos Jasso",
        date = LocalDateTime.of(
            2022,
            Month.JULY,
            8,
            9,
            49
        ),
        "Contenido del post de Kotlin",
        "Kotlin"
    )

    println(detailedPost.publish())
}