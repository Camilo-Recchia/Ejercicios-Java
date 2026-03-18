package empleado;

import java.util.Scanner;

public class MainEmpleado {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		Empleado e1 = new Empleado("04321197A", "Camilo", "Villarroel Recchia");

		Empleado e2 = new Empleado("04321197A", "Alexis", "Beboteo Jonsales", 1100, (short) 0, (float) 9.6, (short) 50,
				false, (short) 5);

		e1.verEmpleado();

		System.out.println("");

		System.out.printf("%s", e2.toString());

		System.out.print("Introduza los Horas extra trabajadas: ");
		short a = teclado.nextShort();
		e1.setHorasExtra(a);
		System.out.println("");
		System.out.print("Introduza los Horas extra trabajadas: ");
		a = teclado.nextShort();
		e1.setPagoHorasExtra(a);
		System.out.println("");

		System.out.printf("El sueldo del empleado 1 va a ser de %.2f€",
				e1.getSueldo_base() + (e1.getPagoHorasExtra() * e1.getHorasExtra()));

	}

}
