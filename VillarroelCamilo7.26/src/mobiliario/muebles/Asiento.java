package mobiliario.muebles;

public abstract class Asiento extends Mueble {

	public static final byte MIN_PLAZAS = 1;
	public static final byte MAX_PLAZAS = 9;

	private final byte numeroPlazas;
	private final String tapiceria;
	private final String color;

	public Asiento(float precio, String descripcion, byte numeroPlazas, String tapiceria, String color)
			throws IllegalArgumentException {
		super(precio, descripcion);
		if (numeroPlazas < MIN_PLAZAS || numeroPlazas > MAX_PLAZAS) {
			throw new IllegalArgumentException(
					String.format("El número de plazas no está en el rango permitido: %d", numeroPlazas));
		}

		this.numeroPlazas = numeroPlazas;
		this.tapiceria = tapiceria;
		this.color = color;

	}

	/**
	 * @return the numeroPlazas
	 */
	public byte getNumPlazas() {
		return numeroPlazas;
	}

	/**
	 * @return the tapiceria
	 */
	public String getTapiceria() {
		return tapiceria;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	@Override
	public String toString() {
		return super.toString() + String.format(" - Nº Plazas: %d - Tapiceria: %s - Color: %s", this.numeroPlazas,
				this.tapiceria, this.color);
	}

}
