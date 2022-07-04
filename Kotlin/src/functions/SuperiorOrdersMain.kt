package functions

fun main() {
    val result =  isValid(5) {// kotlin sugiere que si la lambda es el ultimo argumento se mueva al exterior de las parentesis
        it > 10
    }
    println("Result: $result")

    consultProductId {
        it
        // haz algo con el parametro de entrada
    }

    consultProductId (onNextProductIdBehavior())
}

fun isValid(x: Int, validate:(x:Int)->Boolean): Boolean= validate(x)

fun consultProductId(onNext:(productId:String)->Unit){
    val productId = "weqr4"
    onNext(productId)
}

fun onNextProductIdBehavior():((productId:String) -> Unit){
    return{
        println("go to product detail view with ID. $it");
    }
}