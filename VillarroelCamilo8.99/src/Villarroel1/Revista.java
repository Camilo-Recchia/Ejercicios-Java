package Villarroel1;

import java.time.LocalDate;

public class Revista extends Publicacion {

	// Constructor con 7 parametros es hijo del constructor de Publicacion
	public Revista(String titulo, String autor, LocalDate publicacion, double precioCompra, boolean prestado,
			Periodicidad periodicidad, String pais) throws IllegalArgumentException {
		super(titulo, autor, publicacion, precioCompra, prestado, periodicidad, pais);
	}

	// Constructor sin parametros
	public Revista() {
		this(DEFAULT_TITULO, DEFAULT_AUTOR, DEFAULT_FECHA, DEFAULT_PRECIO, false, DEFAULT_PERIODICIAD, DEFAULT_PAIS);
	}

	@Override
	// Devuelve una identificación adecuada con las especificaciones
	protected String generadorID() {

		return "R-" + super.generadorID();
	}

	@Override
	// Devuelve un precio adecuado segun los parametros
	public double getPrecio(int dias) throws IllegalArgumentException {
		double total;
		if (!this.prestado) {
			if (pais.equalsIgnoreCase(DEFAULT_PAIS)) {
				total = 0.5 * dias;
			} else {
				total = (0.5 * dias) + 2;
			}

		} else {
			throw new IllegalArgumentException("Un libro no puede estar prestado para poder obtener su precio");
		}

		return total;
	}

	@Override
	// Devuelve una cadena de caracteres con la informacion de la revista
	public String toString() {
		return "Revista [" + super.toString();
	}

}
