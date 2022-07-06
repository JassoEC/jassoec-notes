package smokers;

import java.util.LinkedList;

public class Resource {
	private LinkedList<Component> components = new LinkedList<>();

	public synchronized void putOnTable(Component c) throws InterruptedException {
		components.offer(c);
		if (components.size() == 2) {
			wait();
			notify();
		}
	}

	public void notifySmokers() {
	}

	public synchronized Component consume() throws InterruptedException {
		return components.poll();
	}

	public Integer getSizeOfComponents() {
		return components.size();
	}

	public LinkedList<Component> getComponents() {
		return components;
	}	

}
