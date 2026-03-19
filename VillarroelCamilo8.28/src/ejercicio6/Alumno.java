package ejercicio6;

import java.time.LocalDate;

public class Alumno {

	@Override
	public String toString() {
		return "Alumno [codigoAlumno=" + codigoAlumno + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion="
				+ direccion + ", telefono=" + telefono + ", codigoCiclo=" + codigoCiclo + ", cantidadCursos="
				+ cantidadCursos + ", fechaIngreso=" + fechaIngreso + "]";
	}

	protected static String[] nombres = { "Pepe", "Juan", "Lucas", "Mateo", "Santiago", "Valentino", "Thiago",
			"Benjamin", "Joaquin", "Tomas", "Martin", "Nicolas", "Facundo", "Franco", "Agustin", "Lautaro", "Maximo",
			"Bruno", "Dylan", "Kevin", "Axel", "Enzo", "Ezequiel", "Ramiro", "Alan", "Matias", "Emiliano", "Nahuel",
			"Rafita", "Gael", "Leandro", "Diego", "Fernando", "Gabriel", "Hernan", "Adrian", "Esteban", "Cristian",
			"Oscar", "Ricardo", "Raul", "Cesar", "Alberto", "Andres", "Pablo", "Daniel", "Eduardo", "Gonzalo", "Alexis",
			"Javier", "Karen", "Lucia", "Sofia", "Martina", "Valentina", "Camilo", "Julieta", "Paula", "Daniela",
			"Carla", "Florencia", "Rocio", "Agustina", "Micaela", "Antonella", "Milagros", "Bianca", "Ariana", "Zoe",
			"Luna", "Emma", "Olivia", "Isabella", "Mia", "Victoria", "Clara", "Elena", "Sara", "Noa", "Alma", "Carmen",
			"Laura", "Irene", "Patricia", "Silvia", "Monica", "Beatriz", "Natalia", "Veronica", "Alicia" };

	protected static String[] apellidos = { "Garcia", "Martinez", "Lopez", "Sanchez", "Perez", "Gomez", "Martin",
			"Jimenez", "Ruiz", "Hernandez", "Diaz", "Moreno", "Muñoz", "Alvarez", "Romero", "Alonso", "Gutierrez",
			"Navarro", "Torres", "Dominguez", "Vazquez", "Ramos", "Gil", "Ramirez", "Serrano", "Blanco", "Molina",
			"Morales", "Suarez", "Ortega", "Delgado", "Castro", "Ortiz", "Rubio", "Marin", "Sanz", "Iglesias", "Medina",
			"Garrido", "Cortes", "Castillo", "Santos", "Lozano", "Guerrero", "Cano", "Prieto", "Mendez", "Cruz",
			"Calvo", "Gallego", "Vidal", "Leon", "Herrera", "Marquez", "Flores", "Cabrera", "Campos", "Vega", "Fuentes",
			"Carrasco", "Diez", "Caballero", "Nieto", "Reyes", "Aguilar", "Pascual", "Ferrer", "Santiago", "Herrero",
			"Peña", "Rojas", "Hidalgo", "Montero", "Duran", "Benitez", "Arias", "Vicente", "Mora", "Valero", "Carmona",
			"Escobar", "Soler", "Parra", "Saez", "Bravo", "Paredes", "Rivas", "Gallardo", "Estevez", "Benavides" };

	public static int cantidadAlumnos = 0;

	protected int codigoAlumno;
	protected String nombre;
	protected String apellido;
	protected String direccion;
	protected String telefono;
	protected int codigoCiclo;
	protected int cantidadCursos;
	protected LocalDate fechaIngreso;

	public Alumno(String nombre, String apellido, String direccion, String telefono, int codigoCiclo,
			int cantidadCursos, LocalDate fechaIngreso) {
		super();
		this.codigoAlumno = cantidadAlumnos;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.telefono = telefono;
		this.codigoCiclo = codigoCiclo;
		this.cantidadCursos = cantidadCursos;
		this.fechaIngreso = fechaIngreso;

		cantidadAlumnos++;
	}

	public Alumno() {
		this(nombres[(int) (Math.random() * 90)], apellidos[(int) (Math.random() * 90)], "Calle real",
				String.valueOf((int) (Math.random() * 25000000) + 600000000), (int) (Math.random() * 15),
				(int) (Math.random() * 10), LocalDate.now());
		this.codigoAlumno = cantidadAlumnos;

	}

	/**
	 * @return the codigoAlumno
	 */
	public int getCodigoAlumno() {
		return codigoAlumno;
	}

	/**
	 * @return the nombres
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * @param codigoCiclo the codigoCiclo to set
	 */
	public void setCodigoCiclo(int codigoCiclo) {
		this.codigoCiclo = codigoCiclo;
	}

	/**
	 * @param cantidadCursos the cantidadCursos to set
	 */
	public void setCantidadCursos(int cantidadCursos) {
		this.cantidadCursos = cantidadCursos;
	}

}
