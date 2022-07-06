package arrays;

class Taco {
	private String flavour;
	private float price;
	private boolean onion;
	private boolean coriander;

	public Taco(String flavour, float price, boolean onion, boolean coriander) {
		super();
		this.flavour = flavour;
		this.price = price;
		this.onion = onion;
		this.coriander = coriander;
	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public boolean isOnion() {
		return onion;
	}

	public void setOnion(boolean onion) {
		this.onion = onion;
	}

	public boolean isCoriander() {
		return coriander;
	}

	public void setCoriander(boolean coriander) {
		this.coriander = coriander;
	}

}

public class ObjectArrays {

	public static void main(String[] args) {

		float count = 0.0f;
		Taco order[] = {
				new Taco("Suadero", 12.0f, true, true), 
				new Taco("Pastor", 10.0f, true, true),
				new Taco("Sirloin", 40.0f, true, true)
				};

		for (Taco t : order) {
			count += t.getPrice();
			System.out.println("Taco de " + t.getFlavour() + " con cebolla: " + t.isOnion() + " Con Cilantro: "
					+ t.isCoriander() + "\n");
		}

		System.out.println("Total de la cuenta: " + count);
	}

}
