package threads;

public class JassoCounter {

	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread(new Counter(10), "thread 1");
		Thread t2 = new Thread(new Counter(17), "thread 2");

		System.out.println("Firing threads \n");
		t.start();
		t2.start();
		
		t.join();
		t2.join();
		
		System.out.println("End of program");

	}

}
