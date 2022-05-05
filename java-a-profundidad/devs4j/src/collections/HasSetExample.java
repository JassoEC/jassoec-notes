package collections;

import java.util.HashSet;

public class HasSetExample {

	public static void main(String[] args) {
		HashSet<String> names = new HashSet<>();
		
		// metodo add retorna boolean, comprueba que elemento existe en Set
		// solo se agrega si no existe un objeto igual
		
		names.add("Emanuel");		
		System.out.println(names.add("Michelle"));
		System.out.println(names.add("Michelle"));
		names.add("Jaqueline");
		names.add("Karla");
		names.add("Gloria");
		names.add(null);
		
		
		System.out.println(names);
	}

}
