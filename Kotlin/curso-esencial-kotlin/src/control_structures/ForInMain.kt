package control_structures

fun main() {

    val finalValue = 20;

    for (n in 1.rangeTo(5)){ // is the same if use 1..3 that means: range for 1 to 3
        println("item of range $n")
    }

    println()

    for (item in 1..finalValue){
        println("item of range operator: $item")
    }

    println()

    for (item in finalValue.downTo(10)){
        println("item fo decrementing range: $item")
    }

    println()

    for (i in 'a'.rangeTo('z')){
        println("item of characters range: $i")
    }



}
