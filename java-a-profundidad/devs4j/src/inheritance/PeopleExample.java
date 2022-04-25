package inheritance;

public class PeopleExample {

	public static void main(String[] args) {
		
		// final primitive
		// final int age = 59; cannot modify
		
		
		// Final in objects cannot modify reference to object only attributes
		Estudent e = new Estudent("Emanuel","30/10/1994",123243);
		//e.name = "Emanuel";
		//e.birthdate ="30/10/1994";		
		
		e.sleep();
		e.approbe();
		e.disaprobe();

	}

}
