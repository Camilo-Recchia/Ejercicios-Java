package ejercicio16;
import java.util.Scanner;
public class Ejercicio16 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double radio=0,area,volumen;
		
		System.out.print("Introduzca el readio de la esfera: ");
		radio = teclado.nextDouble();
		
		//Suponiendo que radio < 0
		area=4*3.14159265358979323846264338327950288416393989351238209749445923878*radio*radio;	
		volumen=(4/3)*3.14159265358979323846264338327950288416393989351238209749445923878*radio*radio*radio;
		
		System.out.print("El área de la esfera es "+area+" y el volumen es "+volumen);
	}

}
