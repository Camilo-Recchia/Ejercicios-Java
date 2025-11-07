package bucles;
import java.util.Scanner;
public class CalculadoraWhile {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int contador=1,numero,resultado=0;
		
		System.out.println("Introduzca todos los numeros que quiera sumar. Cuando este listo introduzca un cero.");
		numero = teclado.nextInt();
		
		resultado=numero;	//Igualamos el resultado a el valor del numero pedido para no perder datos.
		
		while(numero!=0) {
			System.out.print("Dame otro numero: ");
			numero = teclado.nextInt();	
			resultado = resultado+numero;
			contador++;
			
			if(contador==8) {
				numero=0;
				resultado = resultado+numero;
				}
			}
			
		
		System.out.print("El resultado de su suma es: "+resultado);
		
		
	}

}
