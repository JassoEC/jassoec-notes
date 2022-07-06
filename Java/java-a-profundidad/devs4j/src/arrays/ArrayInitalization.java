package arrays;

public class ArrayInitalization {
	static void printArray(String array[]) {
		for (String item : array) {
			System.out.println(item);
		}
	}

	public static void main(String[] args) {

		// Explicit initialization
		String names[] = new String[2];
		names[0] = "Emanuel";
		names[1] = "Michelle";

		// Implicit initialization
		String cities[] = { "Mexico", "New York" };

		// Anonimous

		String names2[] = new String[] { "Emanuel", "Michelle" };

		
		printArray(cities);
	}
}
