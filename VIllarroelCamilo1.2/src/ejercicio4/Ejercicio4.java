/*
 *Descripción: Avisos Montaña Rusa
 *Autor: Camilo Villarroel Recchia
 *Fecha: 26/09/2025
 */
package ejercicio4;

public class Ejercicio4 {

	public enum Tamaños {
		pequeña, mediana, grande, extragrande
	}

	public static void main(String[] args) {

		Tamaños sizePequeño = Tamaños.pequeña;
		Tamaños sizeMediano = Tamaños.mediana;
		Tamaños sizeGrande = Tamaños.grande;
		Tamaños sizeExtraGrande = Tamaños.extragrande;

		System.out.println("Al tener estatura " + sizePequeño + " no puedes subirte a la montaña rusa");
		System.out.println("Al tener estatura " + sizeMediano + " si puedes subirte a la montaña rusa");
		System.out.println(
				"Al tener estatura " + sizeGrande + " puedes subirte a la montaña rusa pero sin levantar los brazos");
		System.out.println(
				"Al tener estatura " + sizeExtraGrande + " no puedes subirte a la montaña rusa por tu propio bien");
	}

}
