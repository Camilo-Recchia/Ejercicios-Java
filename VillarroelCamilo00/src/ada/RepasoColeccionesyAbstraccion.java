package ada;

import java.util.*;

/**
 * Clase "todo en uno" para repasar: - Colecciones: List/Set/Map
 * (HashSet/LinkedHashSet/TreeSet, etc.) - Interfaz + clase abstracta + herencia
 * + polimorfismo - try/catch/finally + throw
 */
public class RepasoColeccionesyAbstraccion {

	// ====== INTERFAZ ======
	interface Evaluador {
		boolean aprueba(double nota);

		default String mensaje() {
			return "Evaluación estándar";
		} // default method
	}

	// ====== CLASE ABSTRACTA ======
	static abstract class Persona {
		private final String nombre;

		protected Persona(String nombre) {
			this.nombre = Objects.requireNonNull(nombre);
		}

		public String getNombre() {
			return nombre;
		}

		// método concreto
		public void presentarse() {
			System.out.println("Hola, soy " + nombre);
		}

		// método abstracto
		public abstract String rol();
	}

	// ====== CLASE CONCRETA + IMPLEMENTA INTERFAZ + COMPARABLE ======
	static class Estudiante extends Persona implements Evaluador, Comparable<Estudiante> {
		private final int legajo;
		private final double nota;

		public Estudiante(String nombre, int legajo, double nota) {
			super(nombre);
			this.legajo = legajo;
			this.nota = nota;
		}

		public int getLegajo() {
			return legajo;
		}

		public double getNota() {
			return nota;
		}

		@Override
		public String rol() {
			return "Estudiante";
		}

		@Override
		public boolean aprueba(double nota) {
			return nota >= 6.0;
		}

		// orden natural: por legajo
		@Override
		public int compareTo(Estudiante other) {
			return Integer.compare(this.legajo, other.legajo);
		}

		// Para que HashSet/HashMap funcionen bien con duplicados:
		// Acá decimos que dos estudiantes son "iguales" si tienen mismo legajo.
		@Override
		public boolean equals(Object o) {
			if (this == o)
				return true;
			if (!(o instanceof Estudiante))
				return false;
			Estudiante that = (Estudiante) o;
			return legajo == that.legajo;
		}

		@Override
		public int hashCode() {
			return Integer.hashCode(legajo);
		}

		@Override
		public String toString() {
			return "Estudiante{nombre=" + getNombre() + ", legajo=" + legajo + ", nota=" + nota + "}";
		}
	}

	public static void main(String[] args) {

		// ====== POLIMORFISMO: referencia abstracta -> objeto concreto ======
		Persona p = new Estudiante("Camilo", 100, 8.5);
		p.presentarse();
		System.out.println("Rol: " + p.rol());

		// ====== Interfaz ======
		Evaluador ev = (Evaluador) p; // porque Estudiante implementa Evaluador
		System.out.println(ev.mensaje());
		System.out.println("Aprueba con 5? " + ev.aprueba(5));
		System.out.println("Aprueba con 7? " + ev.aprueba(7));

		// ====== LISTS ======
		List<Estudiante> arrayList = new ArrayList<>();
		arrayList.add(new Estudiante("Ana", 3, 9.0));
		arrayList.add(new Estudiante("Beto", 1, 4.0));
		arrayList.add(new Estudiante("Cata", 2, 7.0));
		arrayList.add(new Estudiante("BetoDuplicadoLegajo", 1, 10.0)); // mismo legajo => equals true

		System.out.println("\nArrayList (permite repetidos):");
		for (Estudiante e : arrayList)
			System.out.println("  " + e);

		List<Estudiante> linkedList = new LinkedList<>(arrayList);
		linkedList.add(0, new Estudiante("Zoe", 99, 6.0));
		System.out.println("\nLinkedList (ejemplo):");
		linkedList.forEach(e -> System.out.println("  " + e));

		// ====== SETS ======
		Set<Estudiante> hashSet = new HashSet<>(arrayList);
		System.out.println("\nHashSet (sin duplicados por equals/hashCode; sin orden garantizado):");
		hashSet.forEach(e -> System.out.println("  " + e));

		Set<Estudiante> linkedHashSet = new LinkedHashSet<>(arrayList);
		System.out.println("\nLinkedHashSet (sin duplicados; mantiene orden de inserción):");
		linkedHashSet.forEach(e -> System.out.println("  " + e));

		Set<Estudiante> treeSetNatural = new TreeSet<>(arrayList); // usa compareTo (por legajo)
		System.out.println("\nTreeSet (orden natural: por legajo):");
		treeSetNatural.forEach(e -> System.out.println("  " + e));

		// TreeSet con Comparator (por nota, descendente)
		Set<Estudiante> treeSetPorNota = new TreeSet<>(
				Comparator.comparingDouble(Estudiante::getNota).reversed().thenComparingInt(Estudiante::getLegajo));
		treeSetPorNota.addAll(arrayList);
		System.out.println("\nTreeSet (con Comparator: por nota desc):");
		treeSetPorNota.forEach(e -> System.out.println("  " + e));

		// ====== MAPS ======
		Map<Integer, Estudiante> hashMap = new HashMap<>();
		for (Estudiante e : arrayList)
			hashMap.put(e.getLegajo(), e); // si repite clave, pisa
		System.out.println("\nHashMap (clave=legajo; sin orden garantizado):");
		hashMap.forEach((k, v) -> System.out.println("  " + k + " -> " + v));

		Map<Integer, Estudiante> linkedHashMap = new LinkedHashMap<>();
		for (Estudiante e : arrayList)
			linkedHashMap.put(e.getLegajo(), e);
		System.out.println("\nLinkedHashMap (mantiene inserción):");
		linkedHashMap.forEach((k, v) -> System.out.println("  " + k + " -> " + v));

		Map<Integer, Estudiante> treeMap = new TreeMap<>(linkedHashMap);
		System.out.println("\nTreeMap (ordenado por clave):");
		treeMap.forEach((k, v) -> System.out.println("  " + k + " -> " + v));

		// ====== TRY/CATCH/FINALLY + throw ======
		System.out.println("\nTry/Catch ejemplo (división):");
		try {
			int a = 10;
			int b = 0;
			int r = a / b; // ArithmeticException
			System.out.println("Resultado: " + r);
		} catch (ArithmeticException ex) {
			System.out.println("  Error: no se puede dividir por cero. " + ex.getClass().getSimpleName());
		} finally {
			System.out.println("  finally: esto se ejecuta siempre.");
		}

		System.out.println("\nTry/Catch ejemplo (validación manual con throw):");
		try {
			validarNota(-1); // lanza IllegalArgumentException
			System.out.println("OK");
		} catch (IllegalArgumentException ex) {
			System.out.println("  Nota inválida: " + ex.getMessage());
		}
	}

	static void validarNota(double nota) {
		if (nota < 0 || nota > 10) {
			throw new IllegalArgumentException("La nota debe estar entre 0 y 10. Recibido: " + nota);
		}
	}
}