package EjercicioArrayList;

import java.util.Arrays;

public class Registro {

	public String curso;
	public String nombre;
	public int[] notas;

	public Registro(String curso, String nombre, int[] notas) {

		this.curso = curso;
		this.nombre = nombre;
		this.notas = notas;
	}

	/**
	 * @return the curso
	 */
	public String getCurso() {
		return curso;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the notas
	 */
	public int[] getNotas() {
		return notas;
	}

	// Devuelve la media del alumno
	public double calcularMedia() {

		double total = 0;

		for (int i = 0; i < notas.length; i++) {

			total += this.notas[i];

		}

		return total / 5;
	}

	@Override
	public String toString() {
		return "Registro [curso= " + curso + ", nombre= " + nombre + ", notas= " + Arrays.toString(notas) + "]";
	}

}
