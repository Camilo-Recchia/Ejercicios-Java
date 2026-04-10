package ada;

import java.util.Objects;

public class Alumno {

	// Enum dentro de la clase (también podría ir en su propio archivo)
	public enum Curso {
		PRIMERO, SEGUNDO, TERCERO, CUARTO
	}

	public enum Turno {
		MANANA, TARDE, NOCHE
	}

	private final String dni; // identidad (no cambia)
	private String nombre;
	private Curso curso; // atributo tipo enum
	private Turno turno; // atributo tipo enum

	public Alumno(String dni, String nombre, Curso curso, Turno turno) {
		this.dni = dni;
		this.nombre = nombre;
		this.curso = curso;
		this.turno = turno;
	}

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public Curso getCurso() {
		return curso;
	}

	public Turno getTurno() {
		return turno;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public void setTurno(Turno turno) {
		this.turno = turno;
	}

	// Identidad por DNI (para HashSet / HashMap keys)
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Alumno))
			return false;
		Alumno other = (Alumno) o;
		return Objects.equals(this.dni, other.dni);
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public String toString() {
		return "Alumno{dni='" + dni + "', nombre='" + nombre + "', curso=" + curso + ", turno=" + turno + "}";
	}
}