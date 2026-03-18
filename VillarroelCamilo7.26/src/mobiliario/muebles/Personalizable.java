package mobiliario.muebles;

import mobiliario.pruebas.Modulo;

public interface Personalizable {

	public Modulo[] obtenerModulos();

	public void anyadirModulo(Modulo modulo) throws IllegalStateException, NullPointerException;

	public void extraerModulo() throws IllegalStateException;
}
