/*
 *Descripción: Examen de auditoria a empresas
 *Autor: Camilo Villarroel Recchia
 *Fecha: 21/11/2025
 */
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Comprobaremos si su empresa pasa el examen de auditoria.");

		System.out.print("Salario del Jefe: ");
		int salarioJefe = teclado.nextInt();
		System.out.print("Salario del Encargados: ");
		int salarioEncargados = teclado.nextInt();
		System.out.print("Salario del Oficinistas: ");
		int salarioOficinistas = teclado.nextInt();
		System.out.print("Numero de Oficinistas: ");
		int numeroOficinistas = teclado.nextInt();
		System.out.print("Tienen los proyectos terminados? ");
		boolean proyectosTerminados = teclado.nextBoolean();
		System.out.print("Presupuesto de la empresa: ");
		int presupuestoEmpresa = teclado.nextInt();

		auditoriaEmpresa(salarioJefe, salarioEncargados, salarioOficinistas, numeroOficinistas, proyectosTerminados,
				presupuestoEmpresa);
	}

	// Metodo para testear a la empresa en la auditoria // 
	
	public static boolean auditoriaEmpresa(int salarioJefe, int salarioEncargados, int salarioOficinistas,
			int numeroOficinistas, boolean proyectosTerminados, int presupuestoEmpresa) {

		boolean aprobado = false;

		if (proyectosTerminados == false) {
			aprobado = false;
			System.out.println("No ha pasado la auditoría ya que no ha terminado los proyectos acordados.");
		} else if ((salarioJefe + salarioEncargados + salarioOficinistas * numeroOficinistas) > 20000) {
			aprobado = false;
			System.out.println("No ha pasado la auditoría ya que el gasto en personal es de"
					+ (salarioJefe + salarioEncargados + salarioOficinistas * numeroOficinistas)
					+ "excede el límite mensual de 20.000 euros.");
		} else if (presupuestoEmpresa > 100000) {
			aprobado = false;
			System.out.println("No ha pasado la auditoría ya que el presupuesto asignado de" + presupuestoEmpresa
					+ "excede el límite establecido de 100.000 euros");
		} else {
			aprobado = true;
			System.out.println("Enhorabuena!! Ha pasado la auditoría, nos vemos el año que viene.");
		}

		return aprobado;
	}

}
