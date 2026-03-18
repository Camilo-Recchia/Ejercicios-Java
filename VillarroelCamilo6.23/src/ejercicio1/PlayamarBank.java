
package ejercicio1;

import java.time.LocalDate;

/**
 * Clase que representa una cuenta bancaria del banco Playamar.
 * <p>
 * Cada cuenta dispone de un identificador único, una fecha de creación, un
 * saldo actual, información sobre embargos y límites de descubierto.
 * </p>
 * <p>
 * La clase también mantiene información global compartida por todas las
 * cuentas, como el saldo total del banco, el número de cuentas embargadas y la
 * fecha de creación más reciente.
 * </p>
 *
 * @author Camilo Villarroel Recchia
 */

/**
 * La clase también dispone de información general independiente de los objetos
 * concretos que se hayan creado. Es el caso de:
 * 
 * Saldo global entre todas las cuentas en el momento actual. Número de cuentas
 * embargadas en el momento actual. Fecha de creación de la cuenta más moderna
 * creada hasta el momento actual.
 * 
 */
public class PlayamarBank {

	/** Límite de descubierto por omisión para una cuenta: 0.0 euros. */
	public final static double DEFAULT_MAX_DESCUBIERTO = 0.0;
	/** Saldo inicial por omisión para una cuenta: 0.0 euros. */
	public final static double DEFAULT_SALDO = 0.0;
	/** Descubierto máximo permitido al crear una cuenta : -2000.0 euros. */
	public final static double MAX_DESCUBIERTO = -2000;
	/** Embargo máximo de una cuenta: 100.0 %. */
	public final static double MAX_EMBARGO = 100;
	/** Saldo máximo para una cuenta: 5.0E7 euros. */
	public final static double MIN_EMBARGO = 0;
	/** Embargo mínimo de una cuenta : 0.0%. */
	public final static double MAX_SALDO = 50000000;
	/** Año mínimo para la creación de una cuenta: 1900. */
	public final static int MIN_YEAR = 1900;
	/** Cantidad maxima de cuentas. */
	public final static int MAX_CANT_CUENTAS = 9999;

// ATRIBUTO VARIABLE DE CLASE
	private static int cantidadCuentas;
	private static double totalSaldoCuentas;
	private static LocalDate fechaModerna = LocalDate.of(1900, 01, 01);
	private static int NumCuentasEmbargadas;
	private static int contadorAnual = 0;
	private static int ultimoAnio = -1;

//	ATRIBUTPS FINALES  DE OBJETO
	private final String ID;

//	ATRIBUTOS VARIABLES DE OBJETO
	private double saldo;
	private LocalDate fechaCreacion;
	private double limiteDescubierto;
	private double porcentajeEmbargo;
	private double saldoMaximo;
	private double totalIngresado;
	private double saldoEmbargado;

	/**
	 * Construye una cuenta bancaria con saldo inicial, fecha de creación y límite
	 * de descubierto especificados.
	 *
	 * @param saldoInicial      saldo inicial de la cuenta (en euros)
	 * @param fechaCreacion     fecha de creación de la cuenta YYYY/MM/DD
	 * @param limiteDescubierto límite de descubierto permitido (MAX:-2000)
	 *
	 * @throws IllegalArgumentException si alguno de los parámetros no es válido
	 */
	public PlayamarBank(double saldoInicial, LocalDate fechaCreacion, double limiteDescubierto)
			throws IllegalArgumentException {
		if (saldoInicial < 0) {
			throw new IllegalArgumentException("El saldo inicial no puede ser menor que 0.");
		} else if (fechaCreacion.getYear() < MIN_YEAR) {
			throw new IllegalArgumentException("El año de creacion debe de ser mayor que 1900.");
		} else if (fechaCreacion.getYear() > LocalDate.now().getYear()) {
			throw new IllegalArgumentException("El año de creacion debe de ser menor que el año actual.");
		} else if (fechaCreacion.getYear() == LocalDate.now().getYear()
				&& fechaCreacion.getDayOfYear() > LocalDate.now().getDayOfYear()) {
			throw new IllegalArgumentException("La fecha de creacion no puede superar el dia actual del año.");
		} else if (limiteDescubierto < MAX_DESCUBIERTO) {
			throw new IllegalArgumentException("El limite de descubierto debe ser mayor a -2000.");
		} else if (cantidadCuentas == MAX_CANT_CUENTAS) {
			throw new IllegalArgumentException("El limite de cuentas fue alcanzado en este año.");
		}

		cantidadCuentas++;
		this.saldo = saldoInicial;
		this.fechaCreacion = fechaCreacion;
		this.limiteDescubierto = limiteDescubierto;
		this.ID = generadorID();
		this.porcentajeEmbargo = MIN_EMBARGO;
		this.saldoMaximo = saldoInicial;
		totalSaldoCuentas += saldoMaximo;
		if (fechaCreacion.isAfter(fechaModerna)) {
			fechaModerna = fechaCreacion;
		}

	}

	/**
	 * Construye una cuenta bancaria con saldo inicial y fecha de creación. El
	 * límite de descubierto será el valor por defecto.
	 *
	 * @param saldoInicial  saldo inicial de la cuenta (en euros)
	 * @param fechaCreacion fecha de creación de la cuenta YYYY/MM/DD
	 */
	public PlayamarBank(double saldoInicial, LocalDate fechaCreacion) {
		this(saldoInicial, fechaCreacion, 0);

	}

	/**
	 * Construye una cuenta bancaria con saldo inicial. La fecha de creación será la
	 * actual y el límite de descubierto el valor por defecto.
	 *
	 * @param saldoInicial saldo inicial de la cuenta (en euros)
	 */
	public PlayamarBank(double saldoInicial) {
		this(saldoInicial, LocalDate.now(), DEFAULT_MAX_DESCUBIERTO);

	}

	/**
	 * Construye una cuenta bancaria con valores por defecto: saldo 0.0 €, fecha
	 * actual y límite de descubierto por defecto.
	 */
	public PlayamarBank() {
		this(DEFAULT_SALDO, LocalDate.now(), DEFAULT_MAX_DESCUBIERTO);

	}

	private String generadorID() {
		int anioActual = fechaCreacion.getYear();

		if (anioActual != ultimoAnio) {
			contadorAnual = 0;
			ultimoAnio = anioActual;
		}

		if (contadorAnual >= MAX_CANT_CUENTAS) {
			throw new IllegalStateException("Se alcanzó el máximo de 9999 cuentas para el año " + anioActual);
		}

		String id = String.format("%d-%04d", anioActual, contadorAnual);

		contadorAnual++;

		return id;
	}

	/**
	 * @return Devuelve el ID de la cuenta.
	 */

	public String getID() {
		return ID;
	}

	/**
	 * @return Devuelve el saldo actua lde la cuenta.
	 */

	public double getSaldo() {
		return saldo;
	}

	/**
	 * @return Devuelve la fecha de creacion de la cuenta.
	 */
	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	/**
	 * @return Devuelve el Limite de descubierto.
	 */

	public double getLimiteDescubierto() {
		return limiteDescubierto;
	}

	/**
	 * @return Devuelve el porcentaje de embargo de la cuenta.
	 */

	public double getPorcentajeEmbargo() {
		return porcentajeEmbargo;
	}

	/**
	 * @return Indica si la cuenta esta descubierta (numeros negativos).
	 */

	public boolean isDescubierta() {
		return saldo < 0;
	}

	/**
	 * @return Indica si la cuenta esta embargada.
	 */

	public boolean isEmbargada() {
		return saldoEmbargado > 0;
	}

	/**
	 * @return Devuelve la cantidad de dias que lleva la cuenta activa.
	 */

	public long getDiasCuenta() {
		int dias_anio_actual = LocalDate.now().getDayOfYear() - fechaCreacion.getDayOfYear();
		int dias_anios = 0;
		for (int i = 0; i < LocalDate.now().getYear() - fechaCreacion.getYear(); i++) {
			dias_anios = dias_anios + 365;
		}
		return dias_anio_actual + dias_anios;
	}

	/**
	 * @return Devuelve el saldo maximo que haya tenido la cuenta.
	 */

	public double getSaldoMaximo() {
		return saldoMaximo;
	}

	/**
	 * @return Devuelve el total de saldo ingresado en la cuenta.
	 */

	public double getTotalIngresado() {
		return totalIngresado;
	}

	/**
	 * @return Devuelve el saldo global de todas las cuentas.
	 */

	public static double getSaldoGlobal() {
		return totalSaldoCuentas;
	}

	/**
	 * @return Devuelve la fecha de creacion de cuenta más moderna.
	 */

	public static LocalDate getFechaMasModerna() {
		return fechaModerna;
	}

	/**
	 * @return Devuelve el numero de cuentas embargadas hasta el momento.
	 */

	public static int getNumCuentasEmbargadas() {
		return NumCuentasEmbargadas;
	}

	/**
	 * Embarga la cuenta, por lo que esta no podra usar ese el porcentaje de embargo
	 * dentro de su saldo actual, y no podra tener su cuenta en numero rojos
	 * 
	 * @param porcentaje - Pocentaje a embargar en la cuenta.
	 * @throws IllegalArgumentException - Si el valor del porcentaje no esta entre 0
	 *                                  y 100.
	 * @throws IllegalStateException    - Si la cuenta ya se encontraba embargada o
	 *                                  si la cuenta esta en descubierto.
	 */
	public void embargar(double porcentaje) throws IllegalArgumentException, IllegalStateException {
		if (porcentajeEmbargo > 0) {
			throw new IllegalStateException("La cuenta ya se encontraba embargada");
		} else if (porcentaje > 100 || porcentaje < 0) {
			throw new IllegalArgumentException("Los valores de porcentaje de embargo deben estar entre 0 y 100");
		} else if (saldo < 0) {
			throw new IllegalStateException("La cuenta se encuenta en numeros rojos");
		}

		saldoEmbargado = (saldo * porcentaje) / 100;

		porcentajeEmbargo = porcentaje;

		NumCuentasEmbargadas++;

	}

	/**
	 * Desembarga la cuenta devolviendole la posibilidad de acceder a todo su saldo.
	 * 
	 * @return Devolvera un true si la cuenta estaba embargada y un false si no
	 */

	public boolean desembargar() {
		boolean desembargo;
		if (porcentajeEmbargo > 0) {
			desembargo = true;
			saldoEmbargado = 0;
			porcentajeEmbargo = 0;
			NumCuentasEmbargadas--;
		} else
			desembargo = false;
		return desembargo;
	}

	/**
	 * Ingresa dinero en la cuenta. Se permiten ingresar 0.0 €.
	 * 
	 * @param cantidad - Cantidad de dinero a ingresar
	 * @throws IllegalArgumentException - Si el saldo es menor que 0.
	 * @throws IllegalStateException    - Si el ingreso supera la capacidad maxima
	 *                                  de la cuenta.
	 */
	public void ingresar(double cantidad) throws IllegalArgumentException, IllegalStateException {
		if (cantidad < 0) {
			throw new IllegalArgumentException("El saldo a ingresar debe ser mayor o igual a 0€");
		} else if (saldo + cantidad > MAX_SALDO) {
			throw new IllegalStateException("El ingreso supera el saldo maximo de la cuenta");
		}

		if (saldo + cantidad > saldoMaximo) {
			saldoMaximo = saldo + cantidad;
		}

		totalSaldoCuentas += cantidad;
		saldo += cantidad;

	}

	/**
	 * Extrae dinero de una cuenta. No se permitira si la cantidad supera el saldo
	 * en la cuenta. Se podran retirar 0€.
	 * 
	 * @param cantidad - Cantidad de dinero a extraer
	 * @throws IllegalArgumentException - Dinero a extraer invalido.
	 * @throws IllegalStateException    - Si la cuenta no tiene dinero.
	 */

	public void extraer(double cantidad) throws IllegalArgumentException, IllegalStateException {
		if (cantidad < 0) {
			throw new IllegalArgumentException("La cantida a ingresar debe de ser mayor que 0");
		} else if (saldo - cantidad < limiteDescubierto) {
			throw new IllegalStateException("La cuenta no tiene más dinero");
		} else if (porcentajeEmbargo > 0 && cantidad > (saldo - saldoEmbargado)) {
			throw new IllegalArgumentException("Dinero en la cuenta embargado");
		}

		totalSaldoCuentas -= cantidad;
		saldo -= cantidad;
	}

	/**
	 * Transfiere determinado dinero de una cuenta a otra
	 * 
	 * @param cantidad - Cantidad de dinero a transferir
	 * @param cuenta   - Cuenta del banco
	 * @throws IllegalArgumentException - Si el dinero a transferir no es valido. Si
	 *                                  el dinero esta embargado. Si la cuenta a
	 *                                  enviar no es valida.
	 * @throws IllegalStateException    - Si a la cuenta no le queda mas dinero o si
	 *                                  la otra cuenta esta llena.
	 */

	public void transferir(double cantidad, PlayamarBank cuenta)
			throws IllegalArgumentException, IllegalStateException {
		if (cantidad < 0) {
			throw new IllegalArgumentException("La cantida a transferir debe de ser mayor que 0");
		} else if (cantidad > saldo + -limiteDescubierto) {
			throw new IllegalStateException("La cuenta no tiene más dinero");
		} else if (porcentajeEmbargo > 0 && cantidad > (saldo - saldoEmbargado)) {
			throw new IllegalArgumentException("Dinero en la cuenta embargado");
		} else if (cuenta == null) {
			throw new IllegalArgumentException("El dinero tiene que estar dirigido a una cuenta valida");
		} else if (cuenta.getSaldo() >= MAX_SALDO) {
			throw new IllegalStateException("Cantida maxima de dinero en la cuenta a transferir");
		}

		cuenta.ingresar(cantidad);
		saldo -= cantidad;

	}

	/**
	 * Transfiere todo el dinero de una cuenta a otra. si la cuenta se encuenta en
	 * descubierto solo se transferiran 0.0€ si se encientra embargada se
	 * transferira todo menos lo embargado
	 * 
	 * @param cuenta - Cuenta del banco
	 * @throws IllegalArgumentException - Si el dinero no esta dirigido a una cuenta
	 *                                  valida
	 * @throws IllegalStateException    - Si la cuenta esta embargada, solo se
	 *                                  transfiere lo no embargado. Si la cuenta a
	 *                                  enviar el dinero esta llena.
	 */
	public void transferir(PlayamarBank cuenta) throws IllegalArgumentException, IllegalStateException {
		if (saldo == limiteDescubierto) {
			transferir(0, cuenta);
		} else if (porcentajeEmbargo > 0) {
			transferir(saldo - saldoEmbargado, cuenta);
			throw new IllegalStateException("Al estar la cuenta embargada solo se transferira lo no embargado.");
		} else if (cuenta == null) {
			throw new IllegalArgumentException("El dinero tiene que estar dirigido a una cuenta valida");
		} else if (cuenta.getSaldo() >= MAX_SALDO) {
			throw new IllegalStateException("Cantidad maxima de dinero en la cuenta a transferir");
		}

		transferir(saldo, cuenta);
	}

	/**
	 * @return Devuelve una cadena que representa el estado actual de la cuenta.
	 */
	public String toString() {
		String frase = String.format("id: %s. - Saldo: %f - Embargada: %s - Saldo Embargado: %.2f", ID, saldo,
				porcentajeEmbargo > 0 ? "si" : "no", porcentajeEmbargo > 0 ? saldoEmbargado : 0);
		return frase;
	}

}