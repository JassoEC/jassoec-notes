package threads;

public class ThreadLifeTime {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new Counter(10));

		System.out.printf("State %s\n", t1.getState());

		t1.start();

		t1.join();

		System.out.printf("State %s", t1.getState());

		// Cuando un hilo se termina (pasa a Estado DEAD) no puede ser ejecutado de
		// nuevo
		t1.start();

	}

}
