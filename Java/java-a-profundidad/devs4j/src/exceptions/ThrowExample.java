package exceptions;

public class ThrowExample {

	static double divide(int a, int b) {
		if (b != 0) {
			return a / b;
		} else {
			throw new IllegalArgumentException("Acaso eres idiota, hijo?," + "no se puede dividir entre 0");
		}
	}

	/**
	 * El manejo de excepciones es una de dos cosas; 1: Atrapar la excepcion
	 * nediante try catch
	 * 
	 * 2: Propagar la excepcion delegando su manejo a quien invoca el metodo que
	 * produce excepcion
	 */

	// throws Exception -> propagacion de la exception, con una excepcion check que
	// es forzoso manejar

	// throws es necesario para excepciones de tipo check
	static double divide2(int a, int b) throws Exception {
		if (b != 0) {
			return a / b;
		} else {
			throw new Exception("De verdad eres idiota, hijo?, " + "no se puede dividir entre 0");
		}
	}

	// Al continuar propagando la excepcion llega hasta la maquina vistual que es
	// quien la manejara
	/*
	 * 
	 * public static void main(String[] args) throws Exception {
	 * 
	 * double result = divide2(10, 0);
	 * 
	 * System.out.println("Resultado: " + result); }
	 * 
	 * 
	 */

	public static void main(String[] args) {

		// al elejir no propagar la excepcion estamos obligados a manejarlo con el
		// bloque try catch
		try {
			double ress = divide2(10, 0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}




