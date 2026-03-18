package ejercicio3;

import java.util.Comparator;

import ejercicio2.Contacto;

public class ContactoOrdenador implements Comparator<Contacto> {

	@Override
	public int compare(Contacto o1, Contacto o2) {
		return o1.getNombre().compareTo(o2.getNombre());
	}

}
