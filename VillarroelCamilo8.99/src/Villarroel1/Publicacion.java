package Villarroel1;

import java.time.LocalDate;

public abstract class Publicacion implements Prestamo {

	// Atributos finales de clase
	public static final int MAX_IDENTIFICACION = 999;
	public static final String DEFAULT_TITULO = "sin titulo";
	public static final String DEFAULT_AUTOR = "sin autor";
	public static final LocalDate DEFAULT_FECHA = LocalDate.of(2000, 01, 01);
	public static final double DEFAULT_PRECIO = 0;
	public static final Periodicidad DEFAULT_PERIODICIAD = Periodicidad.semanal;
	public static final String DEFAULT_PAIS = "España";

	// Enum con los tres tipos de pridiocidad
	public enum Periodicidad {
		semanal, mensual, semestral
	};

	// Atributo variable de clase
	protected static int identificadorNuerico;

	// Atributos variables de objeto
	protected String identificador;
	protected String titulo;
	protected String autor;
	protected LocalDate publicacion;
	protected double precioCompra;
	protected boolean prestado;
	protected Periodicidad periodicidad;
	protected String pais;

	// Constructor con 7 parametros
	public Publicacion(String titulo, String autor, LocalDate publicacion, double precioCompra, boolean prestado,
			Periodicidad periodicidad, String pais) throws IllegalArgumentException {

		if (publicacion.isAfter(LocalDate.now()) || publicacion.isBefore(LocalDate.of(2000, 01, 01))) {
			throw new IllegalArgumentException(
					"La fecha de publicacion debe estar entre el dia de hoy y el 01/01/2000");
		} else if (publicacion == null || publicacion.toString().isEmpty()) {
			throw new IllegalArgumentException("La fecha de publicacion no puede ser nula ni estar vacia.");
		}

		if (precioCompra < 0) {
			throw new IllegalArgumentException("El valor del precio no puede ser negativo");
		}

		this.titulo = titulo;
		this.autor = autor;
		this.publicacion = publicacion;
		this.precioCompra = precioCompra;
		this.prestado = prestado;
		this.periodicidad = periodicidad;
		this.pais = pais;
		this.identificador = generadorID();
		identificadorNuerico++;
	}

	// Genera un valor valido para el identificador siendo: "AA-XXX"
	protected String generadorID() {

		return String.format("%02d-%03d", publicacion.getYear() % 100, identificadorNuerico);
	}

	/**
	 * @param publicacion the publicacion to set
	 */
	public void setPublicacion(LocalDate publicacion) throws IllegalArgumentException {
		if (publicacion.isAfter(LocalDate.now()) || publicacion.isBefore(LocalDate.of(1950, 01, 01))) {
			throw new IllegalArgumentException(
					"La fecha de publicacion debe estar entre el dia de hoy y el 01/01/1950");
		} else if (publicacion == null || publicacion.toString().isEmpty()) {
			throw new IllegalArgumentException("La fecha de publicacion no puede ser nula ni estar vacia.");
		}
		this.publicacion = publicacion;
	}

	/**
	 * @return the publicacion
	 */
	public LocalDate getPublicacion() {
		return publicacion;
	}

	@Override
	// Devuelve una cadena de caracteres con la informacion de la publicacion
	public String toString() {
		return "identificador=" + identificador + ", titulo=" + titulo + ", autor=" + autor + ", publicacion="
				+ publicacion + ", precioCompra=" + precioCompra + ", prestado=" + prestado + ", periodicidad="
				+ periodicidad + ", pais=" + pais + "]";
	}

}
