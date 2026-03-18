package objetos;

import java.awt.Rectangle;

public class ManipulacionObjetos {

	public static void main(String[] args){

		Rectangle r1 = new Rectangle();

		System.out.println(r1.toString());

		r1.x = 10;
	

		System.out.println(r1.toString());

		Rectangle r2 = r1;

		System.out.println(r2);

		r2.y = 5;

		System.out.println(r1);
		
		r1.setLocation(3, 12);
		
		System.out.println(r1.toString());
		
		System.out.println(r2.toString());
		double X = r1.getX();
		
		System.out.println("El valor de X es: "+X);
		
		
		
	}

}
