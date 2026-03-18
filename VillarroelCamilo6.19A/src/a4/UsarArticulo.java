package a4;

public class UsarArticulo {

	public static void main(String[] args) {

		Articulo remera = new Articulo("Camiseta Messi 10", 55);
		
		remera.setNombre("Remera Maradona");

		System.out.printf("%s - Precio:%d€ - IVA: %d - PVP: %.2f€", remera.getNombre(), remera.getPrecio(), remera.getIVA(),
				(float) (remera.getPrecio() + (remera.getPrecio() * remera.getIVA()) / 100));
	}

}
