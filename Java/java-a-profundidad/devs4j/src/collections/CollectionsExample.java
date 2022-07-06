package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class CollectionsExample {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();

		names.add("Tina");
		names.add("Maya");
		names.add("Emanuel");

		// Ordena la collecion de forma natural y en orden asencente
		Collections.sort(names);

		int index = Collections.binarySearch(names, "Tina");
		
		System.out.println(index);

		System.out.println(names);
		System.out.println(names.get(index));

	}

}
