package profesores02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
//transformar esta practica con arrayList<Profesor> listas dinámicas..
//lista estatica de profesores
public class Principal {

	public static void main(String[] args) {

		Profesor[] lista = new Profesor[4];
		lista[0] = new Profesor("Juan", "11111111H", 1100.0, 10.0);
		lista[1] = new Profesor("Ana", "11111111J", 1700.0, 12.0);
		lista[2] = new Profesor("Carlos", "11111111P", 1400.0, 10.0);
		lista[3] = new Profesor("Matias", "11111111X", 1100.0, 10.0);


		ArrayList<Profesor> profesores = new ArrayList<Profesor>();
		Profesor p1 = new Profesor("11111111H", "Juan", 1100.0, 10.0);
		Profesor p2 = new Profesor("11111111A", "Ana", 1100.0, 10.0);
		p1.add(p1);
		p2.add(p2);
		profesores.add(p1);
		profesores.add(p2);
		System.out.println(p2);
		System.out.println("*******************************");
		for (Profesor profesor : lista) { //lista estatica
			System.out.println(profesor);
		}
		System.out.println("*******************************");
		for (Profesor profesor : profesores) { //arrayList
			System.out.println(profesor);
		}
		System.out.println("********************************");
		Profesor p3 = new Profesor("11111111P", "Tobías", 1100.0, 10.0);
		System.out.println("********************************");
		System.out.println(p3.toString());
		System.out.println("********************************");
		System.out.println(p3.imprimeProfesor2(p3));
		System.out.println("********************************");
		System.out.println("********************************");
		System.out.println(p1.compareTo(p3));//repasar aquello de compareTo arqjava p1 mayor q p2
		System.out.println("*********************************");
		//p1.leerProfesores();
		System.out.println(p1);
		System.out.println("**********************************");
		System.out.println("**********************************");
		System.out.println("**********************************");
		
		// desarrollo app main pedir por teclado curso y precio horas Extras
		Scanner sc = new Scanner(System.in);

		System.out.println("Curso actual :");
		Profesor.setCurso(sc.nextLine());
		System.out.println("Precio horas extraordinarias :");
		Profesor.setPagoPorHoraExtra(sc.nextDouble());
		// MENU
		int opcion = 0;
		do {
			System.out.println("Seleccione un opción: ");
			System.out.println("1) Alta de un profesor: ");
			System.out.println("2) Baja de un profesor: ");
			System.out.println("3) Consulta de datos personales de 1 profesor: ");
			System.out.println("4) Introducir horas extras de 1 mes: ");
			System.out.println("5) Listado de profesores: ");
			System.out.println("6) Listado de nóminas de un mes: ");
			System.out.println("7) Ordenación algoritmo BURBUJA: ");
			System.out.println("8) Ordenación SORT por nombre: ");
			System.out.println("9) Ordenación por SELECCIÓN: ");
			System.out.println("10) Ordenación COMPARE TO por dni: ");
			System.out.println("0) OPCIÓN SALIR: ");
			System.out.println(" Selecciona una OPCIÓN :");
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:// ad 1 Prof al array profesores a lo arcaico
				Profesor p = new Profesor();
				p.leerProfesores();
				lista = altaProfesor(lista, p);
				break;
			case 2:// baja profesor utilizando el índice del array quitamos 1
				int indice;
				do {
					System.out.println("Intoduce el profesor a eliminar Del 1 al " + lista.length + " :");
					indice = sc.nextInt();
					lista = bajaProfesor(lista, indice - 1);
				} while (indice < 1 || indice > lista.length);
				break;

			case 3:// Consulta los datos personales de un profesor introduciendo por teclado el
					// índice. Utiliza el método ImprimeProfesor() de la clase Profesor.
				indice = 0;
				do {
					System.out.println("Intoduce el profesor a listar Del 1 al " + lista.length + " :");
					indice = sc.nextInt();

				} while (indice < 1 || indice > lista.length);
				System.out.println(lista[indice - 1].ImprimeProfesor());
				break;
			case 4:// Permite introducir las horas extras realizadas por un profesor en un mes.
				int mes = 1, horas = 0;
				do {
					System.out.println("Introduce num de mes para calcular las Horas extras: ");
					mes = sc.nextInt();

				} while (mes < 1 || mes > 12);
				mes--; // hacer coincidir el mes con el inidice
				for (Profesor profesor : lista) {
					System.out.println("");
					System.out.println("Nombre del profesor " + profesor.getNombre());
					System.out.print("Número de Horas realizadas");
					horas = sc.nextInt();
					profesor.setHorasExtra(mes, horas);

				}
				break;

			case 5:// listar los datos personales de todos los profesores.
				for (Profesor profesor : lista) {
					System.out.println(profesor.ImprimeProfesor());
				}
				break;
			case 6:// permite el listado de todas las nóminas de un mes seleccionado.
				int mes2 = 1;
				do {
					System.out.println("Número de mes: ");
					mes2 = sc.nextInt();
				} while (mes2 < 1 || mes2 > 12);
				System.out.println();
				mes2--;
				for (int i = 0; i < lista.length; i++) {
					System.out.println("Numero de profesor " + (i + 1));
					System.out.println(lista[i].imprimirNominas(mes2));
				}
				break;
			case 7:// algoritmo burbuja por nombre
				burbuja(lista);
				for (Profesor profesor : lista) {
					System.out.println(profesor.getNombre());
				}
				break;
			case 8:
				Arrays.sort(lista);// compareTo por dni recibe un array y simplemente lo ordena teniendo en cuenta
									// las condiciones que le hayamos dicho dentro del método compareTo:

				for (Profesor profesor : lista) {
					System.out.println(profesor);
				}
				break;
			case 9:
				seleccion(lista);// Se busca el elemento más pequeño del array y se coloca en la primeraposición.
				for (Profesor profesor : lista) {
					System.out.println(profesor);
				}
				break;
			case 10:
				insercionDirecta(lista);// Dada una posición actual p, el algoritmo se basa en que los elementos A[0],
										// A[1],..., A[p-1] ya están ordenados.
				for (Profesor profesor : lista) {
					System.out.println(profesor);
				}
				break;
			}
		} while (opcion != 0);

	}

	/*
	 * . Recordad que para añadir un objeto a la lista se ha de crear una nueva
	 * lista en este método con un elemento mas, copiar los objetos de la existente
	 * y añadirle el nuevo objeto Profesor. El método devuelve la referencia a la
	 * nueva lista creada.
	 */

	public static Profesor[] altaProfesor(Profesor[] lista, Profesor p) {
		Profesor[] listaNueva = new Profesor[lista.length + 1];// lista con 1 elm más
		for (int i = 0; i < lista.length; i++) {
			listaNueva[i] = lista[i]; // copiamos de una a otra

		}
		listaNueva[lista.length] = p;// añade el nuevo Profesor al final de la lista
		return listaNueva;
	}

	public static Profesor[] bajaProfesor(Profesor[] lista, int n) {
		Profesor[] listaNueva = new Profesor[lista.length - 1];// lista con 1 elm más
		for (int i = 0; i < lista.length; i++) {
			if (i < n) {
				listaNueva[i] = lista[i];
			} else if (i > n) {
				listaNueva[i - 1] = lista[i];// quitamos un elem el seleccionado
			}
			return listaNueva;

		}

		return listaNueva;
	}

	/*
	 * Consiste en comparar pares de elementos adyacentes en un array y si están
	 * desordenanos intercambiarlos hasta que estén todos ordenados.
	 */

	public static void burbuja(Profesor[] lista) {
		Profesor auxiliar;
		// es una referencia a un vector de enteros que no le decimos cuantos elementos
		// tiene porque no usamos numerosOrdenado[i]
		for (int i = 0; i < lista.length - 1; i++) // número de pasadas
		{
			for (int j = 0; j < lista.length - 1 - i; j++) // cada pasada lee uno menos
			{
				if ((lista[j].getNombre()).compareTo(lista[j + 1].getNombre()) > 0) {
					auxiliar = lista[j];
					lista[j] = lista[j + 1];
					lista[j + 1] = auxiliar;
				}
			}
		}
	}

	/*
	 * Se busca el elemento más pequeño del array y se coloca en la primera posición
	 * entre los elem restantes la misma operación
	 */
	public static void seleccion(Profesor[] lista) {
		int i, j, pos;
		Profesor tmp;
		Profesor menor;
		for (i = 0; i < lista.length - 1; i++) { // tomamos como menor el primero
			menor = lista[i]; // de los elementos que quedan por ordenar
			pos = i; // y guardamos su posición
			for (j = i + 1; j < lista.length; j++) { // buscamos en el resto
				if ((lista[j].getNombre()).compareTo(lista[i].getNombre()) > 0) { // del array algún elemento
					menor = lista[j]; // menor que el actual
					pos = j;
				}
			}
			if (pos != i) { // si hay alguno menor se intercambia
				tmp = lista[i];
				lista[i] = lista[pos];
				lista[pos] = tmp;
			}
		}
	}

	public static void insercionDirecta(Profesor[] lista) {
		int p, j;
		Profesor aux;
		for (p = 1; p < lista.length; p++) { // desde el segundo elemento hasta
			aux = lista[p]; // el final, guardamos el elemento y
			j = p - 1; // empezamos a comprobar con el anterior
			while ((j >= 0) && ((lista[j].getNombre()).compareTo(lista[p].getNombre()) > 0)) {// mientras queden
																								// posiciones y el
				// valor de aux sea menor que los
				lista[j + 1] = lista[j];
				// de la izquierda, se desplaza a
				j--;
				// la derecha
			}
			lista[j + 1] = aux; // colocamos aux en su sitio
		}
	}

}
