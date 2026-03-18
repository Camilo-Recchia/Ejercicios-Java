/*
 *Descripción: Clase para utilizar los objetos de la calse productos
 *Autor: Camilo Villarroel Recchia
 *Fecha: 11/02/2026
 */
package productos;

import java.time.LocalDate;

public class ProductosMain {

	public static void main(String[] args) {

		Productos p = new Productos("Gomitas", LocalDate.now(), 1);

		System.out.printf("%s", p.toString());
		System.out.println();

		Productos p2 = new Productos("Chocolate", LocalDate.now(), 20);
		System.out.printf("%s", p2.toString());
		System.out.println();

		Productos p3 = new ProductosCongelados("Carne de Vaca", LocalDate.now(), 15, (short) -19, (short) 8);
		System.out.printf("%s", p3.toString());
		System.out.println();

		System.out.println();
		System.out.printf("Esta caducado el producto 1? = %b", p.isCaducado());
		System.out.println();
		
		try {
			p.setNumLote(-5);
		} catch (Exception e) {
			System.out.printf("%s", e.getMessage());
		}

	}

}
