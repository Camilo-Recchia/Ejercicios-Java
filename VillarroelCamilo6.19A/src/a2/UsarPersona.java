package a2;

public class UsarPersona {

	public static void main(String[] args) {

		Persona p1 = new Persona("Camilo", "Villaruel Rechia", "04321197A", (byte) 18);
		Persona p2 = new Persona("Alexis", "Beboteo Gonzales", "04321176M", (byte) 21);

		p1.setApellidos("Villarroel Recchia");
		p2.setApellidos("Balboteo Gonzalez");
		
		p1.imprime();
		System.out.println();
		p2.imprime();
		
		System.out.printf("%s",p2.toString());
	}

	public static String mayor(byte edad) {

		if (edad >= 18) {
			return "es";
		} else
			return "no es";
	}

}
