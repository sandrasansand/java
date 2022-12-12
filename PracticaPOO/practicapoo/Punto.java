
public class Punto {
	private double x, y;
	private static int numPuntos;

	/* 3 constructores */
//vacio
	public Punto() {
		x = 0;
		y = 0;
		numPuntos++;
	}

//sobrecargado
	public Punto(double x, double y) {

		this.x = x;
		this.y = y;
		numPuntos++;
	}

//copia
	public Punto(Punto p) {
		this.x = p.x;
		this.y = p.y;
		numPuntos++;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public static int getNumPuntos() {
		return numPuntos;
	}

//distancia entre punto A y un punto ya instanciado
	public double distanciaA(Punto p) {
		return distancia(p, this);
	}

	/*
	 * metodo que nos de la distancia entre dos puntos static no es necesario
	 * instanciar la clase, se ejecuta distancia entre un p1 y p2 el % del vector
	 * que va de un punto a otro = raiz cuadrada
	 */
	public static double distancia(Punto p1, Punto p2) {
		return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
	}

	/*
	 * Para calcular el área de un triangulo dadas las longitudes de los tres lados,
	 * se utiliza la fórmula de Herón en la que: a, b, c son los lados del triángulo
	 * p = (a+b+c)/2 area = sqrt( p*(p-a)*(p-b)*(p-c))
	 */

	public static double AreaTriangulo(Punto p1, Punto p2, Punto p3) {
		double area = 0, lon1, lon2, lon3, p;
		lon1 = distancia(p1, p2);
		lon2 = distancia(p2, p3);
		lon3 = distancia(p3, p1);
		p = (lon1 + lon2 + lon3) / 2;
		area = Math.sqrt(p * (p - lon1) * (p - lon2) * (p - lon3));
		return area;
	}
	/*
	 * Un método estático ImprimePunto al que le pases un punto e imprima el punto
	 * en el formato (x,y) (3.0,4.0).
	 */

	public static void ImprimePunto(Punto p) {
		System.out.println("(" + p.getX() + "," + p.getY() + ")");

	}

	public String toString() {
		return "(" + x + "," + y + ")";
	}

}
