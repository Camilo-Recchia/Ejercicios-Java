/*
 *Descripción: Carta a empleado
 *Autor: Camilo Villarroel Recchia
 *Fecha: 1/10/2025
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		String nombre, apellidos;
		int fechaNacimiento,añosempresa;
		double salariobruto, salarioneto, aumentosalario, salariototal;
		System.out.print("Introduzca su nombre: ");nombre = teclado.nextLine(); //Pedir nombre Usuario
		System.out.print("\nIntroduzca sus apellidos: "); apellidos = teclado.nextLine();//Pedir apellido Usuario
		System.out.print("\nIntroduzca su año de nacimento: "); fechaNacimiento = teclado.nextInt();
		System.out.print("\nIntoduzca su salario en bruto: "); salariobruto = teclado.nextInt();
		System.out.print("\nIntoduzca sus años en la empresa: "); añosempresa = teclado.nextInt();
		
		salarioneto = salariobruto - salariobruto*0.15;//Calculo del salario neto
		
		aumentosalario = salariobruto*0.02*añosempresa;//Calculo del aumento del salario con el paso de los años
		
		salariototal = (salariobruto + aumentosalario) - (salariobruto + aumentosalario)*0.15;//Calculo del salario final incluyendo el aumento y el IRPF
		
		System.out.print("\n\nEstimad@ "+nombre+ " "+ apellidos+", su salario bruto es "+salariobruto+"€, teniendo en cuenta un IRPF del 15% su salario neto es " +salarioneto+"€." );
		
		System.out.println("\nDebido a sus " + añosempresa+" años trabajando en la empresa su salario se incrementará en un 2% por cada año. \nEl aumento es de "+aumentosalario+ " y el salario total es de "+salariototal+".");
 		
		
		
	}

}
