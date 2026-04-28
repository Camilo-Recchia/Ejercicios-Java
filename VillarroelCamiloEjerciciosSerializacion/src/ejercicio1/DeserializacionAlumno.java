package ejercicio1;

import java.io.*;

public class DeserializacionAlumno {
	private FileInputStream file;
	private ObjectInputStream input;

	public DeserializacionAlumno(FileInputStream file) {
		super();
		this.file = file;
	}

	public void abrir() throws IOException {
		file = new FileInputStream("alumno.obj");
		input = new ObjectInputStream(file);
	}

	public void cerrar() throws IOException {
		if (input != null)
			input.close();
	}

	public Alumno leer() throws IOException, ClassNotFoundException {
		Alumno alumno = null;
		if (input != null) {
			try {
				alumno = (Alumno) input.readObject();
			} catch (EOFException eof) {
			}
		}
		return alumno;
	}
}
