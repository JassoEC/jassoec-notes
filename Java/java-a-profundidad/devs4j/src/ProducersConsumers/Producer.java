package ProducersConsumers;

import java.util.Random;

public class Producer extends Thread {
	private Resource resource;

	public Producer(Resource resource, String name) {
		super(name);
		this.resource = resource;
	}

	@Override
	public void run() {
		super.run();

		while (true) {
			try {
				int value = new Random().nextInt(300);

				System.out.printf("%s produced %d\n", getName(), value);
				resource.produce(new Random().nextInt(1000));
				Thread.sleep(value);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
