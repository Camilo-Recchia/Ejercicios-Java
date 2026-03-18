package pruebaExamenMañana;

import java.time.LocalDate;

public class Pelicula {

	public enum Genero {
		ACCION, COMEDIA, DRAMA, SUSPENSE
	};

	// Atributos

	// ATRIBUTOS DE CLASE
	// Atributos constantes de clase
	private final static short MAX_CANT_PELICULAS = 300;
	private final static short MAX_DURACION_PELICULAS = 180; // En minutos

	// Atributos variables de calse
	private static short cantidad_peliculas = 999;
	private static int duracion_peliculas;
	private static int duracion_peliculas_suspense;
	// ATRIBUTOS DE OBJETO
	// ATRIBUTOS DE OBJETO FINALES

	// ATRIBUTOS DE OBJETO VARIABLES
	private String codigo;
	private String nombre;
	private short duracion;
	private LocalDate realizacion;
	private double calificacion;
	private Genero genero;

	public Pelicula(String nombre, short duracion, LocalDate realizacion, double calificacion, Genero genero)
			throws IllegalArgumentException {

		if (nombre == null || nombre.isBlank() || nombre.isEmpty()) {
			throw new IllegalArgumentException("El nombre de la pelicula tiene un dato erroeno");
		} else if (duracion < 0) {
			throw new IllegalArgumentException("La duracion de la pelicula tiene que ser positiva");
		} else if (duracion > MAX_DURACION_PELICULAS) {
			throw new IllegalArgumentException("Las peliculas pueden durar 180 minutos coma maximo");
		} else if (realizacion.getYear() > LocalDate.now().getYear()
				|| (realizacion.getYear() == LocalDate.now().getYear()
						&& realizacion.getDayOfYear() > LocalDate.now().getDayOfYear())) {
			throw new IllegalArgumentException("La fecha de lanzamiento no puede tener esos valores");
		} else if (calificacion > 10 || calificacion < 0) {
			throw new IllegalArgumentException("La calificaion tiene que estan entre 0 y 10");
		} else if (cantidad_peliculas <= MAX_CANT_PELICULAS) {
			throw new IllegalArgumentException("Maxima cantidad de peliculas alcanzadas");
		}
		this.nombre = nombre;
		this.duracion = duracion;
		this.realizacion = realizacion;
		this.calificacion = calificacion;
		this.genero = genero;

		this.codigo = IncializacionCodigo(genero);

		if (genero == Genero.SUSPENSE) {
			duracion_peliculas_suspense = duracion_peliculas_suspense + duracion;
		}

		duracion_peliculas = duracion_peliculas + duracion;

		cantidad_peliculas--;
		cantidad_peliculas--;
	}

	public Pelicula() {
		this("Nombre Predeterminado", (short) 60, LocalDate.now(), 5, Genero.ACCION);
	}

	private static String IncializacionCodigo(Genero genero) {
		String letras = String.valueOf(genero);

		letras.substring(0, 2);

		String codigo = letras + "-" + cantidad_peliculas;

		return codigo;
	}

	public void setNombre(String nombre) {
		if (nombre == null || nombre.isBlank() || nombre.isEmpty()) {
			throw new IllegalArgumentException("El nombre de la pelicula tiene un dato erroeno");
		}
		this.nombre = nombre;
	}

	public void setDuracion(short duracion) {
		if (duracion < 0) {
			throw new IllegalArgumentException("La duracion de la pelicula tiene que ser positiva");
		}
		this.duracion = duracion;
	}

	public LocalDate getRealizacion() {
		return realizacion;
	}

	public void setRealizacion(LocalDate realizacion) {
		if (realizacion.getYear() > LocalDate.now().getYear() && (realizacion.getYear() == LocalDate.now().getYear()
				&& realizacion.getDayOfYear() > LocalDate.now().getDayOfYear())) {
			throw new IllegalArgumentException("La fecha de lanzamiento no puede tener esos valores");
		}
		this.realizacion = realizacion;
	}

	public double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(double calificacion) throws IllegalArgumentException {
		if (calificacion > 10 || calificacion < 0) {
			throw new IllegalArgumentException("La calificaion tiene que estan entre 0 y 10");
		}
		this.calificacion = calificacion;
	}

	public static int getDuracion_peliculas_suspense() {
		return duracion_peliculas_suspense;
	}

	public static int getDuracion_peliculas() {
		return duracion_peliculas;
	}

	

}
