package wrapper;

public class ConvertionMethods {
	public static void main(String[] args) {
		Integer x = 10;

		// obtiene el valor primitivo de un objeto tipo wrapper
		double d = x.doubleValue();
		float f = x.floatValue();
		
		String value = "10";
		
		int valueInt = Integer.parseInt(value);
		
		// Devuelve un tipo wrapper, es decir una instancia de tipo Doble
		Double dd = Double.valueOf("55");
	}
}
