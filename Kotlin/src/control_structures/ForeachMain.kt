package control_structures

import kotlin.system.measureNanoTime

fun main() {

    val forInRange = measureNanoTime {
        for(i in 1..1000){
            i
        }
    }


    val foreachRange =  measureNanoTime {
        (0..1000).forEach{
            it
        }
    }


    println("ForInRange: $forInRange")

    println("ForeachRange: $foreachRange")

    val objectList = (0..1000).toList() // Los rangos son listas y se vean generando  en demanda

 val forInList =     measureNanoTime {
        for (i in objectList){
            i
        }
    }

    val  foreachList = measureNanoTime { objectList.forEach{it} }

    println("ForechList: $foreachList")

}