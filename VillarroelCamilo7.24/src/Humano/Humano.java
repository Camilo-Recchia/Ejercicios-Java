package Humano;

public class Humano {

	protected String nombre;
	protected String apellidos;

	// Constructor con dos parametros
	public Humano(String nombre, String apellidos) throws IllegalArgumentException {
		if (nombre.isBlank() || nombre == null) {
			throw new IllegalArgumentException("El dato de nombre es obligatorio");
		}

		if (apellidos.isBlank() || apellidos == null) {
			throw new IllegalArgumentException("El dato de apellidos es obligatorio");
		}

		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	// Constructor con 0 parametros
	public Humano() {
		this("Juan", "García");
	}

	// Devuelve el nombre
	public String getNombre() {
		return nombre;
	}

	// Establece el nombre
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// Devuelve los apellidos
	public String getApellidos() {
		return apellidos;
	}

	// Establece los apellidos
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	// Devuelve una cadena con el nombre completo
	public String toString() {
		return this.nombre + " " + this.apellidos;
	}

}
