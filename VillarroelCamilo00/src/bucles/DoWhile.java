package bucles;
import java.util.Scanner;
public class DoWhile {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int contador=1,numero=0,suma=0;
		
		System.out.println("Introduzca todos los numeros que quiera para sumar, cuando no quiera mas escriba 0");
		System.out.print("Numero: ");
		numero = teclado.nextInt();
		
		suma=numero;
		
		do {	if(contador!=5) {
			
				System.out.print("Introduzca otro: ");
				numero = teclado.nextInt();
				suma = suma+numero;
				contador++;
			
			}else { numero=0; }
			
		}while(numero != 0);
	
	System.out.print("La sumas es de "+suma+". Y la cantidad de numeros es "+contador);
	
	}

}
