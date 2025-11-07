package switchs;
import java.util.Scanner;
public class Switchs {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int numeroFallos, numeroAciertos;
		double nota=0;
		
		
		System.out.print("____________________________________________\n|                                           |\n|     Calculo del Resultado de un Examen    |\n|___________________________________________|\n\n");
		
		
		
		System.out.print("Numero de acietos: ");
		numeroAciertos = teclado.nextInt();
		System.out.print("Numero de fallos: ");
		numeroFallos = teclado.nextInt();
		
		nota = (numeroAciertos*0.5)-(numeroFallos*0.25);
		
		int notaFinal = (int) Math.ceil(nota);
		
		if(numeroFallos+numeroAciertos<=20 && numeroFallos+numeroAciertos>=0) {
		
		switch (notaFinal){
			
			case 1, 2, 3, 4:
				System.out.print("Tu nota es Insuficiente");
				break; 
			
			case 5:
				System.out.print("Tu nota es Suficiente");	
				break;
			
			case 6:
				System.out.print("Tu nota esta Bien");
				break;
				
			case 7,8:
				System.out.print("Tu nota es Notable");
				break;
		
			case 9,10:
				System.out.print("Tu nota es Sobresaliente");
				break;
		}
			
		} else {System.out.print("ERROR."); System.exit(0);   }	
		
		
		System.out.print("\nTu nota en el examen es un "+nota);
		
		
		
		
		
		
		
		
		/*if(numeroFallos+numeroAciertos<=20 && numeroFallos+numeroAciertos>=0) {
		nota = (numeroAciertos*0.5)-(numeroFallos*0.25);
			if(nota<5)
			notaLetra = "Insuficiente";
			else if(nota<6)
			notaLetra = "Suficiente";
			else if(nota<7)
			notaLetra = "Bien";
			else if(nota<8)
			notaLetra = "Notable";
			else notaLetra = "Sobresaliente";
			
			
		}else {System.out.print("\nDatos Erróneos."); System.exit(0);  }
	
			*/

	
	
	
	}

	
	}


