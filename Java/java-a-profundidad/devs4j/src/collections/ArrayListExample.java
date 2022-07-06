package collections;

import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {

		ArrayList array = new ArrayList();
		// Esta basado en arreglo y tiene una capacidad default de 10 elementos
		System.out.println(array.size());

		// is possible but not recomended use any type of data
		array.add(1);
		array.add("String of array list");
		array.add(new Object());

		ArrayList<String> newArray = new ArrayList<>();
		newArray.add("Emanuel");
		newArray.add("Emanuel");
		newArray.add("Emanuel");
		newArray.add("Emanuel");
		newArray.add("Emanuel");
		newArray.add("Emanuel");
		newArray.add("Emanuel");
		newArray.add("Emanuel");
		newArray.add("Emanuel");
		newArray.add("Emanuel");
		newArray.add("Emanuel");
		newArray.add("Emanuel");
		newArray.add("Emanuel");
		System.out.println(newArray);
		System.out.println(newArray.size());

		// Dado que esta basado en arreglos no es el mas eficiente al redimensionar
		// pues tiene que hacer copias del arreglo y mober en posiones para agregar el
		// nuuevo valro en la posicion dada
		newArray.add(5, "Michelle");

		System.out.println(newArray);
	}
}
