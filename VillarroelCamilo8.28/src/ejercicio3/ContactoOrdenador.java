package ejercicio3;

import java.util.Comparator;

import ejercicio2.Alumno;

public class ContactoOrdenador implements Comparator<Alumno> {

	@Override
	public int compare(Alumno o1, Alumno o2) {
		return o1.getNombre().compareTo(o2.getNombre());
	}

}
