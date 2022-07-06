package lambdas.compartors;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class LambdaCompartor {

	public static void main(String[] args) {
		Comparator<Person> comparator = (Person p1, Person p2)->p1.getLastName().compareTo(p2.getLastName());
		Set<Person> persons = new TreeSet<>(comparator);
		
		persons.add(new Person("Emanuel", "Campos",28));
		persons.add(new Person("Michelle", "Pacheco",22));
		persons.add(new Person("Diego Armando", "Gutierrez",27));
		persons.add(new Person("Jose", "Garcia",26));
		persons.add(new Person("Ana", "Jimenez",25));
		persons.add(new Person("Eduardo", "Gonzalez",24));
		
		System.out.println(persons);
	}

}
