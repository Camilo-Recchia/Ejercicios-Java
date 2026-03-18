package a3;

import a1.Punto;

public class Rectangulo {

	private Punto p1;
	private Punto p2;

	public Rectangulo(int x1, int y1, int x2, int y2) {
		sonMenores(x1, x2, y1, y2);
		p1 = new Punto(x1, y1);
		p2 = new Punto(x2, y2);
	}

	// Getters de las distintas coordenadas

	public int getx1() {

		int p = p1.getX();

		return p;
	}

	public int getx2() {

		int p = p1.getY();

		return p;
	}

	public int gety1() {

		int p = p2.getX();

		return p;
	}

	public Punto gety2() {

		Punto p;
		
		p = new Punto(0,p2.getY());

		return p;
	}

	// Setters de las distintas coordenadas

	public void setx1(int x1) {
		this.p1.setX(x1);
		sonMenores(p1.getX(), p2.getX(), p1.getY(), p2.getY());
	}

	public void setx2(int x2) {
		this.p2.setX(x2);
		sonMenores(p1.getX(), p2.getX(), p1.getY(), p2.getY());
	}

	public void sety1(int y1) {
		this.p1.setY(y1);
		sonMenores(p1.getX(), p2.getX(), p1.getY(), p2.getY());
	}

	public void sety2(int y2) {
		this.p2.setY(y2);
		sonMenores(p1.getX(), p2.getX(), p1.getY(), p2.getY());
	}

	private void sonMenores(int x1, int x2, int y1, int y2) {
		if (x1 > x2 || y1 > y2) {
			throw new IllegalArgumentException("Los valores x1 e y1 NO pueden exeder los valores de x2 e y2");
		}
	}
}
