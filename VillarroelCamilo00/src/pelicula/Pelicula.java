package pelicula;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Pelicula {

	public enum Genero {
		ACCION, COMEDIA, DRAMA, SUSPENSE
	};

	// ATRIBUTOS DE CLASE:
	// Atributos finales de clase
	private static final short MAX_CANT_PELICULAS = 300;
	private static final short MAX_DURACION_PELICULAS = 180; // En minutos

	// Atributos de variable de clase
	private static short cantidad_de_peliculas = 999;
	private static int duracion_peliculas;
	private static int duracion_peliculas_suspense;

	// ATRIBUTOS DE OBJETO
	// Atributos variables de objeto
	private String codigo;
	private String nombre;
	private double calificacion;
	private short duracion;
	private LocalDate realizacion;
	private Genero genero;

	public Pelicula(String nombre, short duracion, LocalDate realizacion, double calificacion, String genero)
			throws IllegalArgumentException {
		if (nombre == null || nombre.isBlank() || nombre.isEmpty()) {
			throw new IllegalArgumentException("El nombre debe de ser una cadena.");
		} else if (duracion <= 0 || duracion > MAX_DURACION_PELICULAS) {
			throw new IllegalArgumentException("La duracion de la pelicula tiene que estar entre 0 y 180.");
		} else if (realizacion.getYear() > LocalDate.now().getYear()
				|| (realizacion.getYear() == LocalDate.now().getYear()
						&& realizacion.getDayOfYear() > LocalDate.now().getDayOfYear())) {
			throw new IllegalArgumentException("La pelicula tiene que estar ubicada en una fecha valida");
		} else if (!Genero.valueOf(genero.toUpperCase()).equals(Genero.ACCION)
				&& !Genero.valueOf(genero.toUpperCase()).equals(Genero.SUSPENSE)
				&& !Genero.valueOf(genero.toUpperCase()).equals(Genero.DRAMA)
				&& !Genero.valueOf(genero.toUpperCase()).equals(Genero.COMEDIA)) {
			throw new IllegalArgumentException("Genero tiene que ser ACCION, COMEDIA, DRAMA o SUSPENSE");
		} else if (calificacion > 10 || calificacion <= 0) {
			throw new IllegalArgumentException("La calificacion tiene que ser un valor entre 1 y 10");
		} else if (cantidad_de_peliculas == MAX_CANT_PELICULAS) {
			throw new IllegalArgumentException("Maxima cantidad de peliculas alcanzada");
		}

		this.genero = Genero.valueOf(genero.toUpperCase());
		this.nombre = nombre;
		this.codigo = InicializacionCodigo(this.genero);
		this.calificacion = calificacion;
		this.realizacion = realizacion;

		if (this.genero == Genero.SUSPENSE) {
			duracion_peliculas_suspense = duracion_peliculas_suspense + duracion;
		}

		duracion_peliculas = duracion_peliculas + duracion;

		cantidad_de_peliculas--;
		cantidad_de_peliculas--;
	}

	// Da un valor definido de identificador a cada Ticket
	private static String InicializacionCodigo(Genero genero) {
		String letras = String.valueOf(genero);

		letras.substring(0, 2);

		String codigo = letras + "-" + cantidad_de_peliculas;

		return codigo;
	}

	// GETTERS

	public double getCalificacion() {
		return calificacion;
	}

	public static int getDuracion_peliculas() {
		return duracion_peliculas;
	}

	public static int getDuracion_peliculas_suspense() {
		return duracion_peliculas_suspense;
	}

	public LocalDate getRealizacion() {
		if (realizacion.getYear() > LocalDate.now().getYear() || (realizacion.getYear() == LocalDate.now().getYear()
				&& realizacion.getDayOfYear() > LocalDate.now().getDayOfYear())) {
			throw new IllegalArgumentException("La pelicula tiene que estar ubicada en una fecha valida");
		}
		return realizacion;
	}

	// SETTERS
	public void setCalificacion(double calificacion) {
		if (calificacion > 10 || calificacion <= 0) {
			throw new IllegalArgumentException("La calificacion tiene que ser un valor entre 1 y 10");
		}
		this.calificacion = calificacion;
	}

	public Pelicula[] peliculasDeSuspenseAleatorias(int cantidad_peliculas_a_crear) {
		if (cantidad_peliculas_a_crear > (MAX_CANT_PELICULAS - cantidad_de_peliculas)) {
			throw new IllegalArgumentException("Maxima cantidad de peliculas alcanzada");
		}

		Pelicula[] peliculas = new Pelicula[cantidad_peliculas_a_crear];

		for (int i = 0; i < cantidad_peliculas_a_crear; i++) {
			peliculas[i] = new Pelicula(("Pelicula " + i), (short) 60, LocalDate.now(), 5, "SUSPENSE");
		}
		return peliculas;
	}

	public String toString() {

		String frase = String.format("Nombre: %s. Duracion: %d. Realizacion: %d/%d/%d. Calificacion:%f. Genero: %s. ",
				nombre, duracion, realizacion.getDayOfMonth(), realizacion.getMonthValue(), realizacion.getYear(),
				calificacion, genero);

		return frase;
	}

}