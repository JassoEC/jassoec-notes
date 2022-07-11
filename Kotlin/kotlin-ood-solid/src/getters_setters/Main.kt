package getters_setters

import java.time.LocalDate
import java.time.Month

fun main() {

    val user = User("manes@mail.com","ass123")
    val userRegistered:User ? = RegisterUser().invoke(user)

    if(userRegistered != null){
        println("""
            User registered: ${userRegistered.email}
            User registered: ${userRegistered.password}
        """.trimIndent())
    }else{
        println("User not registered")
    }

    println()

    val maneRegistered = User(
        email="manes@mail.com",
        password = "abc123",
        birthDate = LocalDate.of(1994, Month.JANUARY,30),
        gender = 'M'
    )

    val fullUser: User? = RegisterUser().invoke(maneRegistered)

    if(fullUser != null){
        println("""
            User registered: ${fullUser.email}
            User registered: ${fullUser.password}
            User registered: ${fullUser.birthDate}
            User registered: ${fullUser.gender}
            User valid: ${fullUser.isValid}
        """.trimIndent())
    }else{
        println("User not registered")
    }
}