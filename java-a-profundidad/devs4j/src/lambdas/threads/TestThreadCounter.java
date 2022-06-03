package lambdas.threads;

public class TestThreadCounter {
	public static void main(String[] args) {
		Thread t = new Thread(new CounterThread());
		t.start();
		
		Runnable runnable2 = ()->{
			for(int i=0; i< 10; i++) {
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Thread t2 = new Thread(runnable2);
		t2.start();
	}
}
