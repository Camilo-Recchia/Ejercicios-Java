package ejemploFiles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritering {

	public static void main(String[] args) {

		File archvio = new File("enteros1.txt");

		try (FileWriter escritor = new FileWriter(archvio)) {

			for (int i = 0; i < 100; i++) {
				escritor.write(i + "\n");
			}

			escritor.close();

		} catch (IOException e) {
			System.out.println("ERROR: " + e.getMessage());
		}

	}

}
