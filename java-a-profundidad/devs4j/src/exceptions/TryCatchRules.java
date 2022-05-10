package exceptions;

public class TryCatchRules {

	public static void main(String[] args) {
		/*
		 * Este bloque es correcto
		 */
		try {

		} catch (Exception e) {
			// TODO: handle exception
		}

		/*
		 * Este bloque es correcto
		 */

		// Solo el bloque try es obligatorio
		try {

			// Se puede definir un bloque try con un finally
		} finally {

		}

		/*
		 * Este bloque es correcto
		 */
		try {
			int x = 10 / 0;
			System.out.println(x);
		} catch (Exception e) {
			// TODO: handle exception
			System.err.printf("%s", e.getMessage());
		} finally {
			// el metodo finally se va a ejecutar incluso cuando el bloque catch tenga una
			// excepcion

			System.out.println("Ejecucion del finalluy");

			/**
			 * La unica forma de evitar la ejecucion del finally es finalizar todo el
			 * programga usando System.exit();
			 */
		}

	}

}
