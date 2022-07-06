package smokers;

public class Smoker extends Thread {

	private Resource resource;
	private ComponentType component;

	public Smoker(Resource resource, ComponentType component, String name) {
		super(name);
		this.resource = resource;
		this.component = component;
	}

	@Override
	public void run() {
		boolean inList=false;
		while (true) {
			if (resource.getSizeOfComponents() == 2) {
				for (Component c : resource.getComponents()) {
					System.out.println(c.getType().getName());
					if (c.equals(this.component)) {
						inList = true;						
					}
				}
				if(!inList) {
					System.out.println("wa fumar" + this.getName());
					try {
						Thread.currentThread().sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}

}
