package ejercicio17;

public class Ejercicio17 {

	public static void main(String[] args) {
		
        double baseImponible = 100.0,iva = 0.21,total = baseImponible + (baseImponible * iva);
        
        System.out.println("Base imponible: " + baseImponible + " €");
        System.out.println("IVA (21%): " + (baseImponible * iva) + " €");
        System.out.println("Total con IVA: " + total + " €");
	}

}
