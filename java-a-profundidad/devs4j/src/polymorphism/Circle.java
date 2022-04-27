package polymorphism;

public class Circle extends Figure {

	private double radious;

	public Circle(String color, double radious) {
		super(color);
		this.radious = radious;
	}

	public double getRadious() {
		return radious;
	}

	public void setRadious(double radious) {
		this.radious = radious;
	}

	@Override
	public double calculateArea() {
		return Math.PI * Math.pow(this.radious, 2);
	}

}
