package lambdas.compartors;

import java.util.Set;
import java.util.TreeSet;

public class ComparatorTest {
	public static void main(String[] args) {
		PersonNameComparator comparator= new PersonNameComparator();
		Set<Person> persons = new TreeSet<>(comparator);
		
		persons.add(new Person("Emanuel", "Campos",28));
		persons.add(new Person("Michelle", "Pacheco",22));
		persons.add(new Person("Diego Armando", "Campos",27));
		persons.add(new Person("Jose", "Campos",26));
		persons.add(new Person("Ana", "Campos",25));
		persons.add(new Person("Eduardo", "Campos",24));
		
		System.out.println(persons);
	}
}
