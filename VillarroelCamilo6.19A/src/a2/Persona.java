package a2;

public class Persona {

	private String dni;
	private String nombre;
	private String apellidos;
	private byte edad;

	Persona(String nombre, String apellidos, String dni, byte edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.dni = dni;

		if (comprobarDni(this.dni) == false) {
			throw new IllegalArgumentException("Alguno de los valores en \"dni\" son erroneos");
		}

	}

	// Devuelve el dni de la persona
	public String getDNI() {
		return dni;
	}

	// Devuelve el nombre de la persona
	public String getNombre() {
		return nombre;
	}

	// Devuelve los apellidos de la persona
	public String getApellidos() {
		return apellidos;
	}

	// Devuelve la edad de la persona
	public byte getEdad() {
		return edad;

	}

	// Da un valor a el atributo DNI
	public void setDNI(String dni) {
		this.dni = dni;
	}

	// Da un valor a el atributo Nombre
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// Da un valor a el atributo apellidos
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	// Da un valor a el atributo edad
	public void setEdad(byte edad) {
		this.edad = edad;
	}

	// Imprime los valores de Persona
	public void imprime() {
		System.out.printf("Nombre: %s\nApellidos: %s\nEdad: %d\nDni: %s", nombre, apellidos, edad, dni);
		
		
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + "]";
	}

	public static boolean comprobarDni(String dni) {
		if (dni == null)
			return false;

		dni = dni.trim().toUpperCase();
		if (!dni.matches("\\d{8}[A-Z]"))
			return false;

		String numeros = dni.substring(0, 8);
		char letra = dni.charAt(8);

		String abecedario = "TRWAGMYFPDXBNJZSQVHLCKE";

		int num;
		try {
			num = Integer.parseInt(numeros);
		} catch (NumberFormatException e) {
			return false;
		}

		return abecedario.charAt(num % 23) == letra;
	}
}