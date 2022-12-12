package pkg03ordenacionseleccion;

public class OrdenacionSeleccion {
/*El método de ordenación por selección consiste en repetir los siguientes pasos:
Se busca el elemento más pequeño del array y se coloca en la primera posición.
Entre los restantes, se busca el elemento más pequeño y se coloca en la segunda posición.
Entre los restantes se busca el elemento más pequeño y se coloca en la tercera posición.
...............    
Este proceso se repite hasta colocar el último elemento.*/
    
    public static void main(String[] args) {
       int numeros[] = {8,6,7,2,1,8,6,8,7,1,9,7,7,10};  
       long tiempoInicio=0,tiempoFin=0,nanosegundos=0;//Variables de control de tiempo
        
       tiempoInicio = System.nanoTime(); //Tomo el tiempo de inicio
       
       numeros = seleccion(numeros);  

       tiempoFin = System.nanoTime();//Tomo el tiempo de fin
       nanosegundos = (int)(tiempoFin - tiempoInicio);//Total tiempo empleado
       System.out.println("Se ha completado la ordenación en "+
                nanosegundos+" nanosegundos");
       //imprimimos el numeros ordenado
        for(int elemento : numeros)
                  System.out.println(elemento);
    }
    
    public static int[] seleccion(int numeros[]) {
          int menor, pos, auxiliar;
          
          for (int i = 0; i < numeros.length-1; i++) { // tomamos como menor el primero
                menor = numeros[i]; // de los elementos que quedan por ordenar
                pos = i; // y guardamos su posición
                for (int j = i + 1; j < numeros.length; j++){ // buscamos en el resto
                      if (numeros[j] < menor) { // del array algún elemento
                          menor = numeros[j]; // menor que el actual
                          pos = j;
                      }
                }
                if (pos != i){ // si hay alguno menor se intercambia
                    auxiliar = numeros[i];
                    numeros[i] = numeros[pos];
                    numeros[pos] = auxiliar;
                }
          }
        return numeros;  
    }    
}
