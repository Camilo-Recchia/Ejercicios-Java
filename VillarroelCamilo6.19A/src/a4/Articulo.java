package a4;

public class Articulo {

	public static int cuantosQuedan;

	private String nombre;

	private int precio;

	private final byte IVA = 21;

	public Articulo(String nombre, int precio) {

		this.nombre = nombre;
		this.precio = precio;

		if (nombre == null) {
			throw new IllegalArgumentException("El apartado \"nombre\" no puede ser null");
		} else if (nombre.isEmpty()) {
			throw new IllegalArgumentException("El apartado \"nombre\" no puede estar vacio");
		} else if (precio <= 0) {
			throw new IllegalArgumentException("El apartado \"precio\" no puede ser negativo");
		}
		cuantosQuedan++;
	}

	// Getters de los distintos atributos

	public String getNombre() {
		return nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public int getIVA() {
		return IVA;
	}

	// Setters de los distintos atributos

	public void setNombre(String nombre) {
		this.nombre = nombre;

		if (nombre == null) {
			throw new IllegalArgumentException("El apartado \"nombre\" no puede ser null");
		} else if (nombre.isEmpty()) {
			throw new IllegalArgumentException("El apartado \"nombre\" no puede estar vacio");
		}
	}

	public void setPrecio(int precio) {
		this.precio = precio;

		if (precio <= 0) {
			throw new IllegalArgumentException("El apartado \"precio\" no puede ser negativo");
		}
	}

}
