package ejercicio1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Principal {
	public static void main(String[] args) {

		ArrayList<Alumno> list = new ArrayList<Alumno>();

		@SuppressWarnings("unused")
		Alumno alumno;

		for (int i = 0; i < 10; i++) {
			list.add(alumno = new Alumno("1234"));
		}
		try {

			ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("alumno.obj"));

			for (Alumno alumnos : list) {

				salida.writeObject(alumnos);
			}
			salida.close();

		} catch (IOException ex) {
			System.out.println(ex);
		}

	}

}