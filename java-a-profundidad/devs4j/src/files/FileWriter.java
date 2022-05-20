package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileWriter {
	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("/home/emanuel/Documentos/Cursos/java-output/writing.txt");

		try (PrintWriter pw = new PrintWriter(f)) {
			pw.println("Hola mundo en archivos con Java");
			pw.println("A los vivos no les hacen corridos");
			
			System.out.println("Ya termino");
		}
	}
}
