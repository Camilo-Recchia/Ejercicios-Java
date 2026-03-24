package ejercicio7;

import java.util.Comparator;

public class SortVenta implements Comparator<Venta> {

	@Override
	public int compare(Venta o1, Venta o2) {
		int o;
		if (o1.getVenta() < o2.getVenta()) {
			o = -1;
		} else if (o1.getVenta() > o2.getVenta()) {
			o = 1;
		} else {
			o = o1.getMes().compareToIgnoreCase(o2.getMes());
		}

		return o;
	}

}
