package ejercicio4;

import java.util.Comparator;

public class SortTrabajador implements Comparator<Trabajador> {

	@Override
	public int compare(Trabajador o1, Trabajador o2) {
		int res = o1.getSexo().compareTo(o2.getSexo());

		if (res == 0) {
			res = o1.getEstadoCivil().compareTo(o2.getEstadoCivil());
		}

		return res;

	}

}
