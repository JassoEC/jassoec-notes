package statics;

public class StaticBlock {
	
	/*
	 * Static block: se ejecuta cuando es cargado en la maquina virtual
	 * 
	 *  Puedes usar N cantidad de bloques staticos y se ejecutan en orden de aparecion
	 *  
	 *  
	 *  puede ser usado para inicializar valores de los de que dependan las variables staticos
	 * */
	
	static {		
		System.out.println("Hello world");
	}
	
	public static void main(String[] args) {
	}
}
