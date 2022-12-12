package validacionEnteros;

import java.util.Scanner;

public class ValidarEnteros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String cadena;
        int numero=0;
        boolean correcto=false;
        do{
            try {
                System.out.print("Introduzca un entero: ");
                cadena = sc.nextLine();
                numero = Enteros.pedirEntero(cadena);
                correcto=true;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }while(!correcto);
        System.out.println("número = "+ numero);
    }
}