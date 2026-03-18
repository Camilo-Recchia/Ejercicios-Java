package anexosClases;

public class PruebaBombilla {

	public static void main(String[] args) {

		Bombilla B1 = new Bombilla(true);
		Bombilla B2 = new Bombilla(false);
		Bombilla B3;
		B3 = new Bombilla();

		B1.apagar();
		B2.encender();
		B3.conmutar();

		System.out.printf("%s\n\n%s\n\n%s", B1.toString(), B2.toString(), B3.toString());
		System.out.println("\n");

		try {
			B3.encender();
		} catch (IllegalArgumentException ex1) {
			System.out.println(ex1.getMessage());
			System.out.println(B3.getEstado());
		}
		
		
	}

}
