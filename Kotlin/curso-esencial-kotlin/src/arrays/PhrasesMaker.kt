package arrays

fun main() {
    val gretings = arrayOf("Holi", "Buenos dias", "Welcome", "God morning");

    val introuductions = arrayOf("Mi nonmbre es", "Puedes llamarme", "usualmente me llaman", "i am");

    val names = arrayOf("Emanuel", "Manes", "Jasso")

    val randIndexGrettings = (Math.random()* gretings.size).toInt()
    val randIndexIntroductions = (Math.random()* introuductions.size).toInt()
    val randIndexNmmes = (Math.random()* names.size).toInt()


    val phrase = "${gretings[randIndexGrettings]}, ${introuductions[randIndexIntroductions]} ${names[randIndexNmmes]}"

    println(phrase)


}