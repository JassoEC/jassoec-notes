package data_casting

fun main() {

    val productLowStock: Byte = 20;
    val productStock: Int = productLowStock.toInt();
    println(productStock)

    val stringNumber= "10";

    val formatNumber:Byte = stringNumber.toByte()

    // al interpolar variable en una cadena se invoca de forma automatica el metodo toString()
    println("Number string input to Byte: $formatNumber")

    val stringDouble = stringNumber.toDouble();

    println("Number string input to Double: $stringDouble")

    // Heart fiiled: 0x2764
    // Heart : 0x2661

    val unicodeInt = 0x2764;
    val unicodeChar = unicodeInt.toChar()
    val unicode = unicodeChar.toString()

    println(unicode)


}