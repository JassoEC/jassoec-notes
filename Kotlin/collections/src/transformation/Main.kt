package transformation

fun main() {
    val languages = listOf<String>(
        "Java",
        "C",
        "PHP",
        "Swift"
    )

    // Funciones de transformacion

    val strLanguages = languages.map {
        "Language: $it"
    }
    strLanguages.forEach { println(it) }

    val numbers = listOf<Int>(1,2,3)
    val itemList = numbers.map {
        "$it. Item"
    }

    println(itemList.joinToString())


    val data = listOf("1","2","3","*","/")

    val newData = data.mapNotNull {
        it.toIntOrNull()
    }

    println(newData.joinToString(" - "))
    println(newData.sum())
}