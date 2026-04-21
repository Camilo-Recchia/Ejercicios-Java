package EjercicioHashSet;

import java.util.Objects;

public class RegistroHS {

	private String grupo;
	private String nombre;
	private int[] notas; // [mates, lengua, fisica, quimica, ingles]

	public RegistroHS(String grupo, String nombre, int[] notas) {
		this.grupo = grupo;
		this.nombre = nombre;
		this.notas = notas;
	}

	public String getGrupo() {
		return grupo;
	}

	public String getNombre() {
		return nombre;
	}

	public int[] getNotas() {
		return notas;
	}

	@Override
	public String toString() {
		return "Grupo: " + grupo + "; Nombre: " + nombre + "; Matematicas: " + notas[0] + "; Lengua: " + notas[1]
				+ "; Fisica: " + notas[2] + "; Quimica: " + notas[3] + "; Ingles: " + notas[4] + ".";
	}

	// Para que HashSet detecte duplicados correctamente
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof RegistroHS))
			return false;
		RegistroHS that = (RegistroHS) o;

		// Consideramos "mismo registro" si coincide grupo+nombre (suele ser lo esperado
		// en estos ejercicios).
		// Si tu profesor quiere que también cuenten las notas, dime y lo cambiamos.
		return Objects.equals(grupo, that.grupo) && Objects.equals(nombre, that.nombre);
	}

	@Override
	public int hashCode() {
		return Objects.hash(grupo, nombre);
	}
}