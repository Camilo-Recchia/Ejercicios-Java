/*
 *Descripción: Entrvista de trabajo
 *Autor: Camilo Villarroel Recchia
 *Fecha: 08/10/2025
 */
package ejercicio1;
import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String name,lastName;
		int age,salary,experienceTime,proyectos;
		
		System.out.println("    Entrevista de Trabajo\n------------------------------");
		System.out.print("Itroduzca su nombre: ");
		name = teclado.nextLine();
		System.out.print("Itroduzca sus apellidos: ");
		lastName = teclado.nextLine();
		System.out.print("Itroduzca su edad: ");
		age = teclado.nextInt();
		System.out.print("Itroduzca su salario: ");
		salary = teclado.nextInt();
		
		if(age>45 || salary>30000) {	//Diferencia segun variables
			System.out.print("------------------------------------------\nLo sentimos pero no cumple nuestro perfil\n------------------------------------------\nFin de la Entrevista");System.exit(0);
			}else {
			
				System.out.println("-----------------------------------------------------------------\nEnorabuena, usted ha alcanzado la segunda parte de la entrevista\n-----------------------------------------------------------------");
				System.out.print("Itroduzca sus años de experiencia: ");
				experienceTime = teclado.nextInt();
				System.out.print("Introduzca su Nº de proyectos trabajados: ");
				proyectos = teclado.nextInt();
			
				if(experienceTime>2 && proyectos>3)		//Diferencia segun variables
					System.out.print("-----------------------------------------------------------------\nEnhorabuena. Ha sido contratado");
				else System.out.print("Lo sentimos pero no cumple nuestro perfil");
			}
		
	}

}
