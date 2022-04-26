package AbstractionEncapsulation;

public class TestEncapsulation {

	public static void main(String[] args) {
		Encapsulation e = new Encapsulation();
		
		// This is a private method only available into the class

		//e.sumTwoNumbers();
		
		// this is a public method available always
		e.hello("Emanuel");
	}

}
