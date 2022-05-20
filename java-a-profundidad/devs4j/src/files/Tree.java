package files;

import java.io.File;

public class Tree {

	private static void print(File[] files, String tabs) {
		String spaces = tabs.concat(" ");

		if (files != null) {
			for (File file : files) {
				if (file.isFile()) {
					System.out.printf("%s %s \n", spaces.substring(0, spaces.length()-1).concat("|".concat(spaces)), "==>".concat(file.getName()));
				} else {					
					System.out.printf("%s %s \n", tabs, "|-".concat(file.getName()));

					print(file.listFiles(), tabs.concat(" "));
				}
			}
		}
	}

	public static void main(String[] args) {
		File f = new File("/home/emanuel/Documentos/Cursos/jassoec-notes");
		System.out.println(f.getName());
		print(f.listFiles(), " ");
	}
}
