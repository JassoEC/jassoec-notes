package control_structures

fun main() {
    val isLoggedIn = false;
    val hasAddress = false;


    if (isLoggedIn) {
        println("user is logged in")

        if(hasAddress){
            println("user has address")
        }else{
            println("User has not addresses")
        }
    }else{
        println("user not logged in")
    }

    val userLoggedInStatus = if(isLoggedIn) "User is logged in" else "User is not logged in"

    println(userLoggedInStatus)
}