package collections;

import java.util.PriorityQueue;

public class PriorityQues {
	public static void main(String[] args) {
		PriorityQueue<Integer> queue = new PriorityQueue<>();

		queue.add(2000);
		queue.add(100);
		queue.add(1);
		queue.offer(150);
		queue.add(10);

		// por defecto los ordena de forma natural es decir, en este caso los numeros
		// seran ordenado de mayor a menor
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue);
	}
}
