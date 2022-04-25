package inheritance;

// public final class Person {  final class cannot been extended
public class Person {
	
	String name;
	String birthdate;

//	Person(){
//		
//	}
	
	Person(String name, String birthdate ){
		this.name = name;
		this.birthdate = birthdate;
	}
	
	void sleep() {
		System.out.println("I'm "+this.name +" and i am sleeping");
	}
	
	void eat() {
		System.out.println("I'm eating");
	}
	
	void breathe() {
		System.out.println("I'm breathing since " + this.birthdate);
	}
}
