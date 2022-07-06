package predicates

fun main() {
    val ages = listOf<Int>(28,12,43,13,38,22)

    // Las lambdas que retornan booleanos se llaman predicates
    val adultAges = ages.filter {
        it>=18
    }

    println(adultAges.joinToString())

    val kidsAges = ages.filterNot {
        it>18
    }

    println(kidsAges.joinToString())


    val allAges = ages.partition {
        it >= 18
    }

    //la primera parte cumple la condicion
    println(allAges.first.joinToString())

    // La segunda no cumple la condicion
    println(allAges.second.joinToString())


    val data = listOf("One", null, "tow", null,"three");

    val filteredData = data.filterNotNull()

    println(filteredData.joinToString())
}