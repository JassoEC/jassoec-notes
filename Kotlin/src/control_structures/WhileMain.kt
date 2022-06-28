package control_structures

fun main() {
    val gretings = arrayOf("Holi", "Buenos dias", "Welcome","Hi", "God morning");

    var i = 0
    val length = gretings.size -1

    while(i<=length){
        var greting = gretings[i];

        println("item ${gretings[i]}")
        i+=1;
        if(greting.length <= 2) continue;
    }

    println("Siguiente ciclo \n")

    var j = 0;

    do {
        var greting = gretings[j];
        j++
        println(greting)
    }while (greting.length >  2 && j<length)

    println("continue")
}