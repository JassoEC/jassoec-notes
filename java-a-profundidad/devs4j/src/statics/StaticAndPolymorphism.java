package statics;

class A {
	static void foo() {
		System.out.println("Foo de clase A");
	}
}

class B extends A {
	static void foo() {
		System.out.println(" Foo de clase B");
	}
}

public class StaticAndPolymorphism {
	public static void main(String[] args) {
		A a = new B();

		// foo in both classes is static
		// statics methods not depends of object creation, then use the implementation
		// of class who declares static method

		// output: Foo de clase A
		a.foo();
	}
}
