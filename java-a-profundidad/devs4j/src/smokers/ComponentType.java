package smokers;

public enum ComponentType {
	
	TOBACCO(1,"Tobacco"),PAPER(2, "Paper"),PHOSPHORUS(3, "Phosphorus");
	
	private int id;	
	private String name;

	private ComponentType(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
}
