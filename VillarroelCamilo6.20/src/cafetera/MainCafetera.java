package cafetera;

public class MainCafetera {

	public static void main(String[] args) {

		Cafetera cafe = new Cafetera();

		System.out.printf("%s", cafe.toString());
		System.out.println();
		cafe.llenarCafetera(250f);
		cafe.servirTaza(100);
		cafe.servirTaza(100);
		cafe.servirTaza(50);
		cafe.llenarCafetera(1000f);

		for (int i = 0; i < 50; i++) {
			try {
				cafe.servirTaza(50);
			} catch (Exception ex1) {
				System.out.printf("No se pudo servir el cafe nº%d, porque: %s", (i + 1), ex1.getMessage());
				System.out.println();
			}
		}
	}

}
