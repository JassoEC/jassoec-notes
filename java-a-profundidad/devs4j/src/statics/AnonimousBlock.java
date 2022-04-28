package statics;

class LivingBeing {

	LivingBeing() {
		System.out.println("LivingBeing contructor");
	}
}

class Human2 extends LivingBeing {

	// Se ejecuta cuando la clase es cargada en la maquina virtual,
	// por lo tanto se ejecuta antes de los bloques anomimos y de los constructores
	static {
		System.out.println("Bloque estatico");
	}

	// static value exists in each instance of class
	static int numberOfHumans = 0;
	private String name = "";

	public Human2(String name) {
		super();
		System.out.println("Human 2 constructor");
		this.name = name;
	}

	Human2() {
		this.numberOfHumans++;
	}

	/*
	 * Orden de ejecucion de bloques anonimos;
	 * 
	 * Constructor de clase padre super();
	 * 
	 * bloques anomimos por orden de aparicion en la clase
	 * 
	 * Contrucutores de clase
	 */
	{
		System.out.println("Bloque anonimo");
	}

	{
		System.out.println("bloque anonimo 2");
	}
}

public class AnonimousBlock {

	public static void main(String args[]) {
		new Human2("Perro");
	}
}
