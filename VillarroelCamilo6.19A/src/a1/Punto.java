package a1;

public class Punto {

	protected int x; // Coordenada X
	protected int y; // Coordenada Y

	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// Devuelve el valor x de un punto
	public int getX() {
		return x;
	}

	// Devuelve el valor y de un punto
	public int getY() {
		return y;
	}

	// Modifica el valor x de un punto
	public void setX(int x) {
		this.x = x;
	}

	// Modifica el valor y de un punto
	public void setY(int y) {
		this.y = y;
	}

	// Imprime por pantalla las coordenadas de un punto.
	public void imprime() {
		System.out.printf("(%d,%d)", x, y);
	}

	// Modifica ambas coordenadas de un punto
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// Desplaza a un punto en unas coordenadas
	public void desplaza(int dx, int dy) {
		this.x = x + dx;
		this.y = y + dy;
	}

	// Calcula la distancia entre los dos puntos
	public void distancia(Punto p) {
		System.out.printf("%dm",
				Math.sqrt((Math.pow(p.getX(), 2) - Math.pow(x, 2) + Math.pow(p.getY(), 2) - Math.pow(y, 2))));
	}
	
	
}
