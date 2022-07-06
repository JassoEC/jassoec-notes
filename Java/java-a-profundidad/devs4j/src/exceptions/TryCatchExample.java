package exceptions;

public class TryCatchExample {
	public static void main(String[] args) {

		try {

			int x = 10;
			int y = 10 / x;

			// cuando se produce una excepcion se interrumpe y se va al bloque catch
			System.out.println("Divition value " + y);

			String name = null;

			System.out.println(name.toString());
			
			// aunque tenga muchos catch solo uno de ellos se va a ejecutar
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			// Exception es muy generico y si esta al principio captura cualquier excepcion
			// por lo que poner codigo especifico con una excepcion generica no tiene
			// sentido
			
			// Procurar ir de la mas especifica a las mas general
		} finally {
			// si tenemos o no exception siempre se va a ejecutar
			System.out.println("Allways execute");
		}

		try {

			int x = 10;
			int y = 10 / x;

			System.out.println("Divition value " + y);

			String name = null;

			System.out.println(name.toString());
		} catch (NullPointerException | ArithmeticException e) {
			// Union catch block
			// Se ejecuta cuando todos los tipos de excepciones presentes quieren ser
			// catpurados

			System.err.printf("Excecion de union catch block %s ", e.getMessage());
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
