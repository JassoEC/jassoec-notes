package inheritance;

// Root classes extends of Object
class Animal {
	String name;

	public void breathe() {
		System.out.println("I'm breathing");
	}
}

class Dog extends Animal {
}


class Cat extends Animal{
	
}

public class InheritanceExample {
	public static void main(String args[]) {
		 Animal a = new Animal();
		 
		 Dog dog = new Dog();
		 dog.name = "Tina";
		 dog.breathe();
		 
		 Cat cat = new Cat();
		 cat.breathe();
		 
		 System.out.println(dog instanceof Animal);
		 
		 // Rule "IS a"
		 // Example. Cat is not animal
		 System.out.println(a instanceof Cat);
	}
}