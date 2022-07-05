package iteration

fun main() {
    println("LIST")

    val list = listOf<Int>(1,2,3)
    println(list[2])
    list.forEach{
        println(it)
    }


    println("SET")
// Los elementos deben ser unicos
    val set = setOf<Int>(1,1,2,3,3,4)

    println("Size of set: ${set.size}")
    set.forEach { println(it) }

    val namesSet = setOf<String>("Emanuel", "El Manes", "Manes", "Manes")
    namesSet.forEach { println(it) }

    println("Map")
    val map = mapOf(
        1 to "Emanuel",
        2 to "Manes",
        3 to "El Manes"
    )
    
    map.forEach {
        val item = it.key
        val name = it.value

        println("$item. $name")
    }
}