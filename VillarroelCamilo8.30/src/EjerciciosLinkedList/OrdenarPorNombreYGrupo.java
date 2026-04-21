package EjerciciosLinkedList;

import java.util.Comparator;

import EjercicioArrayList.Registro;

public class OrdenarPorNombreYGrupo implements Comparator<Registro> {

	@Override
	public int compare(Registro o1, Registro o2) {

		int ordenador = o1.getNombre().compareTo(o2.getNombre());

		if (ordenador == 0) {
			ordenador = o1.getCurso().compareTo(o2.getCurso());
		}

		return ordenador;
	}

}
