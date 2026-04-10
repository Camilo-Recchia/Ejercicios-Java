package EjercicioArrayList;

import java.util.Comparator;

public class ComparadorPorNombre implements Comparator<Registro> {

	@Override
	public int compare(Registro o1, Registro o2) {
		int resultado = o1.getCurso().compareTo(o2.getCurso());

		if (resultado == 0) {

			resultado = o1.getNombre().compareTo(o2.getNombre());
		}

		return resultado;
	}

}
