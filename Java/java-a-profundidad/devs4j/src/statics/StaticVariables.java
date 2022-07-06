package statics;

class Human {
	// static value exists in each instance of class
	static int numberOfHumans = 0;

	Human() {
		this.numberOfHumans++;
	}
}

public class StaticVariables {
	// Class/instance attribute
	int x = 0;

	// Statics determine if is necessary create an object
	public static void main(String args[]) {

		// This is an error because x is not in a static context

		// System.out.println(x);

		// this is correct

		StaticVariables staticVar = new StaticVariables();

		System.out.println(staticVar.x);

		System.out.println("Number of humans " + Human.numberOfHumans);

		new Human();
		new Human();
		new Human();
		new Human();
		new Human();
		new Human();

		// is the same reference for each instance of class
		System.out.println("Number of humans " + Human.numberOfHumans);
	}
}
