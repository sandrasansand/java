package mantenimientolistaenteros;

import java.io.IOException;
import java.util.Scanner;

public class MantenimientoListaEnteros {
    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int opcion=0;
        int []tabla = new int [0];//tabla de enteros con 0 elementos
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
                        tabla=altaElemento(tabla); //le pasamos la direccion de memoria del array de enteros tabla q inicialmente tendra 0 elem pero se le irán añadiendo
                        System.out.print("Desea continuar: "); 
                        repetir =( char ) System.in.read(); 
                    }while (repetir=='s');
                    System.out.println("");
                    break;
                case 2:
                    consultaElemento(tabla);
                    break;
                case 3:
                    modificaElemento(tabla);
                    break;
                case 4:
                    tabla =bajaElemento(tabla);
                    break;
                case 5:
                    listaTabla(tabla);
                    break;
                case 0:
                    salida=true;
                    break;
            }
        }while(salida==false);
    }
    public static int[] altaElemento(int lista[]){ //le llega la dirección de la lista tabla1 []
        int[] listaNueva=new int[lista.length+1];//creamos una nueva tabla con un elemento mas que el anterior
        if(lista.length!=0){ //leemos la lista vieja y pasamos a la lista nueva el nuevo elem
            for(int i=0;i<lista.length;i++){ //recorremos la longitud del array de enteros
            	//copiamos los valores de la vieja en la nueva
                listaNueva[i]=lista[i]; // aqui copiamos los num[i] copiamos 1 a uno los elementos en la listanueva table1
            }
        }    
        System.out.print("Introduzca un entero: "); 
        listaNueva[lista.length]=sc.nextInt();//introducimos el nuevo valor tabla1[tabla1.lenght-1]=sc.nexInt()
        return listaNueva;//
    }
    public static void listaTabla(int tabla[]){ // 
        for(int i=0;i<tabla.length;i++){ //recorremos los elementos de tabla
            System.out.println("Elemento "+ i +": "+ tabla[i]); // muestro los elementos desde i = elem 0, de la tabla[i]
        }
        System.out.println("");
    }    // for each (int valor: tabla){System.out.println("Elemento "+ i +": "+ tabla[i]);} 
    public static void consultaElemento(int tabla[]){
        int i=0;
        do{
            System.out.print("Introduce un elemento entre 0 y "+ (tabla.length-1)+": ");
            i=sc.nextInt();
        }while (i<0 || i>tabla.length-1);
        System.out.println("El elemento "+ (i)+ " vale: "+ tabla[i]);
        System.out.println("");
    }
    public static void modificaElemento(int tabla[]){
        int i=0;
        do{
            System.out.print("Introduce un elemento entre 0 y "+ (tabla.length-1)+": ");
            i=sc.nextInt();
        }while (i<0 || i>tabla.length-1);
        System.out.println("El elemento "+ (i)+ " vale: "+ tabla[i]);
        System.out.print("Introduce el nuevo valor: ");
        tabla[i]=sc.nextInt();
    }
    public static int[] bajaElemento(int tabla[]){
        if (tabla.length!=0){
            int tabla1[]= new int[tabla.length-1];//creamos una lista con un elemento menos
            int i=0;
            do{
                System.out.print("Introduce un elemento entre 0 y "+ (tabla.length-1)+": ");
                i=sc.nextInt();
            }while (i<0 || i>tabla.length-1);
            System.out.println("El elemento "+ i+ " que quieres dar de baja vale: "+ tabla[i]);

            for(int j=0; j<tabla.length-1;j++){
                if(j<i) tabla1[j]=tabla[j];
                if (j>=i) tabla1[j]=tabla[j+1];
            }
            System.out.println("");
            return tabla1;
        } else{
            System.out.println("La tabla esta vacia");
            System.out.println("");
            return tabla;
        } 
        
    }
}
