package arrays;

public class UnidimensionalArray {
	public static void main(String[] args) {

		// Un arreglo debe tener una longitud definida
		int array[] = new int[3];

		array[0] = 20;
		array[1] = 21;
		array[2] = 22;

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		for (int temp : array) {
			System.out.println(temp);
		}
	}
}
