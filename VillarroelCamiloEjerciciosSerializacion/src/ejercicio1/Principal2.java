package ejercicio1;

import java.io.FileInputStream;
import java.io.IOException;

public class Principal2 {

	public static void main(String[] args) {
		try {

			DeserializacionAlumno entrada = new DeserializacionAlumno(new FileInputStream("alumno.obj"));

			entrada.abrir();

			for (int i = 0; i < 10; i++) {

				Alumno alumnoRecuperado = entrada.leer();
				System.out.println("------------------------------");
				System.out.println(alumnoRecuperado);
				System.out.println("------------------------------");

			}

			entrada.cerrar();
		} catch (IOException ex) {
			System.out.println(ex);
		} catch (ClassNotFoundException ex) {
			System.out.println(ex);
		}
	}
}