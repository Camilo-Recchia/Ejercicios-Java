package EjercicioArrayList;

import java.util.Comparator;

public class ComparadorPorNombreyGrupo implements Comparator<Registro> {

	@Override
	public int compare(Registro o1, Registro o2) {

		return o1.getNombre().compareTo(o2.getNombre());
	}

}
