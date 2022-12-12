package pkg05ordenacionquicksort;

public class OrdenacionQuickSort {
/*
El algoritmo de ordenación rápida, o QuickSort, se implementa a través de un procedimiento
recursivo que implementa tres pasos:
1. Selecciona un elemento de referencia o pivote, con base en el cual se reorganizará 
   el array a ordenar
2. Reorganiza el array de tal manera que a la izquierda del pivote se sitúen todos 
   los elementos menores a él y a la derecha los mayores.
3. Se invoca recursivamente el método de ordenación tanto para el subconjunto de 
   elementos de la izquierda como para el de la derecha.
 */
    public static void main(String[] args) {
       int numeros[] = {8,6,7,2,1,8,6,8,7,1,9,7,7,10}; 
       int izq=0, der=numeros.length-1;
       long tiempoInicio=0,tiempoFin=0,nanosegundos=0;//Variables de control de tiempo
        
       tiempoInicio = System.nanoTime(); //Tomo el tiempo de inicio
        
       int numerosOrdenado[] = quicksort(numeros, izq, der);  

       tiempoFin = System.nanoTime();//Tomo el tiempo de fin
       nanosegundos = (int)(tiempoFin - tiempoInicio);//Total tiempo empleado
       System.out.println("Se ha completado la ordenación en "+
                nanosegundos+" nanosegundos");

       //imprimimos numeros ordenado
        for(int elemento : numerosOrdenado)
                  System.out.println(elemento);
    }
    
    public static int[] quicksort(int numeros[], int izq, int der) {

      int pivote=numeros[izq]; // tomamos primer elemento como pivote
      int i=izq; // i realiza la búsqueda de izquierda a derecha
      int j=der; // j realiza la búsqueda de derecha a izquierda
      int aux;
      int[] numerosOrdenado;
      
      while(i<j){            // mientras no se crucen las búsquedas
         while(numeros[i]<=pivote && i<j) i++; // busca elemento mayor que pivote
         while(numeros[j]>pivote) j--;         // busca elemento menor que pivote
         if (i<j) {                      // si no se han cruzado                      
             aux= numeros[i];                  // los intercambia
             numeros[i]=numeros[j];
             numeros[j]=aux;
         }
       }
       numeros[izq]=numeros[j]; // se coloca el pivote en su lugar de forma que tendremos
       numeros[j]=pivote; // los menores a su izquierda y los mayores a su derecha
       if(izq<j-1)
          quicksort(numeros,izq,j-1); // ordenamos subarray izquierdo
       if(j+1 <der)
          quicksort(numeros,j+1,der); // ordenamos subarray derecho
       
        numerosOrdenado = numeros;  
        return numerosOrdenado;  
    }
}
