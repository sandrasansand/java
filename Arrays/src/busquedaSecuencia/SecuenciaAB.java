package busquedaSecuencia;

/*Programa que dado un array de caracteres (introducidos en el código) 
 * calcule cuántas veces aparece la secuencia AB.*/
public class SecuenciaAB {

	public static void main(String[] args) {
		char[] letras = { 'A', 'A', 'B', 'B', 'A', 'A', 'A', 'A', 'B', 'A', 'B' };
		int cont = 0;
		for (int i = 0; i < letras.length - 1; i++) {
			if (letras[i] == 'A' && letras[i + 1] == 'B') {
				cont++;
			}

		}
		System.out.print("La secuencia AB aparece " + cont);
		System.out.println(cont == 1 ? " vez." : " veces.");
	}

}
