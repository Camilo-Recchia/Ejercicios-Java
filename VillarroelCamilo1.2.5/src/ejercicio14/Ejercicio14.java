package ejercicio14;
import java.util.Scanner;
public class Ejercicio14 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double mb,kb;
		
		System.out.print("Introduzca la cantidad de kb que quiere transformar: ");
		kb = teclado.nextInt();
		
		mb=kb/1000;
		
		System.out.print("\n\nEso son "+mb+" Mb");
		
	}

}
