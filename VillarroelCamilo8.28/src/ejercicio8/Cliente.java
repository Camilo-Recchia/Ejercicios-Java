package ejercicio8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import ejercicio2.*;

public class Cliente {

	protected static String[] nombres = { "Pepe", "Juan", "Lucas", "Mateo", "Santiago", "Valentino", "Thiago",
			"Benjamin", "Joaquin", "Tomas", "Martin", "Nicolas", "Facundo", "Franco", "Agustin", "Lautaro", "Maximo",
			"Bruno", "Dylan", "Kevin", "Axel", "Enzo", "Ezequiel", "Ramiro", "Alan", "Matias", "Emiliano", "Nahuel",
			"Rafita", "Gael", "Leandro", "Diego", "Fernando", "Gabriel", "Hernan", "Adrian", "Esteban", "Cristian",
			"Oscar", "Ricardo", "Raul", "Cesar", "Alberto", "Andres", "Pablo", "Daniel", "Eduardo", "Gonzalo", "Alexis",
			"Javier", "Karen", "Lucia", "Sofia", "Martina", "Valentina", "Camilo", "Julieta", "Paula", "Daniela",
			"Carla", "Florencia", "Rocio", "Agustina", "Micaela", "Antonella", "Milagros", "Bianca", "Ariana", "Zoe",
			"Luna", "Emma", "Olivia", "Isabella", "Mia", "Victoria", "Clara", "Elena", "Sara", "Noa", "Alma", "Carmen",
			"Laura", "Irene", "Patricia", "Silvia", "Monica", "Beatriz", "Natalia", "Veronica", "Alicia" };

	public static final int MAX_CLIENTES = 999;

	protected static int cantidadClientes = 0;

	protected int codigoCliente;
	protected String nombre;
	protected String email;
	protected ArrayList<Contacto> telefono = new ArrayList<Contacto>();
	protected HashMap<String, Integer> compras = new HashMap<String, Integer>();

	public Cliente(int codigoCliente, String nombre, String email, ArrayList<Contacto> telefono, String nombreProducto,
			int cantidadProducto) throws IllegalArgumentException {

		if (codigoCliente >= MAX_CLIENTES) {
			throw new IllegalArgumentException("Maximo de 999 clientes alcanzados.");
		}

		this.codigoCliente = codigoCliente;
		this.nombre = nombre;
		this.email = email;
		this.telefono = telefono;
		this.compras.put(nombreProducto, Integer.valueOf(cantidadProducto));
	}

	protected void addTelefono(Contacto c) {
		telefono.add(c);
	}

	protected String getTelefono(int n) {
		String tel = "";

		tel = telefono.get(n).getTelefono();

		return tel;
	}

	protected ArrayList<String> buscarTelefono(String c) {

		ArrayList<String> list = new ArrayList<String>();

		for (int i = 0; i < telefono.size(); i++) {

			if (telefono.get(i).getTelefono().substring(0, c.length()).equals(c)) {
				list.add(telefono.get(i).getTelefono());
			}
		}

		return list;
	}

	protected void addCompra(String producto, int cantidad) {

		if (!compras.containsKey(producto)) {
			compras.put(producto, cantidad);
		} else {
			cantidad += compras.get(producto);

			compras.remove(producto);
			compras.put(producto, cantidad);

		}
	}

	protected void eliminarProducto(String producto) {
		compras.remove(producto);
	}

	protected ArrayList<String> verProductos() {

		Set<String> list = compras.keySet();

		ArrayList<String> lista = new ArrayList<String>(list);

		return lista;
	}

	protected int totalUnidades() {

		int tot = 0;

		ArrayList<Integer> list = (ArrayList<Integer>) compras.values();

		for (Integer i : list) {
			tot += i.intValue();
		}

		return tot;

	}
}
