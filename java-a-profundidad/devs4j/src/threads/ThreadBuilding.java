package threads;

class JassoThread extends Thread {

	public JassoThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 0; i <= 1000000; i++) {
			System.out.printf("Thread %s -- index: %d \n", getName(), i);
			/*try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}*/
		}
	}

}

public class ThreadBuilding {
	public static void main(String[] args) {
		JassoThread t1 = new JassoThread("thread 1");
		JassoThread t2 = new JassoThread("thread 2");
		JassoThread t3 = new JassoThread("thread 3");
		/*
		 * it's possible use the run() method but execute as a normal method non
		 * concurrent
		 * 
		 */

		// t1.run();
		// t2.run();

		t1.start();
		t2.start();
	}
}
