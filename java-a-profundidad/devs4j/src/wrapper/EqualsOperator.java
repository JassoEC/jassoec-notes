package wrapper;

class Dog {
	private String name;

	public Dog(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Dog) {
			return ((Dog) obj).getName().equals(this.getName());
		}
		return false;
	}

}

public class EqualsOperator {
	public static void main(String[] args) {

		/**
		 * Reference: Dog tina;
		 * 
		 * 
		 * Object: new Dog("tina);
		 */
		Dog tina = new Dog("Tina");
		Dog maya = new Dog("Tina");

		Dog copyMaya = maya;

		/**
		 * == compara si las referenciaas apuntan al mismo objeto output: false
		 */
		System.out.println(tina == maya);

		/*
		 * Override equals method
		 * 
		 * Compara los objetos de acuerdo con las reglas definidas el la sobreescritura
		 * del metodo equals heredado de object
		 */

		System.out.println(maya.equals(tina));

		// En este caso ambas referencias apuntan al mismo objeto
		System.out.println(maya == copyMaya);

	}
}
