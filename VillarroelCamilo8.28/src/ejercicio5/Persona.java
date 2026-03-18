package ejercicio5;

public class Persona {

	protected static String[] nombres = { "Pepe", "Juan", "Lucas", "Mateo", "Santiago", "Valentino", "Thiago",
			"Benjamin", "Joaquin", "Tomas", "Martin", "Nicolas", "Facundo", "Franco", "Agustin", "Lautaro", "Maximo",
			"Bruno", "Dylan", "Kevin", "Axel", "Enzo", "Ezequiel", "Ramiro", "Alan", "Matias", "Emiliano", "Nahuel",
			"Rafita", "Gael", "Leandro", "Diego", "Fernando", "Gabriel", "Hernan", "Adrian", "Esteban", "Cristian",
			"Oscar", "Ricardo", "Raul", "Cesar", "Alberto", "Andres", "Pablo", "Daniel", "Eduardo", "Gonzalo", "Alexis",
			"Javier", "Karen", "Lucia", "Sofia", "Martina", "Valentina", "Camilo", "Julieta", "Paula", "Daniela",
			"Carla", "Florencia", "Rocio", "Agustina", "Micaela", "Antonella", "Milagros", "Bianca", "Ariana", "Zoe",
			"Luna", "Emma", "Olivia", "Isabella", "Mia", "Victoria", "Clara", "Elena", "Sara", "Noa", "Alma", "Carmen",
			"Laura", "Irene", "Patricia", "Silvia", "Monica", "Beatriz", "Natalia", "Veronica", "Alicia" };

	protected static String[] sexos = { "Masculino", "Femenino" };

	protected static String[] estados = { "Solter@", "Casad@", "Viud@", "Divorciad@" };

	protected String nombre;
	protected String sexo;
	protected String estadoCivil;
	protected int edad;

	public Persona(String nombre, String sexo, String estadoCivil, int edad) {

		this.nombre = nombre;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
		this.edad = edad;
	}

	public Persona() {
		this(nombres[(int) (Math.random() * 90)], sexos[(int) (Math.random() * 2)], estados[(int) (Math.random() * 4)],
				(int) (Math.random() * 60) + 5);
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getSexo() {
		return this.sexo;
	}

	public String getEstado() {
		return this.estadoCivil;
	}

	public int getEdad() {
		return this.edad;
	}

	@Override
	public String toString() {
		return String.format("Nombre: %s	|	Sexo: %s	|	Estado Civil: %s	|	Edad: %d", this.nombre,
				this.sexo, this.estadoCivil, this.edad);
	}

}
