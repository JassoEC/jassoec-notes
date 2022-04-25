package inheritance;

public class Employee extends Person {
	float payment;

	Employee(String name, String birthdate, float payment) {
		super(name, birthdate);
		this.payment = payment;
	}

	void work() {
		System.out.println("soy " + this.name + " and i am working");
	}

	void charge() {
		System.out.println("I am charging " + this.payment);
	}
}
