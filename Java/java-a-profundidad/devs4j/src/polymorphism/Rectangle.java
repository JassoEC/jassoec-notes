package polymorphism;

public class Rectangle extends Figure implements Drawable {

	private double base;
	private double heigth;

	public Rectangle(String color, double base, double heigth) {
		super(color);
		this.base = base;
		this.heigth = heigth;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeigth() {
		return heigth;
	}

	public void setHeigth(double heigth) {
		this.heigth = heigth;
	}

	@Override
	public double calculateArea() {
		return this.base * this.heigth;
	}

	@Override
	public void draw() {
		System.out.println("Estoy dibujando un rectangulo");
	}

}
