package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HasMapExample {

	public static void main(String[] args) {
		Map<String, String> dictionary = new HashMap<>();
		dictionary.put("jassoec", "Cuenta de github");
		dictionary.put("java", "Lenguaje de programacion");
		dictionary.put("Michelle", "Es mi novia");
		// cuando se agregan llaves duplicadas se remplaza la anterior
		dictionary.put("Michelle", "Es mi novia desde hace casi dos años");
		dictionary.put(null, "Representa lo que me importa Karla");

		System.out.println(dictionary);

		for (String key : dictionary.keySet()) {
			System.out.println(key + " = " + dictionary.get(key));
		}

		System.out.println();

		for (Entry<String, String> entry : dictionary.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
		
		/*
		 * 
		 * 
		 * 
		 * 
		 * */
		
	}

}
