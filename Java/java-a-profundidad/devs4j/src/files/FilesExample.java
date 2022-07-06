package files;

import java.io.File;

public class FilesExample {
	public static void main(String[] args) {
		File f = new File("/home/emanuel/Documentos/Cursos/java-output");

		System.out.println("Is file " + f.isFile());
		System.out.println("Is directory " + f.isDirectory());
		System.out.println("Can read " + f.canRead());
		System.out.println("Can execute " + f.canExecute());

		File[] content = f.listFiles();
		for (File file : content) {
			System.out.println("Content - Is file " + file.isFile());
			System.out.println("Content - Is directory " + file.isDirectory());
			System.out.println("Content - Can read " + file.canRead());
			System.out.println("Content - Can execute " + file.canExecute());
		}
	}
}
