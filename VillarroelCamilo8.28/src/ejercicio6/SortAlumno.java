package ejercicio6;

import java.util.Comparator;

public class SortAlumno implements Comparator<Alumno> {

	@Override
	public int compare(Alumno o1, Alumno o2) {
		int res;

		if (o1.getCodigoAlumno() > o2.getCodigoAlumno()) {
			res = 1;
		} else if (o1.getCodigoAlumno() < o2.getCodigoAlumno()) {
			res = -1;
		} else {
			res = 0;
		}
		return res;
	}

}
