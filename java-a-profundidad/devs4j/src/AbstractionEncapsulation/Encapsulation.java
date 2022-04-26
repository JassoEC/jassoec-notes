package AbstractionEncapsulation;

public class Encapsulation {
	
	// private method is an implementation detail
	// is not necessary document private methods
	private int sumTwoNumbers() {
		return 0;
	}
	
	// should be documented because is available in general
	public String hello(String name) {
		return " Holis " + name;
	}
	
	/*
	 * Abstraccion: define qué será expuesto o no, no se refiere a getters o setters
	 * 
	 * Detalles de implememtación: son metodos que son usados al interior de la clase pero que no estan expuestos, es decir tienen
	 * modificador private
	 * 
	 * 
	 * solo se debe exponer lo que quieres que la gente utilize de tu clase
	 *  + "publico"
	 *  - "privado
	 * 
	 * 
	 * Encapsulamiento:  consiste en ocultar atributos de un objeto de manera que solo se pueda 
	 * cambiar mediante operaciones definidas en ese objeto
	 *  */
}
