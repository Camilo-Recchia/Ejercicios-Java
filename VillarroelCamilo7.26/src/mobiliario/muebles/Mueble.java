package mobiliario.muebles;

public abstract class Mueble {

	public final static float MIN_PRECIO = (float) 0.01;
	public final static float MAX_PRECIO = (float) 10000;

	private static int id = 0;

	private final int identificador;
	private final String descripcion;

	protected float precio;

	public Mueble(float precio, String descripcion) {
		if (precio > MAX_PRECIO || precio < MIN_PRECIO) {
			throw new IllegalArgumentException(String.format("El precio no está en el rango permitido: %.2f", precio));
		}
		identificador = id++;
		this.precio = precio;
		this.descripcion = descripcion;

	}

	// Metodo que devuelve el id del mueble
	public int getId() {
		return id;
	}

	public float getPrecio() {
		return precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String toString() {
		return String.format("Tipo: %-11s - id: %03d - Precio: %03.2f - Descripcion: %s",
				this.getClass().getSimpleName(), identificador, precio, descripcion);
	}
}
