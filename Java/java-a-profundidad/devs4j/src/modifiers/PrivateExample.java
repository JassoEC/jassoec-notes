package modifiers;

class Test {
	// private accessible only for the class
	private String name;

	Test() {

	}

	private void foo() {

	}
}

public class PrivateExample {

	public static void main(String[] args) {
		Test test = new Test();

		//test.foo();
	}

}
