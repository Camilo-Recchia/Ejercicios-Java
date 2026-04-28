package ejercicio2;

import java.time.LocalDate;
import java.util.Objects;

public class Alumno {

	protected static String[] nombres = { "Pepe", "Juan", "Lucas", "Mateo", "Santiago", "Valentino", "Thiago",
			"Benjamin", "Joaquin", "Tomas", "Martin", "Nicolas", "Facundo", "Franco", "Agustin", "Lautaro", "Maximo",
			"Bruno", "Dylan", "Kevin", "Axel", "Enzo", "Ezequiel", "Ramiro", "Alan", "Matias", "Emiliano", "Nahuel",
			"Rafita", "Gael", "Leandro", "Diego", "Fernando", "Gabriel", "Hernan", "Adrian", "Esteban", "Cristian",
			"Oscar", "Ricardo", "Raul", "Cesar", "Alberto", "Andres", "Pablo", "Daniel", "Eduardo", "Gonzalo", "Alexis",
			"Javier", "Karen", "Lucia", "Sofia", "Martina", "Valentina", "Camilo", "Julieta", "Paula", "Daniela",
			"Carla", "Florencia", "Rocio", "Agustina", "Micaela", "Antonella", "Milagros", "Bianca", "Ariana", "Zoe",
			"Luna", "Emma", "Olivia", "Isabella", "Mia", "Victoria", "Clara", "Elena", "Sara", "Noa", "Alma", "Carmen",
			"Laura", "Irene", "Patricia", "Silvia", "Monica", "Beatriz", "Natalia", "Veronica", "Alicia" };

	protected String nombre;
	protected String telefono;
	protected String email;
	protected LocalDate fechaNacimiento;

	public Alumno(String nombre, String telefono, String email, LocalDate fechaNacimiento) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.email = email;
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	public Alumno() {
		this(nombres[(int) (Math.random() * 90)], String.valueOf((int) (Math.random() * 25000000) + 600000000),
				nombres[(int) (Math.random() * 90)] + "@gmail.com", LocalDate.of((int) (Math.random() * 26) + 2000,
						(int) (Math.random() * 11 + 1), (int) (Math.random() * 30 + 1)));
	}

	@Override
	public int hashCode() {
		return Objects.hash(telefono);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(telefono, other.telefono);
	}

	@Override
	public String toString() {
		return String.format("|	Nombre: %s	|	Telefono: %s	|	Email: %s	|	Nacimiento: %s	|", nombre,
				telefono, email, fechaNacimiento);
	}

	public String getNombre() {
		return nombre;
	}

	public LocalDate getNacimiento() {
		return fechaNacimiento;
	}
}
