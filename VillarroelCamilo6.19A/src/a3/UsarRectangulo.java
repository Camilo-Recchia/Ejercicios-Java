package a3;

public class UsarRectangulo {

	public static void main(String[] args) {

		Rectangulo r1 = new Rectangulo(1, 1, 2, 2);
		Rectangulo r2 = new Rectangulo(2, 2, 3, 3);

		System.out.println("Coordenadas del primer Rectangulo:");
		System.out.printf("(%d,%d) (%d,%d)", r1.getx1(), r1.gety1(), r1.getx2(), r1.gety2());
		System.out.println();
		System.out.println("Coordenadas del segundo Rectangulo:");
		System.out.printf("(%d,%d) (%d,%d)", r2.getx1(), r2.gety1(), r2.getx2(), r2.gety2());
		System.out.println("\n");
		System.out.println("Areas: ");
		System.out.println((r1.getx1() + r1.getx2()) * (r1.gety1() + r1.gety2()) + "m2");
		System.out.println((r2.getx1() + r2.getx2()) * (r2.gety1() + r2.gety2()) + "m2");
		System.out.println("\nPerimetros: ");
		System.out.println(2 * (r1.getx1() + r1.getx2()) + (r1.gety1() + r1.gety2()) * 2 + "m");
		System.out.println(2 * (r2.getx1() + r2.getx2()) + (r2.gety1() + r2.gety2()) * 2 + "m");
	}

}
