package collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Cat {

	private String name;
	private String lastName;

	public Cat(String name, String lastName) {
		super();
		this.name = name;
		this.lastName = lastName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", lastName=" + lastName + "]";
	}

}

// Con comparators podemos hacer multiples ordenamientos

// Con Comparables solo podemos tener una sola comparacion

class SortByName implements Comparator<Cat> {

	@Override
	public int compare(Cat o1, Cat o2) {
		return o1.getName().compareTo(o2.getName());
	}

}

class SortByLastName implements Comparator<Cat> {
	
	@Override
	public int compare(Cat o1, Cat o2) {
		return o1.getLastName().compareTo(o2.getLastName());
	}
}

public class ComparatorExample {

	public static void main(String[] args) {
		//Set<Cat> cats = new TreeSet<>(new SortByName());
		Set<Cat> cats = new TreeSet<>(new SortByLastName());

		cats.add(new Cat("Abril", "Pacheco"));
		cats.add(new Cat("Noodles", "Rufino"));
		cats.add(new Cat("Solovino", "Gonzalez"));
		
		System.out.println(cats);
	}

}
