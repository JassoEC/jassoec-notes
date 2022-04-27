package polymorphism;

public class TestFigure {

	void printArea(Figure figure) {
		System.out.println("Es de color " + figure.getColor() + " Y tiene un area de " + figure.calculateArea());
	}

	public static void main(String[] args) {

		TestFigure test = new TestFigure();
		
		Circle circle = new Circle("Rojo", 10);
		Square square = new Square("Verde", 25);
		Rectangle rectangle = new Rectangle("Azul", 30, 25);
		
		test.printArea(circle);
		test.printArea(rectangle);
		test.printArea(square);
	}

}
