package polymorphism;

public class TestDrawable {

	void testDraw(Drawable drawable) {
		drawable.draw();
	}

	public static void main(String[] args) {
		TestDrawable test = new TestDrawable();

		test.testDraw(new Circle("Red", 10));
		
		// Square not implements Drawable		
		//test.testDraw(new Square("Green",10));
		
		
		// Image implements Drawable
		
		// Aplica la regla "es un"
		/*
		 * Una imagen es un dibujable
		 * de esta forma podemos usar polimorfismo con interfaces*/
		test.testDraw(new Image());
		
		System.out.println(new Circle("red", 10) instanceof Drawable);
	}

}
