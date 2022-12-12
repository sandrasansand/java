package pkg02ordenacionburbuja;

public class OrdenacionBurbuja {
/*Consiste en comparar pares de elementos adyacentes en un array y si están desordenanos 
intercambiarlos hasta que estén todos ordenados */   
    public static void main(String[] args) {
       int numeros[] = {8,6,7,2,1,8,6,8,7,1,9,7,7,10};  
       long tiempoInicio=0,tiempoFin=0,nanosegundos=0;//Variables de control de tiempo
        
       tiempoInicio = System.nanoTime(); //Tomo el tiempo de inicio
       
       int numerosOrdenado[] = burbuja(numeros);//OrdenacionBurbuja.burbuja(numeros)
       
       tiempoFin = System.nanoTime();//Tomo el tiempo de fin
       nanosegundos = (int)(tiempoFin - tiempoInicio);//Total tiempo empleado
       System.out.println("Se ha completado la ordenación en "+
                nanosegundos+" nanosegundos");

       //imprimimos el numeros ordenado
       for(int elemento : numerosOrdenado)
                  System.out.println(elemento);
       System.out.println();
       for(int i = 0; i < numeros.length;i++) //el mismo array con dos referencias 
            System.out.println(numeros[i]);  
    }
    public static int[] burbuja(int[] num)//metodo estatico por lo que no hay que instanciarlo
    {  
        int auxiliar;  
//es una referencia a un vector de enteros que no le decimos cuantos elementos
// tiene porque no usamos numerosOrdenado[i]        
        for(int i = 0; i < num.length-1; i++)  
         {  
            for(int j = 0;j < num.length-1-i;j++)  
            {  
              if(num[j] > num[j+1])  
              {  
                auxiliar = num[j];  
                num[j] = num[j+1];  
                num[j+1] = auxiliar;  
              }     
            }  
        }  
        return num;  
    }  
}

