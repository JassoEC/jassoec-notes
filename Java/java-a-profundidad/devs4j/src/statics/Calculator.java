package statics;

public class Calculator {

	// Static method can be used without create object
	static int sum(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		
		// static method sum is used in static context
		System.out.println(sum(4, 8));
	}

}
