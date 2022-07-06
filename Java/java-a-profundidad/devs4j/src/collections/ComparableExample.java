package collections;

import java.util.TreeSet;

class Dog implements Comparable<Dog> {
	private String name;

	public Dog(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + "]";
	}

	@Override
	public int compareTo(Dog o) {
		return o.getName().compareTo(this.getName());
		//return this.getName().compareTo(o.getName());
	}

}

public class ComparableExample {

	public static void main(String[] args) {
		TreeSet<Dog> set = new TreeSet<>();

		set.add(new Dog("Tina"));
		set.add(new Dog("ZTina"));
		set.add(new Dog("Maya"));

		System.out.println(set);
	}

}
