package polymorphism;

public class Square extends Figure {

	private double base;

	public Square(String color, double base) {
		super(color);
		this.base = base;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	@Override
	public double calculateArea() {
		return this.base * this.base;
	}

}
