package wrapper;

public class AutoBoxinAndAutoUnboxing {
	public static void main(String[] args) {
		// Noramalmente asi se instanciaria un tipo wrapper
		Integer i = new Integer(10);

		// despues de la version 1,5 de java se puede omitira pasando el valor de forma
		// directa
		/*
		 * El compilador asume que se esta se esta conviertiendo una literal int (10) a
		 * un objeto de tipo Integer, es decir AUTOBOXING
		 * Conversion del primitivo a su correspondiente wrapper class
		 */
		Integer ii = 10;

		/*
		 * Se puede hacer una asignación directa de una wrapper class a un primitibo,
		 * es decir se realiza un AUTOUNBOXING,
		 * 
		 * Converti de la wrapper class al tipo primitivo
		 */

		int j = ii;
	}
}
