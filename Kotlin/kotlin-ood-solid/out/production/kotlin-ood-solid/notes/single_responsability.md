# Single responsibility

*Si una clase tiene más de una razón para cambiar entonces tiene más de una responsabilidad*

**Acoplamiento:** Es el grado de dependencia de o conexión con otras clases

## Bajo Acoplamiento y alta cohesión

Las clases deben ser lo más pequeñas posibles para minimizar el acoplamiento,
es decir la dependencia que hay entre ellas.

Se vuelven más robustas y maximizan la cohesión

Si hacer un cambio en una clase, se propaga en cadena, a sus clases hijas,
significa que está muy acoplado

## Alta cohesión

**Cohesión:** Es la capacidad de adherir elementos entre sí, reutilizarlo y adherirlo
a otros proyectos

**Múltiples clases trabajan juntas para lograr tareas complejas**

    En el ejemplo:

    User tiene la "responsabilidad de manejar sus propios atributos

    RegisterUser tiene la "responsabilidad" de regisrar un usuario