package ejercicio1;

public class MainCancion {

	public static void main(String[] args) {

		Cancion t1 = new Cancion("", "");

		Cancion dflt = new Cancion();

		t1.setTitulo("Dancin");
		dflt.setTitulo("DFLT");

		Cancion t2 = new Cancion(t1);

		System.out.printf("%s", t2.toString());
		
		Cancion.clon(t2);
	}

}
