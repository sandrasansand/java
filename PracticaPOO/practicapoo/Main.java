

public class Main {

	public static void main(String[] args) {
		// punto1
		Punto p1 = new Punto();
		p1.setX(3);
		p1.setY(4);
		System.out.println("(" + p1.getX() + "," + p1.getY() + ")");

		// punto2
		Punto p2 = new Punto(7, 4);
		Punto.ImprimePunto(p2);

//		 Creas un punto p3 partiendo del constructor copia pasándole los valores
//		 de p1 y posteriormente lo modificas a (3,7) y lo imprimes con toString.
		Punto p3 = new Punto(p1);
		p3.setX(3);
		p3.setY(7);
		System.out.println(p3.toString());
//		Calcula e imprime la distancia entre los puntos p1 y p2.

		System.out.print("La Distancia en los puntos p1 : (" + p1.getX() + "," + p1.getY() + ")" + " y p2 (" + p2.getX()
				+ "," + p2.getY() + ")");
		System.out.println(" vale " + Punto.distancia(p1, p2));
		System.out.println("");

//        Crea tres puntos p4, p5 y p6 con distintos constructores vacío e

		Punto p4 = new Punto();
		Punto p5 = new Punto();
		Punto p6 = new Punto();
//      introduce sus valores por teclado.		
		p4.setX(3);
		p4.setY(4);
		p5.setX(7);
		p5.setY(4);
		p6.setX(3);
		p6.setY(7);

		System.out.println("Primer punto X:" + p4.getX());
		System.out.println("Primer punto Y:" + p4.getY());
		System.out.println();
		System.out.println("Segundo punto X:" + p5.getX());
		System.out.println("Segundo punto Y:" + p6.getY());
		System.out.println();
		System.out.println("Tercer punto X:" + p4.getX());
		System.out.println("Tercer punto Y:" + p6.getY());
		System.out.println();
		System.out.print("El área del triángulo de los puntos:(" + p4.getX() + "," + p4.getY() + ")" + "(" + p5.getX()
				+ "," + p5.getY() + ")" + "(" + p6.getX() + "," + p6.getY() + ") vale ");
		System.out.println(Punto.AreaTriangulo(p4, p5, p6));
		System.out.print("El numero de puntos que tenemos es:");
		System.out.println(Punto.getNumPuntos());

	}

}
