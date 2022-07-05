package functions

fun main() {

    // Declarar la función
    val printHello = { name: String -> println("Hola, $name desde la lambda") }

    // Ejecutar la lambda
    printHello("Emanuel")

    // las lambdas no pueden tener parametros por defecto
    val addOneToAge = {age:Int -> age + 1}

    val currentAge = addOneToAge(28)
    println(currentAge)

    // Declarar la firma de la lamba
    // Declarar la firma de la lamba
    val addFiveTo: (Int) -> Int = {
        it + 5 // it representa  el tipo de dato que esta entrado, es reepresentado por un Generico
    }

    println(addFiveTo(5))


    val sumTwoNumbers : (Int, Int, String) -> Int = {x: Int, y: Int, str: String ->
        val total = x + y;

        total // El ultimo valor que tenga la lambda será siempre el valor de retorno
    }
}