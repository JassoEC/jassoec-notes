package getters_setters

class RegisterUser {
    fun invoke(user: User): User? {

        /*
        * Tell don't ask
        * Los objetos proveen informacion y se aplican las reglas de forma externa
        *
        * Aplicar las reglas en un clase externa, solo que si se requiere aplicar nuevamente las
        * validaciones debemos generar más codigo para lograrlo
        *
        * */
        return if(user.isValid) user else null
    }
}