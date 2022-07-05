package data_types

fun main() {

    // Byte
    // Valor por defecto de inferencia Int
    val age =28

    // cuando es necesario debemos especifiar el tipo de dato numerico para evitar la inferencia automática
    val newAge: Byte = 127;


    //Int

    val productId = 2_147_483_749;
    val productId2: Int = 214748374;

    // Long
    val userId: Long =9_223_372_036_854_775_807;
    val userId2 =9_223_372_036_854_775_807L;

    // Float 4 bytes 6-7 decimales

    // La inferencia por defecto es DOUBLE
    val myDouble = 1.3455f; // la F al final indica la forma en que se va a tratar

    // Double 8 bytes 15-16 decimales

    val myFloat = 1.3455;


    // Boolean

    // Operaciones

    // AND && and
    // OR ||  or
    // NOT ! not

    val isLoggedIn = true;
    val hasAddress = false;

    println(isLoggedIn && hasAddress)

    println(isLoggedIn and hasAddress)

    println(isLoggedIn.and(hasAddress))



    println(isLoggedIn.not() or hasAddress.not())

    // String
    val myString  = "this is a string";

    // String templates

    val name = "Emanuel";

    val answer = "the author is $name";

    // val answer = "the author is ${person.name}";

    val amount = 100;

    val  amount2 = 34;

    val finalAmount = "Total: ${amount + amount2}";

    println(finalAmount)

    println("Initial amount $amount")
}