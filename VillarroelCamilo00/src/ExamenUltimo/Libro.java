package ExamenUltimo;

import java.time.LocalDate;

public abstract class Libro {

	public static final String NOMBRE_DEFAULT = "DEFAULT";
	public static final String TITULO_DEFAULT = "DEFAULT";
	public static final LocalDate FECHA_DEFAULT = LocalDate.now();
	public static final String GENERO_DEFAULT = "cuento";
	public static final boolean DISPONIBILIDAD_DEFAULT = true;

	public static final int MAX_LIBROS = 9999;

	protected final String identificador;
	protected String titulo;
	protected String autor;
	protected LocalDate fecha;
	protected String genero;
	protected boolean disponibilidad;

	private static int contadorCuento;
	private static int contadorNovela;
	private static int contadorFiccion;

	public Libro(String titulo, String autor, LocalDate fecha, String genero, boolean disponibilidad)
			throws IllegalArgumentException {

		if (fecha.isAfter(LocalDate.now())) {
			throw new IllegalArgumentException("Los libros deben haber salido antes de la fecha actual.");
		}

		if (!genero.equalsIgnoreCase("cuento") && !genero.equalsIgnoreCase("novela")
				&& !genero.equalsIgnoreCase("ficcion")) {
			throw new IllegalArgumentException("El genero del libro debe ser cuento, novela o ficcion.");
		}

		this.titulo = titulo;
		this.autor = autor;
		this.fecha = fecha;
		this.genero = genero;
		this.disponibilidad = disponibilidad;

		if (this.genero.equalsIgnoreCase("cuento")) {
			contadorCuento++;
		} else if (this.genero.equalsIgnoreCase("novela")) {
			contadorNovela++;
		} else {
			contadorFiccion++;
		}
		this.identificador = generadorID();
	}

	protected String generadorID() {
		{

			int contador;

			if (genero == "cuento") {
				contador = contadorCuento;
			} else if (genero == "novela") {
				contador = contadorNovela;
			} else {
				contador = contadorFiccion;
			}

			return String.format("-%s-%04d", genero.substring(0, 3), contador);
		}
	}

	public void setFecha(LocalDate fecha) throws IllegalArgumentException {
		if (fecha.isAfter(LocalDate.now())) {
			throw new IllegalArgumentException("Los libros deben haber salido antes de la fecha actual.");
		}
		this.fecha = fecha;
	}

	protected abstract double calcularPrecio();

	protected int annosTranscurridos() {
		return LocalDate.now().getYear() - fecha.getYear();
	}

	@Override
	public String toString() {
		return String.format("[identificador=" + identificador + ", titulo=" + titulo + ", autor=" + autor + ", fecha="
				+ fecha + ", genero=" + genero + ", disponibilidad=" + disponibilidad + "]");
	}

}