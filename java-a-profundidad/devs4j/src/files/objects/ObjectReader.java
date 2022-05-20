package files.objects;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectReader {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		File file = new File("/home/emanuel/Documentos/Cursos/java-output/programmers.txt");

		try (FileInputStream fis = new FileInputStream(file); ObjectInputStream ois = new ObjectInputStream(fis)) {
			while (true) {
				try {

					Programer p = (Programer) ois.readObject();
					if (p != null) {

						System.out.println(p.getName());
						System.out.println(p.getLaguage());
					} else {
						System.out.println("Es null");

					}
				} catch (EOFException e) {
					break;
				}
			}
		}

	}

}
