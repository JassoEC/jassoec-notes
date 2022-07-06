package collections;

class Transport {
}

class Car extends Transport {
}

class Sport extends Car {
}

// T extends Class (Tranport)
// Limita el uso de genericos a travez de la herencia

class BeanGeneric<T extends Transport> {
	private T value;

	public BeanGeneric(T value) {
		super();
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

}

public class GenericExample {

	public static void main(String[] args) {

		BeanGeneric<Transport> bean = new BeanGeneric<>(new Car());

		System.out.println(bean.getValue());
	}

}
