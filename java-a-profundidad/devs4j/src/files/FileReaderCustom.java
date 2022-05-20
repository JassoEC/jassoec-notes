package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderCustom {

	public static void main(String[] args) throws IOException {
		File f = new File("/home/emanuel/Documentos/Cursos/java-output/writing.txt");

		if (f.exists()) {
			try (FileReader fr = new FileReader(f); BufferedReader br = new BufferedReader(fr);) {
				String str = null;
				do {
					str = br.readLine();
					System.out.println(str);
				} while (str != null);
			}
		} else {
			System.out.println("no hay, no existe");
		}

	}

}
