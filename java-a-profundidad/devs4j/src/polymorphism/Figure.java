package polymorphism;

public class Figure {
	private String color;
	
	public Figure(String color) {		
		this.color = color;
	}

	public double calculateArea() {
		return 0;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
