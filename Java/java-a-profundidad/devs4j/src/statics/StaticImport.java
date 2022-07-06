package statics;

// esta importacion se realiza de forma implicita
import java.lang.*;

// le indicas que importe un miembro static, sqrt es un metodo static
import static java.lang.Math.sqrt;

// se especifica la importacion de los miembros estaticos es decir metodos y variables de clase
import static java.lang.Math.*;

public class StaticImport {
	public StaticImport() {
		super();
	}

	public static void main(String[] args) {

		// la importacion por defecto de java.lang* es lo que nos permite hacer uso de
		// esa clase sin tener que importarla manualmente

		// Al realizar el import static de sqrt, pasa a ser miembro de nuestra clase
		// como si estuviera definido en ella
		System.out.println(sqrt(35));

		// Pow esta dispobible como miembro de la clase porque se realizo un static
		// import de los miembros estaticos de la clase Math
		System.out.println(pow(25, 5));
		
		// PI tambien fue importado como miembro estatico de Math
		System.out.println(PI);
	}
}
