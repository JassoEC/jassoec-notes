package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class TextEditor {
	public static final String BASE_PATH = "/home/emanuel/Documentos/Cursos/java-output";

	public static String readMessage() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		return br.readLine();
	}

	public static void main(String[] args) throws IOException {
		System.out.println("Indica el nombre  del archivo");
		String fileName = readMessage();
		File f = new File(BASE_PATH.concat(File.separator).concat(fileName));

		System.out.println("Venga prro! \t Escribe exit para salir");

		String str = null;

		try (PrintWriter pr = new PrintWriter(f)) {
			do {
				str = readMessage();
				if (!"exit".equals(str)) {
					pr.println(str);
				}
			} while (!"exit".equals(str));
		}
	}

}
