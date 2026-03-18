package anexosClases;

import java.time.LocalDate;

public class PruebaTicket {

	public static void main(String[] args) {

		Ticket T1 = new Ticket(LocalDate.of(2026, 01, 27));

		Ticket T2 = new Ticket(LocalDate.of(2026, 01, 22));

		System.out.println(T1.getID());

		System.out.println(T2.getID());

		System.out.println(T1.toString());

		T1.usar();

		System.out.println(T1.toString());

	}

}
