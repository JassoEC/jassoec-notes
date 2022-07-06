package arrays;

// Es un tipo de objexo que respresenta valores constantes
enum PopCornFlavours {
	SPICY("Chile", 10f), HEESE("Queso", 35f), CANDY("Caramelo", 25f), BUTTER("Mantequilla", 28f);

	private String saleName;
	private float price;

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	private PopCornFlavours(String name, float price) {
		this.saleName = name;
		this.price = price;
	}

	public String getSaleName() {
		return saleName;
	}

}

public class Enumerations {
	public static void main(String[] args) {
		PopCornFlavours spicy = PopCornFlavours.SPICY;

		/*
		 * Representa el nombre literal de la constante output: SPICY
		 */
		System.out.println(spicy.name());

		/*
		 * Como es un objeto puede tener un constructor por lo tanto ahora tenemos la
		 * salida de el acceso a un prop adicional
		 * 
		 */
		System.out.println(spicy.getSaleName() + " $" + spicy.getPrice());
	}
}
