package cambioDeUnidades;

import java.util.Scanner;

public class CambioDeUnidades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner teclado = new Scanner(System.in);
	
	double metro;
	
	double decimetro;
	double centimetro;
	double milimetro;
	
	double pulgada;
	double yarda;
	double pie;
		

	
	
	
		System.out.print("    Mediciones Sistema Internacional"+"\n---------------------------------------"+"\n\nIntroducir distancia en METROS: " );
		metro = teclado.nextInt();
		
		decimetro = metro/10;
		centimetro = metro/100;
		milimetro = metro/1000;
		
		pulgada = metro*39.37;
		pie = metro*3.28;
		yarda = metro*1.09;
		
				
		System.out.print("\n---------------------------------------"+"\n"+metro+" metros en el sistema internacional es: " +"\n"+decimetro+"dm "+"\n"+centimetro+"cm"+"\n"+milimetro+"mm");
		System.out.print("\n---------------------------------------"+"\n"+metro+" metros en el sistema anglosajon es: " +"\n"+pulgada+" pulgadas "+"\n"+pie+" pies"+"\n"+yarda+" yardas");
		System.out.print("\n---------------------------------------");
		
	}
	

}
