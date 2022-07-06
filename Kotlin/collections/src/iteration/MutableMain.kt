package iteration

fun main() {
    println("Mutable lists")

    val mutableList = mutableListOf<Int>(1,2,3)

    mutableList.add(3,4)

    mutableList[1]= 3
    println(mutableList)
}