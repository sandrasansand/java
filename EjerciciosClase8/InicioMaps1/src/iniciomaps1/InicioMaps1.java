package iniciomaps1;

import java.util.HashMap;
import java.util.Map;

public class InicioMaps1 {

public static void main(String[] args) {
	//conjunto de elementos se puede  añadir,eliminar están desordenados.
    Map <Integer,Persona> mp = new HashMap<Integer,Persona>();
    Persona p = new Persona(4,"María",167);
    mp.put(4, p); // Añadimos un objeto persona al map
    p = new Persona(1,"Marta",165);
    mp.put(1, p); // Añadimos un objeto persona al map
    Persona p2 = new Persona(3,"Elena",185);
    mp.put(3, p2); // Añadimos un objeto persona al map
    p = new Persona(2,"Yolanda",174);
    mp.put(2, p); // Añadimos un objeto persona al map
    p = new Persona(3,"María Dolores",169);
    mp.put(3, p); // Esto crea una colisión ¡Dos objetos no pueden tener la misma clave!
    System.out.println(mp.toString());
    System.out.println("Personas en el mapa: \n"+mp.toString().replaceAll(",", "\n")); //donde hay una , pon un salto línea   
    System.out.println("");
    for(Integer valor: mp.keySet()){  //llave
        System.out.println(valor + "  "+mp.get(valor).getNombre() );
    }
}
}
