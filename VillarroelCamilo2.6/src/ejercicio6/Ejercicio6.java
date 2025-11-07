/*
 *Descripción: Ficha de Curso pero con Matrícula de Honor
 *Autor: Camilo Villarroel Recchia
 *Fecha: 06/10/2025
 */
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String name,lastname,ciclo,notaletra = "rico"; //Inicialización de variables String
		int nota; //Inicialización de variables int
		
		System.out.println("Introduzca los siguientes datos: ");
		
		System.out.print("Nombre: ");
		name = teclado.nextLine();
		
		System.out.print("Apellidos: ");
		lastname = teclado.nextLine();
		
		System.out.print("Ciclo : ");
		ciclo = teclado.nextLine();
		
		System.out.print("Nota Media: ");
		nota = teclado.nextInt();
		
		if (nota>0 && nota<=10) { 	//Calculamos la nota numerica a letras
			if(nota<0)
			notaletra = "INSUFICIENTE";
			else if (nota<6)
			notaletra = "APROBADO";
			else if (nota<7)
			notaletra = "BIEN";
			else if (nota<8)
			notaletra = "NOTABLE";
			else if (nota<9)
			notaletra = "SOBRESALIENTE";
			else notaletra = "MATRÍCULA DE HONOR";
		}else {System.out.print("La nota académica indicada es incorrecta"); System.exit(0);} 		//Si el usuario entrega un valor erroneo el programa se detiene
			
		System.out.println("\nNombre: "+name+"\nApellidos: "+lastname+"\nCiclo Formativo: "+ciclo);
		System.out.print("Nota académica: "+nota+" "+notaletra);
		
		
	}

}
