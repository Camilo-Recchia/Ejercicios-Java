package Coche;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Coche {
	public static final short DEFAULT_CILINDRADA = 2000;
	public static final short DEFAULT_POTENCIA = 150;
	public static final short MAX_VALUE_MATRICULA = 9999;

	protected final LocalDate fechaMatriculacion;

	protected String matricula;
	protected String nombre;
	protected short cilindrada;
	protected short potencia;

	// Constructor con 5 parametros
	Coche(String matricula, String nombrePropietario, LocalDate fechaMatriculacion, short cilindrada, short potencia)
			throws IllegalArgumentException {

		if (!validarMatricula(matricula)) {
			throw new IllegalArgumentException("La matricula tiene un formato erroneo.");
		}

		if (nombrePropietario.isEmpty() || nombrePropietario == null) {
			throw new IllegalArgumentException("El atributo de nombre debe tener un valor.");
		}

		if (fechaMatriculacion.isAfter(LocalDate.now())) {
			throw new IllegalArgumentException("La fecha de matriculacion tiene que ser en un tiempo existente.");
		}

		if (cilindrada < 0) {
			throw new IllegalArgumentException("El valor de cilindrada debe ser mayor que 0.");
		}

		if (potencia < 0) {
			throw new IllegalArgumentException("El valor de potencia debe ser mayor que 0.");
		}

		this.matricula = matricula;
		this.nombre = nombrePropietario;
		this.fechaMatriculacion = fechaMatriculacion;
		this.cilindrada = cilindrada;
		this.potencia = potencia;
	}

	// Constructor con 0 parametros
	Coche() {
		this(generadorMatriculas(), "NombreEjemplo", LocalDate.now(), DEFAULT_CILINDRADA, DEFAULT_POTENCIA);
	}

	// Genera un patron de matricula confiable
	public static String generadorMatriculas() {

		String letras = "";

		for (int i = 0; i < 3; i++) {
			letras = letras + ("TRWAGMYFPDXBNJZSQVHLCKE".charAt((int) (Math.random() * 23)));
		}

		return String.format("%04d", (int) (Math.random() * MAX_VALUE_MATRICULA)) + "-" + letras;
	}

// Devuelve nombre
	public String getNombre() {
		return nombre;
	}

// Establece nombre
	public void setNombre(String nombre) throws IllegalArgumentException {
		if (nombre.isEmpty() || nombre == null) {
			throw new IllegalArgumentException("El atributo de nombre debe tener un valor.");
		}
		this.nombre = nombre;
	}

// Devuelve la cilindrada
	public short getCilindrada() {
		return cilindrada;
	}

// Establece la cilindrada
	public void setCilindrada(short cilindrada) throws IllegalArgumentException {
		if (cilindrada < 0) {
			throw new IllegalArgumentException("El valor de cilindrada debe ser mayor que 0.");
		}
		this.cilindrada = cilindrada;
	}

// Devuelve la potencia
	public short getPotencia() {
		return potencia;
	}

// Establece la potencia
	public void setPotencia(short potencia) throws IllegalArgumentException {
		if (potencia < 0) {
			throw new IllegalArgumentException("El valor de potencia debe ser mayor que 0.");
		}
		this.potencia = potencia;
	}

// Devuelve la Matricula
	public String getMatricula() {
		return matricula;
	}

// Estalbece la matricula
	public void setMatricula(String matricula) {
		if (!validarMatricula(matricula)) {
			throw new IllegalArgumentException("La matricula tiene un formato erroneo.");
		}

		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return String.format("Matricula: %s\nNombre Pro: %s\nFecha Mat: %s\nCilindrada: %d\nPotencia: %d", matricula,
				nombre, fechaMatriculacion, cilindrada, potencia);
	}

	// Devuelve la fecha de matriculacion
	public LocalDate getFechaMatriculacion() {
		return fechaMatriculacion;
	}

	// Valida el patron de la matricula entregada
	private boolean validarMatricula(String matricula) {

		Pattern patron = Pattern.compile("[0-9]{4}-[TRWAGMYFPDXBNJZSQVHLCKE]{3}");

		boolean comprobado;

		matricula = matricula.toUpperCase();

		Matcher texto = patron.matcher(matricula);

		if (texto.matches()) {
			comprobado = true;
		} else {
			comprobado = false;
		}

		return comprobado;
	}
}
