package collections;

import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		TreeMap<String, String> map = new TreeMap<>();

		map.put("Emanuel", "Developer");
		map.put("Michelle", "Ella en la Maeta");
		map.put("Karla", "Es la que no debe ser nombrada");
		map.put("Jaqueline", "sepa la bola quien es");

		System.out.println(map);
	}
}
