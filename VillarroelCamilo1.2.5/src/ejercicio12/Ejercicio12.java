package ejercicio12;
import java.util.Scanner;
public class Ejercicio12 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int horas,salario,dias;
		
		System.out.print("Introduzca sus horas trabajadas por día: ");
		horas = teclado.nextInt();
		System.out.print("Introduzca cuantos dias trabaja por semana: ");
		dias = teclado.nextInt();
		
		salario = horas*dias*12;
		
		System.out.print("Su salario semanal es de "+salario+"€");
	}

}
