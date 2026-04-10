package ada;

import java.util.TreeSet;

public class Rndom {

	public static void main(String[] args) {

		TreeSet<Integer> list = new TreeSet<Integer>();

		for (int i = 0; i < 5; i++) {
			list.add(numeroR());
		}

		System.out.println(list.toString());
	}

	public static int numeroR() {
		return java.util.concurrent.ThreadLocalRandom.current().nextInt(-50, 51);
	}
}
