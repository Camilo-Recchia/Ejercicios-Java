package ejercicio13;
import java.util.Scanner;
public class Ejercicio13 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int mb,kb;
		
		System.out.print("Introduzca la cantidad de Mb que quiere transformar: ");
		mb = teclado.nextInt();
		
		kb=mb*1000;
		
		System.out.print("\n\nEso son "+kb+" kb");
		
	}

}
