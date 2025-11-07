package entradadatos;

import java.util.Scanner;

public class PeticiónDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		byte edadAlumno;
		
		String nombreAlumno;
		
		double alturaAlumno;
		
		System.out.print("Introducir edad de alumno: ");
		edadAlumno = teclado.nextByte();
		System.out.println("La edad del alumno es: "+edadAlumno);
	
		teclado.nextLine();
		
		System.out.print("Introducir nombre y apellido del alumno: ");
		
		
		nombreAlumno = teclado.nextLine();
		
		System.out.println("El nombre entero del alumno es: "+nombreAlumno);
		
		System.out.print("Introducir altura del alumno (Con coma): ");
		alturaAlumno = teclado.nextDouble();
		
		
		System.out.println("La altura del alumno es: "+ alturaAlumno+"m");

		

	}

}
