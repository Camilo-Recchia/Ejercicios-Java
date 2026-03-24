package botanico;

import java.time.LocalDate;
import java.time.temporal.TemporalAccessor;
import java.util.Comparator;

public class Ejercicio3Sort implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {

		int r;

		if (LocalDate.from((TemporalAccessor) o1).isBefore(LocalDate.from((TemporalAccessor) o2))) {
			r = -1;
		} else if (LocalDate.from((TemporalAccessor) o1).isAfter(LocalDate.from((TemporalAccessor) o2))) {
			r = 1;
		} else {
			r = 0;
		}
		return r;
	}

}
