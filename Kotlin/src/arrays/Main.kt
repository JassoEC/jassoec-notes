package arrays

fun main() {
    // Arrays

    // A nivel de memoria los arrays se guardan de forma consecutiva
    // nombres de arreglos deben estar escritos en plural
    val numbers = arrayOf(1,2,"Hello",4); // => arrayOf es un array de tipo genericos
    println(numbers[2])

    // para almacenar un arreglo vacio se debe declarar el tipo de datos para recibir
    val emptyArray= emptyArray<Int>()

    val intArray  = intArrayOf(10) // size se determina el tamaño del array

    val myByteArra = byteArrayOf(1,2,3)

    val myIntArray = intArrayOf(1,2,4,5,6,7)

    val arrayInt = IntArray(5);

    val arrayInt2 = IntArray(5) { i: Int -> i.inc() };

    arrayInt2.forEach { println(it) }

    val arrayBoolean = BooleanArray(3){
        println("index of boolean array: $it")
        true;
    }

    arrayBoolean.forEach { println(it) }

}