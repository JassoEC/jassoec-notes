package exceptions;

// Esta clase hereda de una Super clase uncheck, por lo tanto no es forzoso capturar su excepcion
class WrongTitleException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public WrongTitleException(String message) {
		super(message);
	}

}

// Al heredar de una super class check se debe capturar su excepcion mediante bloeques trycatch o propagando la excepcion
class WrongTitleExceptionCheck extends Exception {

	private static final long serialVersionUID = 1L;

	public WrongTitleExceptionCheck(String message) {
		super(message);
	}

}

public class CutomException {

	static void createCourse(String name) {
		if (name.toUpperCase().equals(name)) {
			System.out.println("Titulo correcto");
		}

		throw new WrongTitleException("Debe estar en Uppecase");

	}

	public static void main(String[] args) {
		createCourse("Custo de java");
	}
}
