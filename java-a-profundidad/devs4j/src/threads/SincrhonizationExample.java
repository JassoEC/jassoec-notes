package threads;

class SyncCounter {
	static int counter = 10;

	public synchronized static void decrement() {
		counter--;
		System.out.println(counter);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Decrementor extends Thread {

	@Override
	public void run() {
		System.out.println("Decrementing SyncConnter");
		SyncCounter.decrement();
	}

}

public class SincrhonizationExample {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			new Decrementor().start();
		}
	}
}
