package smokers;

import java.util.Random;

public class Agent extends Thread {

	private Resource resources;

	public Agent(Resource resources) {
		super("Agent");
		this.resources = resources;
	}

	@Override
	public void run() {
		while (resources.getSizeOfComponents() < 2) {
			System.out.println(resources.getSizeOfComponents());
			int excluded = new Random().nextInt(3);
			System.out.println(excluded);

			for (ComponentType e : ComponentType.values()) {
				if (e.getId() == excluded) {
					continue;
				}
				try {
					resources.putOnTable(new Component(e));
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
		}
	}

}
