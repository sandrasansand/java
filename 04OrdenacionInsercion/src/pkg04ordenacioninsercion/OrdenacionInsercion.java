package pkg04ordenacioninsercion;

public class OrdenacionInsercion {
/*
El método de ordenación por inserción directa consiste en recorrer todo el array comenzando
desde el segundo elemento hasta el final. Para cada elemento, se trata de colocarlo en el 
lugar correcto entre todos los elementos anteriores a él o sea entre los elementos a su 
izquierda en el array.
 */
    public static void main(String[] args) {
       int numeros[] = {8,6,7,2,1,8,6,8,7,1,9,7,7,10};  
       long tiempoInicio=0,tiempoFin=0,nanosegundos=0;//Variables de control de tiempo
        
       tiempoInicio = System.nanoTime(); //Tomo el tiempo de inicio

       insercion(numeros); //si el metodo es estático no necesitamos otra referencia 

       tiempoFin = System.nanoTime();//Tomo el tiempo de fin
       nanosegundos = (int)(tiempoFin - tiempoInicio);//Total tiempo empleado
       System.out.println("Se ha completado la ordenación en "+
                nanosegundos+" nanosegundos");
       //imprimimos el numeros ordenado
        for(int elemento : numeros)
                  System.out.println(elemento);
    }
    
        public static void insercion(int[] numeros) {
            int i, j;
            int aux;
    // desde el segundo elemento hasta el final, guardamos el elemento y  
    // empezamos a comprobar con el anterior        
            for (i = 1; i < numeros.length; i++){ 
                aux = numeros[i]; 
                j = i - 1; 
                while((j >= 0)&&(aux < numeros[j])){
                //mientras queden posiciones y el valor de aux sea menor que los
                // de la izquierda, se desplaza a la derecha    
                    numeros[j + 1] = numeros[j]; 
                    j--;
                }
                numeros[j + 1] = aux; // colocamos aux en su sitio
            }
        }    
}
