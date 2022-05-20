package files.objects;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectWritter {
	public static void main(String[] args) throws IOException {
		Programer[] programmers = { new Programer("Emanuel", "Java"), new Programer("Patricia", "php"),
				new Programer("Juan Carlos", "C#"), null };

		File f = new File("/home/emanuel/Documentos/Cursos/java-output/programmers.txt");

		if (!f.exists()) {
			f.createNewFile();
		}

		try (FileOutputStream fos = new FileOutputStream(f); ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			
			for(Programer p : programmers){				
				oos.writeObject(p);
			}
		}
	}
}
