package smokers;

public class Component {

	private ComponentType type;

	public Component(ComponentType type) {
		this.type = type;
	}

	public ComponentType getType() {
		return type;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ComponentType) {
			return this.getType().getId() == ((ComponentType) obj).getId();
		}
		return false;
	}

}
