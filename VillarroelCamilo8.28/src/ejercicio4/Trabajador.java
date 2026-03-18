package ejercicio4;

public class Trabajador {

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

	protected static String[] estados = { "Solter@", "Casad@", "Viud@" };

	protected String nombre;
	protected int edad;
	protected String sexo;
	protected String estadoCivil;
	protected double salarioBase;

	public Trabajador(String nombre, int edad, String sexo, String estadoCivil, double salarioBase) {

		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
		this.salarioBase = salarioBase;

	}

	public Trabajador() {
		this(nombres[(int) (Math.random() * 90)], (int) (Math.random() * 45) + 18, sexos[(int) (Math.random() * 2)],
				estados[(int) (Math.random() * 3)], (Math.random() * 1000) + 1200);
	}

	public String getSexo() {
		return this.sexo;
	}

	public String getEstadoCivil() {
		return this.estadoCivil;
	}

	public double getSueldo() {
		return this.salarioBase;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;

		Trabajador t = (Trabajador) obj;
		return edad == t.edad && nombre.equals(t.nombre);
	}

	@Override
	public int hashCode() {
		return nombre.hashCode() + edad;
	}

	@Override
	public String toString() {
		return String.format("|	Nombre: %s	|	Edad: %d	|	Sexo: %s	|	EstadoCivil: %s	|	Salario: %.2f",
				nombre, edad, sexo, estadoCivil, salarioBase);
	}
}
