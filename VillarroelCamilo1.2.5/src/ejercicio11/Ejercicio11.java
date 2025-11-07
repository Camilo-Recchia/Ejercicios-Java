package ejercicio11;
import java.util.Scanner;
public class Ejercicio11 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
        System.out.print("Introduce la base imponible: ");
        double base = teclado.nextDouble();
        
        double iva = 0.21;
        double total = base + (base * iva);
        
        System.out.println("El total de la factura con IVA es: " + total + " €");
	}

}
