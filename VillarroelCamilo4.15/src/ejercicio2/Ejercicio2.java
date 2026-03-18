/*
 *Descripción: Calculo de Pagos
 *Autor: Camilo Villarroel Recchia
 *Fecha: 19/11/2025
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.print("Indique cuantos productos compró: ");
		int cantidad = teclado.nextInt();
		System.out.print("Indique el precio de los productos comprados: ");
		double precio = teclado.nextDouble();
		System.out.print("Indique el descuento aplicado en la compra: ");
		double descuento = teclado.nextDouble();

		System.out
				.println("El precio total de la compra es de " + productosDescuento(precio, cantidad, descuento) + "€");
		
		teclado.close();
	}

	// Metodo para calcular el valor total de una compra //
	
	public static double productosDescuento(double precio, int cantidad, double descuento) {
		System.out.println(precio + " " + cantidad + " " + descuento);
		double total;
		total = (cantidad * precio) - ((cantidad * precio) * (descuento / 100));
		return total;
	}

}
