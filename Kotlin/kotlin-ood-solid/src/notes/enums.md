# Enums

Son claes que representan una colección de datos **_válidos_**

Cada valor "funciona como una constante" aunque de forma objetiva cada valor
es una instancia de esta clase

Se aplican todas las reglas de nombres para las constantes, aunque pueden
usarse mayúsculas y minúsculas

    enum class ConnectionType{
        WIFI,
        MOBILE,
        UNREACHABLE
    }

- Suelen utilizarse para manejar estados o tipos de cosas que ya están predeterminadas
- Una clase enum puede tener un constructor que se usa para inicializar los valores
- También pueden contener atributos y métodos
- Cada enum debe sobreescribir los métodos si esta definida para heredarse (open, abstract)
- Los atributos y métodos siempre deben ir al final