package collections;

import java.util.Arrays;
import java.util.List;

public class WildCardExample {

	// Un wild card ? traduce como "Cualquiera que extienda de Class dada"
	static double sumValues(List<? extends Number> list) {
		double sum = 0;
		for (Number number : list) {
			sum += number.doubleValue();
		}
		return sum;
	}

	public static void main(String[] args) {

		double sum = sumValues(Arrays.asList(10.4, 11, 5f, 10l));
		System.out.println(sum);
	}

}
