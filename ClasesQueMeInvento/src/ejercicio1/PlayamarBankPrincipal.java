package ejercicio1;

import java.time.LocalDate;

public class PlayamarBankPrincipal {

	public static void main(String[] args) {
		
		PlayamarBank Silvina = new PlayamarBank(1000,LocalDate.now());
		PlayamarBank Camilo = new PlayamarBank();
		
		System.out.printf("%s",Silvina.toString());
		Silvina.transferir(Camilo);
		System.out.println();
		System.out.printf("%s",Silvina.toString());
		System.out.println();
		System.out.printf("%s",Camilo.toString());
		
		
		
	}

}
