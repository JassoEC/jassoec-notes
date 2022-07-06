package inheritance;

public class Estudent extends Person {
	int account;
	
	Estudent(String  name, String birthdate, int account){
		super(name, birthdate);
		this.account = account;
	}
	
	void approbe() {
		System.out.println("Soy " + this.name + " and i approbe");
	}
	
	//If uses Override method should exist in parent
	void disaprobe() {
		System.out.println("Soy " + this.name + " and i disapprobe");
	}
	
	@Override
	void sleep() {
		super.sleep(); //use of parent method references parent object
		System.out.println("Soy " + this.name + " soy estudiante y no duermo");
	}
}
