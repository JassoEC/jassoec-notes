package classes;
//Class definitions

class Person {

  // Attributes
  // The value of attributes in a determinate time are the state of each object
  String name;
  int age;
  char gender;

  // Constructor is called as a class and no have value return
  // Java provides a empty constructor
  Person() {
	  System.out.println("Esto es un constructor por defecto");
  }

  // When constructor is created  default constructor is discarded
  Person(String name, int age, char gender) {
	this();
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  // Methods
  void printInformation() {
    System.out.println("Name: " + this.name);
    System.out.println("AGe: " + this.age);
    System.out.println("Gender: " + this.gender);
  }

  void playGames(Person p) {
    System.out.println(this.name + " esta jusgando con " + p.name);
  }

  public static void main(String args[]) {
    Person emanuel = new Person("Emanuel", 28, 'M');    
    emanuel.printInformation();

    Person michelle = new Person("Michelle", 22, 'F');    
    michelle.printInformation();
    michelle.playGames(emanuel);
  }
}
