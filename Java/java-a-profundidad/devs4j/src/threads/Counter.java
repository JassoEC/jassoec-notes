package threads;

public class Counter implements Runnable {
	private int value;

	public Counter(int value) {
		this.value = value;
	}

	@Override
	public void run() {
		System.out.printf("Internal  state %s\n", Thread.currentThread().getState());
		for (int i = this.value; i >= 0; i--) {
			System.out.printf("Value %d Name: %s \n", i, Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}