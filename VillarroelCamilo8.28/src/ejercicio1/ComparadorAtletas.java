package ejercicio1;

import java.util.Comparator;

public class ComparadorAtletas implements Comparator<Atleta> {

	@Override
	public int compare(Atleta o1, Atleta o2) {
		return o1.getNombre().compareTo(o2.getNombre());
	}

}
