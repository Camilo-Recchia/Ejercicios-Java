package clases;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Alumno {

	// -----------------------------------------------------------------------------------------------------------------
	// ATRIBUTOS:
	// -----------------------------------------------------------------------------------------------------------------
	// ATRIBUTOS DE CLASE:
	// -----------------------------------------------------------------------------------------------------------------

	// Atributos de clase constantes
	public final static short MINIMA_CAPACIDAD_ALUMNOS = 500; // Maxima capacidad de alumnos en el centro
	public final static byte MAXIMA_CAPACIDAD_GRUPO = 30; // Maxima capacidad de alumnos en un grupo
	public final static LocalTime MAXIMA_HORA_ALUMNOS = LocalTime.of(9, 30, 0); // Maxima hora en el edificio para los
																				// alumnos

	// Atributos de clase variables
	private static byte alumnosTotales; // Cantidad de alumnos totales

	// ATRIBUTOS DE OBJETO:
	// ------------------------------------------------------------------------------------------------

	// Atributos de objeto constante
	private final LocalTime MAXIMAHORA = LocalTime.of(9, 30, 0); // Maxima hora en el edificio para el alumno

	// Atributos de objeto variables
	private String nombre; // Nombre del alumno
	private String apellidos; // Apellidos del alumno
	private LocalDate nacimiento; // Fecha de Nacimiendo del alumno
	private String dni; // Dni del alumno
	private double peso; // Peso del alumno
	private double altura; // Altura del alumno
	private byte hermanos; // Hermanos del alumno
	private boolean mayor; // Mayor de edad. true/false

	public enum Nivelingles {
		A1, A2, B1, B2, C1, C2
	}; // Nivle de ingles del alumno

	public Alumno(String nombre, String apellidos, LocalDate nacimiento, String dni, double peso, double altura,
			byte hermanos, boolean mayor) throws IllegalArgumentException {
		// Comprobación de que los valores de los atributos son correctos
		if (nombre == null || apellidos == null || nacimiento == null || dni == null) {
			throw new IllegalArgumentException("alguno de los parametros de entrada es null");
		} else if (nombre.isEmpty() || apellidos.isEmpty() || dni.isEmpty()) {
			throw new IllegalArgumentException("alguno de los parametros de entrada esta vacio");
		} else if (!comprobadorDni(dni)) {
			throw new IllegalArgumentException("el DNI no es válido");
		} else if (peso < 5 || peso > 120 || altura > 2.5 || altura < 0) {
			throw new IllegalArgumentException("alguno de los datos biometricos es erroneo");
		} else if (hermanos < 0) {
			throw new IllegalArgumentException("el dato de " + "\"hermanos\"" + "es incorrecto");
		} else if (nacimiento.getYear() > 2026 || nacimiento.getYear() < 1950) {
			throw new IllegalArgumentException("la fecha de nacimiento es erronea");
		} else if (mayor == true && nacimiento.getYear() < 2007) {
			throw new IllegalArgumentException("la fecha de nacimiento y su edad no cuadran");
		}

		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nacimiento = nacimiento;
		this.dni = dni;
		this.peso = peso;
		this.altura = altura;
		this.hermanos = hermanos;
		this.mayor = mayor;
	}

	public static boolean comprobadorDni(String dni) {
		Pattern patron = Pattern.compile("[0-9]{8}[A-Z]");
		boolean comprobado;
		char validacionLetra = ' ';

		String posibleDni = dni;

		Matcher texto = patron.matcher(posibleDni);

		if (texto.matches()) {

			comprobado = true;
		} else {
			while (texto.matches() == false) {
				comprobado = false;
			}

		}

		String cadenaNumerosDni = posibleDni.substring(0, 8);

		char letraDni = posibleDni.charAt(8);

		String abecedario = "TRWAGMYFPDXBNJZSQVHLCKE";

		int numerosDni = Integer.valueOf(cadenaNumerosDni);

		int comprobador = (int) (numerosDni % 23);

		validacionLetra = abecedario.charAt(comprobador);

		if (validacionLetra == letraDni) {

			comprobado = true;

		} else {

			comprobado = false;
		}

		return comprobado;
	}

}
