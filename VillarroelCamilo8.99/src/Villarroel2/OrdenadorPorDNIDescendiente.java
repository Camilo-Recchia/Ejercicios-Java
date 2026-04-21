package Villarroel2;

import java.util.Comparator;

public class OrdenadorPorDNIDescendiente implements Comparator<Empleado> {

	@Override
	// Compara los empleados segun su dni de forma descendiente
	public int compare(Empleado o1, Empleado o2) {

		return o2.getDni().compareTo(o1.getDni());
	}

}
