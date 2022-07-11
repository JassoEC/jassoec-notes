package getters_setters

import java.time.LocalDate

class User(
    email: String,
    password: String
) {

    private val dateNow = LocalDate.now()
    private val validGenders = listOf('M','F')

    var isValid: Boolean = true

    var email: String  = email
        set(value){ // De forma visual decimos que estos metodos le pertenecen al atributo
            field = value.lowercase()
        }

    var password: String = password
        set(value){
            field = if(value.length == 6){
                value
            }else {
                isValid = false
                ""
            }
        }

    init {
        this.email = email
        this.password = password
    }

    constructor(
        email: String,
        password: String,
        birthDate: LocalDate,
        gender: Char
    ): this(email, password){
        this.birthDate = birthDate
        this.gender = gender
    }

    /*
    * Principios de diseño: Tell don't aks
    *
    * Los objetos aplican sus propias reglas internamente
    *
    * Usalmente va de la mano con la forma en que cada lenguaje aplica encapsulamiento
    * es decir con los getters y setters
    *
    * RESPONSABILIDAD: de quien es "responsabilidad" que una regla se aplique?
    * tambien depende de la naturaleza de la aplicación a construir
    * */
    var birthDate:LocalDate = dateNow
        set(value) {
            val age = dateNow.year - value.year
            field = if(age > 18){
                value
            }else{
                isValid = false
                dateNow
            }
        }

    var gender:Char = 'N'
        set(value){
            field = if(validGenders.contains(value)){
                value
            } else{
                isValid = false
                'N'
            }
        }
}