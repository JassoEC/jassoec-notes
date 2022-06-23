package string_templates

fun main() {
    val price = 15.25;
    val tax = 0.16;

    val out = "The amount $price after taxes is: $${price * (1+tax)}"

    println(out)

    val disclaimer = "The amount is \$MXN";

    println(disclaimer)

    val total  = price.times(tax.plus(1))

    println("the total ${total.toFloat()}")
}