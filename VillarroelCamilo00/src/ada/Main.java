package ada;

public class Main {
	public static void main(String[] args) {

		// Crear algunos alumnos
		Alumno a1 = new Alumno("12345678A", "Camilo", Alumno.Curso.PRIMERO, Alumno.Turno.MANANA);
		Alumno a2 = new Alumno("87654321B", "Lucía", Alumno.Curso.TERCERO, Alumno.Turno.TARDE);

		// Mostrar por consola
		System.out.println(a1);
		System.out.println(a2);

		// Cambiar datos con setters
		a1.setNombre("Camilo Recchia");
		a1.setCurso(Alumno.Curso.SEGUNDO);
		a1.setTurno(Alumno.Turno.NOCHE);

		System.out.println("Después de actualizar a1:");
		System.out.println(a1);

		// Probar equals/hashCode (identidad por DNI)
		Alumno a1Copia = new Alumno("12345678A", "Otro Nombre", Alumno.Curso.CUARTO, Alumno.Turno.TARDE);

		System.out.println("a1.equals(a1Copia) = " + a1.equals(a1Copia)); // true (mismo DNI)
		System.out.println("a1.hashCode() == a1Copia.hashCode() = " + (a1.hashCode() == a1Copia.hashCode()));
	}
}