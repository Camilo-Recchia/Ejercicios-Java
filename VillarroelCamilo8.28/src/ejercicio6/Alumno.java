package ejercicio6;

import java.time.LocalDate;

public class Alumno {

	protected int codigoAlumno;
	protected String nombre;
	protected String apellidos;
	protected String direccion;
	protected String telefono;
	protected int codigoCiclo;
	protected int cantidadCursos;
	protected LocalDate fechaIngreso;

	public Alumno(int codigoAlumno, String nombre, String apellidos, String direccion, String telefono, int codigoCiclo,
			int cantidadCursos, LocalDate fechaIngreso) {
		super();
		this.codigoAlumno = codigoAlumno;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.telefono = telefono;
		this.codigoCiclo = codigoCiclo;
		this.cantidadCursos = cantidadCursos;
		this.fechaIngreso = fechaIngreso;
	}
	
	

}
