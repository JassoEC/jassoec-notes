package algorithm

fun main() {
    // val numbers = intArrayOf(0,0,1,1,2,2,3,3,4)
    // val numbers = intArrayOf(1)
    val numbers = intArrayOf()

    if (numbers.size > 1){
        var j = 1;

        for (i in 1 until numbers.size){ // itera en un rango sin incluir el ultimo elemento

            val left = i-1
            if(numbers[i] != numbers[left]){
                numbers[j] = numbers[i]
                j++
            }
        }

        for (k in j until numbers.size){
            numbers[k] = 0
        }
    }

    println(numbers.toList())
}