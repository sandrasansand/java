package mediaNumeros;

/*Programa que, dado un array de 10 enteros 
 * (introducidos en el c�digo), 
 * calcule la media e indique cu�ntos
 *  valores est�n por encima de la media
 *  y cu�ntos por debajo.*/
public class MediaNumeros {

	public static void main(String[] args) {
		int[] numeros = { 3, 4, 7, 9, 12, 15, 17, 5, 89, 103 };
		double media;
		int suma = 0;
		int contSup = 0, contInf = 0;
		for (int i = 0; i < numeros.length; i++) {
			suma += numeros[i];
		}
		media = (double) suma / numeros.length;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] < media)
				contInf++;
			if (numeros[i] > media)
				contSup++;
		}
		System.out.println("La media es: " + media);
		System.out.println("N�mero de valores por debajo de la media: " + contInf);
		System.out.println("N�mero de valores por encima de la media: " + contSup);
		System.out.println(numeros.length);
		System.out.println(numeros.length-1);
	}
}