package collections;

import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		list.add("Emanuel");
		list.add("Michelle");
		list.add("Maura");
		
		System.out.println(list);
		
		
		System.out.println(list.peek());
		System.out.println(list.getLast());

	}
}
