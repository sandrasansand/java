import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*grabar los objs profesores de la coleccion arrayList como 
 * fichero serializable las variables globales un un fichero indep*/
public class Principal {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Profesor> lista = new ArrayList<Profesor>();

	public static void main(String[] args) throws FileNotFoundException, IOException {
		double importe = 0;
		String curso;
		double pagoPorHoraExtra;// atr de clase static
		String dni;
		String nombre;
		double sueldoBase;
		int[] horasExtras = new int[12];
		double tipoIRPF;

		// creamosy abrimos un fichero de objetos profesores3.dat
		File fichero = new File("c:/ficheros/profesores4.dat");

		// fichero con las variables globales en una linea
		File globales = new File("c:/ficheros/globales4.txt");
		// manejo de las variables globales
		if (!globales.exists() || globales.length() == 0) {
			// pedir el atrb estatico de curso
			System.out.println("Curso: ");
			curso = sc.nextLine();
			Profesor.setCurso(curso);
			System.out.println("Importe por horas extras : ");
			importe = sc.nextDouble();
			Profesor.setPagoPorHoraExtra(importe);
			System.out.println();
			// funciones
			Funciones.grabarGlobales(globales);
		} else {
			Funciones.leerGlobales(globales);
			// lectura de objetos
			if (fichero.exists() && fichero.length() > 0) {
				lista = Funciones.leerArrayListDearchivoDeObjetos(fichero);
			}
			// menu con las distintas opciones
			boolean salir = false;
			int opcion = 0;
			do {
				for (int i = 0; i < 3; i++) {
					System.out.println();
					System.out.println("SELECIONE UNA OPCIÓN: ");
					System.out.println();
					System.out.println("1. ALTA DE UN PROFESOR");
					System.out.println("2. BAJA DE UN PROFESOR");
					System.out.println("3. CONSULTA DE DATOS PERSONALES DE 1 PROFESOR");
					System.out.println("*******************************************");
					System.out.println();
					System.out.println(" 4. INTRODUCIR HORAS EXTRAORDINARIAS DE UN MES");
					System.out.println();
					System.out.println(" 5. LISTADO DE PROFESORES");
					System.out.println();
					System.out.println(" 6. LISTADO DE NOMINAS DE UN MES");
					System.out.println();
					System.out.println(" 7. LISTADO XML DE PROFESORES");
					System.out.println();
					System.out.println(" 8. LISTADO XML Lectura DE PROFESORES");
					System.out.println();
					System.out.println(" 0. SALIR DEL PROGRAMA");
					System.out.println();
					System.out.println();
					System.out.print("OPCION SELECCIONADA : ");
					opcion = sc.nextInt();
					System.out.println();
					
					switch (opcion) {
					case 1: // alta
						Profesor p = new Profesor();
						p.nuevoProfesor();
						lista.add(p);
						break;
					case 2: // baja
						do {// quita 1 obj de la lista
							System.out.println("Número del profesor a eliminar: ");
							i = sc.nextInt();
						} while (i < 0 || i > lista.size());
						lista.remove(i - 1);
						break;
					case 3:// consulta lista
						do {// llamada al método de la clase
							System.out.println("número del profesor: ");
							i = sc.nextInt();

						} while (i < 1 || i > lista.size());
						i = i - 1; // correccion del index
						System.out.println(lista.get(i).imprimeProfesor());

						break;
					case 4: // introducir las horas extras de 1 mes . Introducimos
							// 1 mes y luego recorremos la lista de prof colocando sus horas en su mes
						int mes;
						do {
							System.out.println("Horas extraordinarias correspondientes al mes : ");
							mes = sc.nextInt();
						} while (mes < 1 || mes > 12);
						// corregimos el indice del mes
						mes = mes - 1;
						for (i = 0; i < lista.size(); i++) {
							int horas;
							System.out.println("Nombre del profesor: ");
							System.out.println(lista.get(i).getNombre());
							System.out.println("Horas realizadas: ");
							horas = sc.nextInt();
							lista.get(i).setHorasExtras(mes, horas);
							System.out.println();
						}

						break;
					case 5: // listado de datos de todos los profesores
						for (i = 0; i < lista.size(); i++) {
							System.out.println("Número del profesor: " + i + 1);
							System.out.println(lista.get(i).imprimeProfesor());
							System.out.println();
						}

						break;
					case 6:// listado nóminas de 1 mes
						do {
							System.out.println("Introduce num de mes: ");
							mes = sc.nextInt();
						} while (mes < 1 || mes > 12);
						System.out.println();
						mes = mes - 1;// indice corrección
						for (i = 0; i < lista.size(); i++) {
							System.out.println("Numero profesor" + i + 1);
							System.out.println(lista.get(i).imprimirNominas(mes));

						}
						break;
					default:
						Funciones.grabarArrayListEnArchivoComoObjetos(lista, fichero);
						salir = true;
					}
					
				}

			} while (salir == false);
		}

	}

}
