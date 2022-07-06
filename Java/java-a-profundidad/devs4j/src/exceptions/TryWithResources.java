package exceptions;

class EcjassoResource implements AutoCloseable {

	void foo() {
		System.out.println("Foo");
	}

	@Override
	public void close() {
		System.out.println("implementando autoclosable para liberar recursos");
	}

}

public class TryWithResources {

	public static void main(String[] args) {
		// La linea siguiente es la implementacion del try with reosurces
		try (EcjassoResource resource = new EcjassoResource()) {

			resource.foo();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
