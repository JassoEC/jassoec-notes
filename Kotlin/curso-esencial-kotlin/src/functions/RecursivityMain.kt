package functions

fun main() {
    val prices = doubleArrayOf(5.0,3.0,2.0);
    val total = getProductPrices(prices, prices.size - 1)
    /*
    * Limit = 0, se comeienza a hacer pop debido a que se comienzan a liberar llamadas aculuadas
    * llamada 3: 2.0 + 5.0 + getProductPrices(prices,size-1)
    * llamada 2: 2.0 + 3.0 + getProductPrices(prices,size-1)
    * llamada 1: 2.0 + getProductPrices(prices,size-1)
    */

    println("Total: $total")
}



fun getProductPrices(prices:  DoubleArray, limit: Int):Double{
    // Caso base: Limite de la recursividad
    if(limit == 0) return prices[0]

    // Caso recursivo
    return prices[limit] + getProductPrices(prices, limit-1)
}