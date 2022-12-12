package invertirSindDuplicados;

import java.util.ArrayList;
import java.util.Scanner;

public class InvertirArrayListSinDuplicados {
	public static ArrayList<Integer> invertirSinDuplicados(ArrayList<Integer> numeros) {
		ArrayList<Integer> resultado = new ArrayList<Integer>();
		for (Integer inte : numeros) {
			if (resultado.indexOf(inte) ==-1) {
				resultado.add(inte);
			}
		}
		return resultado;
	}
	
	
	
	
	
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int numero;
		do {
			System.out.println("Introduce un entero > 0// -1 para acabar.");
			numero =sc.nextInt();
			if (numero >= 0) {
				numeros.add(numero);
			}
		} while (numero>=0);
		//mostramos todos los numeros de la lista
		System.out.println("Números introducidos");
		for (Integer integer : numeros) {
			System.out.println(integer);
		}
		//invertimos 
		for (Integer integer : invertirSinDuplicados(numeros)) {
			System.out.println(integer);
		}
		//INVERSION
		ArrayList<Integer> invertida = new ArrayList<Integer>();
		invertida = invertirSinDuplicados(numeros);
		//impresion
		System.out.println("Numeros con el orden invertido y eliminación de duplicados");
		for (Integer integer : invertida) {
			System.out.println(integer);
			
		}
	}

}
