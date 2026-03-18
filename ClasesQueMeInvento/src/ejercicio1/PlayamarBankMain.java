package ejercicio1;

import java.time.LocalDate;

public class PlayamarBankMain {

	public static void main(String[] args) {

		PlayamarBank Cuenta_1 = new PlayamarBank(1000, LocalDate.now(), -2000);

		System.out.printf("%s", Cuenta_1.toString());

		Cuenta_1.embargar(50);
		System.out.println();
		System.out.printf("%s", Cuenta_1.toString());
		System.out.println();
		PlayamarBank Cuenta_2 = new PlayamarBank(1000000, LocalDate.of(1900, 01, 02));
		System.out.printf("Num cuentas embargadas: %d, Saldo total de cuentas: %.2f. ",
				PlayamarBank.getNumCuentasEmbargadas(), PlayamarBank.getSaldoGlobal());
		Cuenta_1.ingresar(2000);
		System.out.println();
		System.out.printf("Num cuentas embargadas: %d, Saldo total de cuentas: %.2f. ",
				PlayamarBank.getNumCuentasEmbargadas(), PlayamarBank.getSaldoGlobal());
		System.out.println();
		System.out.printf("%s", Cuenta_2.toString());
		System.out.println();
		System.out.printf("%s", Cuenta_1.toString());
		System.out.println();
		System.out.println();
		try {
			Cuenta_1.transferir(Cuenta_2);
		} catch (Exception ex1) {
			System.out.printf("%s", ex1.getMessage());
		}

		System.out.println();
		System.out.printf("%s", Cuenta_2.toString());
		System.out.println();
		System.out.printf("%s", Cuenta_1.toString());
	}

}
