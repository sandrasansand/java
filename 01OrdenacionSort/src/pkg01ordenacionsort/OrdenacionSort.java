package pkg01ordenacionsort;

import java.util.Arrays;
import java.util.Collections;

public class OrdenacionSort {
/* Para ordenar arrays de cualquier tipo Java dispone del método sort de la clase Arrays
Arrays.sort ordena de forma ascendente (de menor a mayor). Para ordenar un array de forma
descendente (de mayor a menor) hay que indicarlo utilizando el método reverseOrder() de 
la clase Collections.
 */
    public static void main(String[] args) {
       String [] nombres = {"juan", "pedro", "ana", "maria", "felipe", "luis", "eduardo"};
       long tiempoInicio=0,tiempoFin=0,nanosegundos=0;//Variables de control de tiempo

       tiempoInicio = System.nanoTime(); //Tomo el tiempo de inicio
      
       Arrays.sort(nombres);//ordenación ascendente
       
       tiempoFin = System.nanoTime();//Tomo el tiempo de fin en nanosegundos 10^-9 seg
       nanosegundos = (int)(tiempoFin - tiempoInicio);//Total tiempo empleado
       System.out.println("Se ha completado la ordenación en "+
                nanosegundos+" nanosegundos");

       for(int i=0; i< nombres.length; i++)
                System.out.println(nombres[i]);
       System.out.println();   
///
       tiempoInicio = System.nanoTime(); //Tomo el tiempo de inicio
       Arrays.sort(nombres, Collections.reverseOrder());//ordenacion descendente        
       
       tiempoFin = System.nanoTime();//Tomo el tiempo de fin
       nanosegundos = (int)(tiempoFin - tiempoInicio);//Total tiempo empleado
       System.out.println("Se ha completado la ordenación en "+
                nanosegundos+" nanosegundos");

       for(String s : nombres)//for each para leer una coleccion de datos
                System.out.println(s);//s = nombres[i]
       System.out.println();   

       int [] numeros = {3, 5, 1, 2, 1, 7, 0, -1};
       tiempoInicio = System.nanoTime(); //Tomo el tiempo de inicio
       
       Arrays.sort(numeros);
       
       tiempoFin = System.nanoTime();//Tomo el tiempo de fin
       nanosegundos = (int)(tiempoFin - tiempoInicio);//Total tiempo empleado
       System.out.println("Se ha completado la ordenación en "+
                nanosegundos+" nanosegundos");
       for (int n : numeros) {
               System.out.println(n);
        }
       System.out.println();   
        
       //Collections.reverseOrder solo funciona para arrays de objetos
       Integer [] numeros1 = {3, 5, 1, 2, 1, 7, 0, -1};
       tiempoInicio = System.nanoTime(); //Tomo el tiempo de inicio

       Arrays.sort(numeros1, Collections.reverseOrder());
       
       tiempoFin = System.nanoTime();//Tomo el tiempo de fin
       nanosegundos = (int)(tiempoFin - tiempoInicio);//Total tiempo empleado
       System.out.println("Se ha completado la ordenación en "+
                nanosegundos+" nanosegundos");
        for (Integer n : numeros1) {
               System.out.println(n);
        }

    }
}
