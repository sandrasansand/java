package invertirArray;
/*Programa que dado un array de enteros (introducidos
 *  en el código) invierta sus valores.

Vamos a invertir los valores del array 
de varias formas.*/
public class InvertirArray {

	public static void main(String[] args) {
		int[]numeros = {1,2,3,4,5,6,7,8,9,10};
		int aux;
		System.out.println("visualizando el array: ");
		visualizar(numeros);
		//1ª forma: invertir array sin array auxiliar
		for (int i = 0; i < numeros.length/2; i++) {
			aux= numeros[i];//del 1 al 5
			numeros[i] = numeros[numeros.length-1-i];//del 10 al 6 la mitad empezando por el final
			numeros[numeros.length-1-i]=aux;
		}
		System.out.println("Invirtiendo el array sin array auxiliar: ");
		visualizar(numeros);
		
		//2ª forma: Con array auxiliar para 1 variable
		int[]invertido = new int[numeros.length];
		for (int i = 0; i < numeros.length; i++) {
			invertido[i]=numeros[numeros.length-1-i];
		}
		System.out.println("Con array auxiliar para 1 variable");
		numeros=invertido;
		visualizar(numeros);
		
		//3ª forma : Con array auxiliar, para 2 variables
		invertido= new int[10];
		for (int i = 0, j=numeros.length-1; i < numeros.length; i++, j--) {
			invertido[j] = numeros[i];
		}
		System.out.println("Con array auxiliar para 1 variable");
		numeros=invertido;
		visualizar(numeros);
	}
	//visualizar array
	private static void visualizar(int[]array) {
		String cadena ="Array: ";
		for (int i = 0; i < array.length; i++) {
			cadena+= array[i] + ",";
		}
		cadena= cadena.substring(0, cadena.length()-1);
		System.out.println(cadena);
	} 
}
