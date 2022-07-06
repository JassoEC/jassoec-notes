//Class definitions

class Person {

  // Attributes
  // The value of attributes in a determinated time are the state of each object
  String name;
  int age;
  char gender;

  // Constructor es called as a class and no have value return
  // Java provides a empty constructor
  public Person() {}

  public Person(String name, int age, char gender) {
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
    emanuel.age = 28;
    emanuel.name = "Emanuel";
    emanuel.gender = 'M';
    emanuel.printInformation();

    Person michelle = new Person();
    michelle.age = 22;
    michelle.name = "Michelle";
    michelle.gender = 'M';
    michelle.printInformation();
    michelle.playGames(emanuel);
  }
}
