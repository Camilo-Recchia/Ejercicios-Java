package mobiliario.muebles;

public class Silla extends Asiento implements Ajustable {

	public static final byte MIN_POSICION = 1;
	public static final byte MAX_POSICION = 4;

	public byte posicionRespaldo;

	public Silla(float precio, String descripcion, byte numeroPlazas, String tapiceria, String color)
			throws IllegalArgumentException {
		super(precio, descripcion, Asiento.MIN_PLAZAS, tapiceria, color);

		this.posicionRespaldo = MIN_POSICION;
	}

	@Override
	public byte obtenerPosicion() {
		return posicionRespaldo;
	}

	@Override
	public byte subirPosicion() throws IllegalStateException {
		if (posicionRespaldo >= MAX_POSICION) {
			throw new IllegalStateException(
					String.format("Error: no se puede subir a la posición %d, ya que la posición máxima es %d",
							posicionRespaldo++, MAX_POSICION));
		}

		this.posicionRespaldo++;
		return this.posicionRespaldo;
	}

	@Override
	public byte bajarPosicion() throws IllegalStateException {
		if (posicionRespaldo <= MIN_POSICION) {
			throw new IllegalStateException(
					String.format("Error: no se puede bajar a la posición %d, ya que la posición minima es %d",
							posicionRespaldo--, MIN_POSICION));
		}

		this.posicionRespaldo--;
		return this.posicionRespaldo;
	}

	@Override
	public String toString() {
		return super.toString() + String.format(" - Posición:%d", this.posicionRespaldo);
	}

}
