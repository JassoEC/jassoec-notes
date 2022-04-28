package polymorphism;

public class Circle extends Figure implements Drawable {

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

	void road() {
		System.out.println("The circle " + this.getColor() + "is on road");
	}

	@Override
	public void draw() {
		System.out.println("Estoy dibuajndo un circulo");
	}

}
