package mantenimientolistaenteros;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MantenimientoListaEnteros {
    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) throws IOException{
        int opcion=0, n=0;
        ArrayList<Integer> lista = new ArrayList<Integer>();
        //Menu principal
        boolean salida=false;
        do{
            do{
                System.out.println("\n1. Alta elemento en la lista.");
                System.out.println("2. Consulta de un elemento de la lista.");
                System.out.println("3. Modificación de un elemento de la lista.");
                System.out.println("4. Baja de un elemento de la lista.");
                System.out.println("5. Listado de todos los elementos de la lista.");
                System.out.println("0. Salida.");
                System.out.print("Opción seleccionada: ");
                opcion=sc.nextInt();
                System.out.println("");
            }while (opcion<0 || opcion>5);
            

            switch(opcion){
                case 1:
                    char repetir ='s' ;
                    do{
                        System.out.print("Introduzca un entero: "); 
                        n = sc.nextInt();
                        lista.add(n);
                        System.out.print("Desea continuar: "); 
                        repetir =(char) System.in.read(); 
                    }while (repetir=='s');
                    System.out.println("");
                    break;
                case 2:
                    do{
                        System.out.print("Posición del elemento a consultar (1 y "+ lista.size()+"): ");
                        n= sc.nextInt();
                    }while(n<1 || n> lista.size());    
                        System.out.println("El elemnto "+ n+ " tiene un valor de "+ lista.get(n-1));
                    break;
                case 3:
                    do{
                        System.out.print("Posición del elemento a modificar (1 y "+ lista.size()+"): ");
                        n= sc.nextInt();
                    }while(n<1 || n> lista.size());    
                    System.out.println("Valor actual: "+ lista.get(n-1));
                    System.out.print("Nuevo valor: ");
                    lista.set(n-1, sc.nextInt());
                    break;
                case 4:
                    do{
                        System.out.print("Posición del elemento a eliminar(1 y "+ lista.size()+"): ");
                        n= sc.nextInt();
                    }while(n<1 || n> lista.size());    
                    System.out.println("Valor actual: "+ lista.get(n-1));
                    lista.remove(n-1);
                    break;
                case 5:
                    for(Integer valor: lista){
                        System.out.print(valor + " ");
                    }
                    System.out.println("");
                    break;
                case 0:
                    salida=true;
                    break;
            }
        }while(salida==false);
    }
}
