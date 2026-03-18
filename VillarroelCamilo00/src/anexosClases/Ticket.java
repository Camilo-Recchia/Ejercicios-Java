	// Obtiene Los Datos de la hora mas fria
package anexosClases;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Ticket {

	// ATRIBUTOS DE CLASE:
	// Atributos finales de clase
	public static final int MAXIMO_VALOR_IDENTIFICADOR = 99999999; // Valor maximo de identificador de tickets
	public static final boolean DEFAULT_ESTADO = false; // Estado base de los tickets "false"

	// Atributos de variable de clase
	private static int totalTickets = 0; // Cantidad total de tickets hasta la fecha

	// ATRIBUTOS DE OBJETO
	// Atributos variables de objeto
	private String identificador; // Identificador para cada ticket
	private boolean usado; // Define si un ticket esta usad
	private LocalDateTime uso; // Marca la hora del uso del ticket
	private LocalDate timepoUso; // Establece el dia para usar el ticket

	// Constructir de ticket con parametro de su dia de uso
	public Ticket(LocalDate tiempoUso) throws IllegalArgumentException {

		if (LocalDate.now().getYear() != tiempoUso.getYear() || tiempoUso == null) {
			throw new IllegalArgumentException("La fecha de uso del ticket está fuera de parámetros");
		}

		this.timepoUso = tiempoUso;
		this.usado = DEFAULT_ESTADO;

		totalTickets++; // se incrementa por cada ticket creado

		if (totalTickets > MAXIMO_VALOR_IDENTIFICADOR) {
			throw new IllegalArgumentException("Limite maximo de tickets alcanzado");
		}

		calculoIdentificador();

	}

// Constructor de Ticket sin parametros
	public Ticket() {
		this(LocalDate.now());
	}

	// Da un valor definido de identificador a cada Ticket
	private String calculoIdentificador() {
		int año = timepoUso.getYear();

		String numeroFormateado = String.format("%08d", totalTickets);

		return identificador = año + "-" + numeroFormateado;
	}

	// Devuelve el identificador del ticket
	public String getID() {
		return identificador;
	}

	// Devuelve si el ticket esta usado o no
	public boolean isUsado(boolean usado) {
		return usado;
	}

	// Devuelve si el ticket esta programado a un dia fin de semana
	public boolean isFinde(LocalDate fecha) {
		return (fecha.getDayOfWeek() == DayOfWeek.SATURDAY || fecha.getDayOfWeek() == DayOfWeek.SUNDAY);
	}

	// Establece el valor usado a true si el ticket es valido
	public void usar() {
		if (isUsado(usado) == true || LocalDateTime.now().getDayOfYear() != this.timepoUso.getDayOfYear()
				|| LocalDateTime.now().getYear() != this.timepoUso.getYear()) {
			throw new IllegalArgumentException("El ticket no esta habilitado para usarse");
		}
		this.uso = LocalDateTime.now();
		this.usado = true;

	}

	@Override
	public String toString() {
		return String.format("{ID: %s, Fecha: %02d/%02d/%04d, Usado: %s}", this.getID(), this.timepoUso.getDayOfMonth(),
				this.timepoUso.getMonthValue(), this.timepoUso.getYear(),
				usado == false ? "no" : uso.getHour() + ":" + uso.getMinute());
	}

	// Crea un nuevo Ticket para un dia random de este mes
	public static Ticket rondomEsteMes() {
		int anno = LocalDate.now().getYear();

		int mes = LocalDate.now().getMonthValue();

		int diaHoy = LocalDate.now().getDayOfMonth();

		int duracionMes = LocalDate.now().lengthOfMonth();

		int dia = (int) Math.random() * (duracionMes - diaHoy) + 1;

		LocalDate diaEsteMes = LocalDate.of(anno, mes, dia);

		Ticket ticketMes = new Ticket(diaEsteMes);
		return ticketMes;
	}

	public static Ticket random() {
		int anno = LocalDate.now().getYear();

		int diaHoy = LocalDate.now().getDayOfYear();

		int diasAnno = LocalDate.now().lengthOfYear();

		int dia = (int) Math.random() * (diasAnno - diaHoy) + 1;

		LocalDate diaEsteAnno = LocalDate.ofYearDay(anno, dia);

		Ticket ticketMes = new Ticket(diaEsteAnno);
		return ticketMes;
	}

}
