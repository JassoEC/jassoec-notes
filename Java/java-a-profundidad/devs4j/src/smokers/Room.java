package smokers;

public class Room {
	public static void main(String[] args) {
		Resource resource = new Resource();
		
		Smoker smoker1 = new Smoker(resource, ComponentType.PAPER, "Smoker 1");
		Smoker smoker2 = new Smoker(resource, ComponentType.TOBACCO, "Smoker 2");
		Smoker smoker3 = new Smoker(resource, ComponentType.PHOSPHORUS, "Smoker 3");

		Agent agent = new Agent(resource);

		agent.start();
		smoker1.start();
		smoker2.start();
		smoker3.start();
	}
}
