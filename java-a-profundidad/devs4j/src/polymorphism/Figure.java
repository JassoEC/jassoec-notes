package polymorphism;

// If Have an abstract method class should be abstract
// Abstract classes can't be final, because final class cannot be extended
public abstract class Figure {
	private String color;
	
	public Figure(String color) {		
		this.color = color;
	}

	// abstract method doesn't have body
	// The implementation (subclass) should implement the method
	public abstract double calculateArea();

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
