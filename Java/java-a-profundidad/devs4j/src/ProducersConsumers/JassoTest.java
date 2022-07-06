package ProducersConsumers;

public class JassoTest {
	public static void main(String[] args) {
		Resource resource = new Resource();

		Consumer consumer1 = new Consumer(resource, "consumer 1");
		Consumer consumer2 = new Consumer(resource, "consumer 2");

		Producer producer1 = new Producer(resource, "producer 1");
		Producer producer2 = new Producer(resource, "producer 2");

		producer1.start();
		producer2.start();

		consumer1.start();
		consumer2.start();
	}
}
