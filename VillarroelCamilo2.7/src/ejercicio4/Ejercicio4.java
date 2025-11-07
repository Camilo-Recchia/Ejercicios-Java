/*
 *Descripción: Admición a estudios superiores 
 *Autor: Camilo Villarroel Recchia
 *Fecha: 08/10/2025
 */
package ejercicio4;
import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double notaMedia,nota1,nota2,nota3,nota4;
		
		System.out.println("-------------------------------------------------------------------------------------------------\nIntroduzca sus notas de las siguientes asignaturas: lengua, Informática, Matemáticas y Biologia.");
		System.out.print("-------------------------------------------------------------------------------------------------\nLengua: ");
		nota1 = teclado.nextDouble();
		System.out.print("Informática: ");
		nota2 = teclado.nextDouble();
		System.out.print("Matemática: ");
		nota3 = teclado.nextDouble();
		System.out.print("Biologia: ");
		nota4 = teclado.nextDouble();
		
		notaMedia = (nota1+nota2+nota3+nota4)/4;	//Calculo de nota media
		
		System.out.println("-------------------------------------------------\nTu nota media es un "+notaMedia );
		System.out.println("Tu nota media redondeada hacia ariiba es un "+Math.ceil(notaMedia)+"\nTu nota media redondeada hacia abajo es un "+Math.floor(notaMedia)+"\n-------------------------------------------------" );

		if(notaMedia>8)	//Restriccion de nota a (notaMedia mayor que 8) Todo por debajo de eso no sera admitido
			System.out.print("Felicidades, gracias a tu nota de "+notaMedia+" has sido admitido dentro de los estudios superiores.");
		else System.out.print("Lo sentimos tu nota de "+notaMedia+" no alcanza el valor requerido para que puedas entrar en los estudios superiores.");
		
	}

}
