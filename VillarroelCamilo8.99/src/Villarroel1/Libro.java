package Villarroel1;

import java.time.LocalDate;

public class Libro extends Publicacion {

	// Constructor con 7 parametros es hijo del constructor de Publicacion
	public Libro(String titulo, String autor, LocalDate publicacion, double precioCompra, boolean prestado,
			Periodicidad periodicidad, String pais) throws IllegalArgumentException {
		super(titulo, autor, publicacion, precioCompra, prestado, periodicidad, pais);
	}

	// Constructor con un parametro
	public Libro(String autor) {
		this(DEFAULT_TITULO, autor, DEFAULT_FECHA, DEFAULT_PRECIO, false, DEFAULT_PERIODICIAD, DEFAULT_PAIS);
	}

	@Override
	// Devuelve una identificación adecuada con las especificaciones
	protected String generadorID() {

		return "L-" + super.generadorID();
	}

	@Override
	// Devuelve un precio adecuado segun los parametros
	public double getPrecio(int dias) throws IllegalArgumentException {

		double total;

		if (!this.prestado) {
			if (dias < 10) {
				total = precioCompra * 0.01 * dias;
			} else {
				total = (precioCompra * 0.01 * dias) - (precioCompra / 100 * dias) * 0.05;
			}
		} else {
			throw new IllegalArgumentException("Un libro no puede estar prestado para poder obtener su precio");
		}
		return total;
	}

	@Override
	// Devuelve una cadena de caracteres con la informacion del libro
	public String toString() {
		return "Libro [" + super.toString();
	}

}
