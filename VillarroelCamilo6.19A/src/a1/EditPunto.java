package a1;

public class EditPunto {

	public static void main(String[] args) {
		Punto p1 = new Punto(1, 5);
		Punto p2 = new Punto(5, 2);
		Punto p3 = new Punto(0, 0);

		p1.setX(15);
		p2.setY(15);

		System.out.printf(" Punto uno: ");
		p1.imprime();
		System.out.printf("Punto dos: ");
		p2.imprime();
		System.out.printf("Punto tres: ");
		p3.imprime();
		
		p3.distancia(p2);
		
		System.out.print("Punto tres desplazado:");
		p3.desplaza(10, 10);
		p3.imprime();
	}

}
