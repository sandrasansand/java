package iniciomaps2;

import java.util.TreeMap;

public class Persona {

    private int idPersona; 
    private String nombre; 
    private int altura; 
    private TreeMap<String,String> agendatel; //conjuntos ordenados de atrib llave/valor 2 strings
//ordenado por llave
    public Persona(int idPersona, String nombre, int altura) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.altura = altura;

        this.agendatel = new TreeMap<String,String>();//inicialmente el mapa está vacío
    }

    public TreeMap<String,String> getAgendatel() { 
        return agendatel; 
    }

    @Override
    public String toString() { 
        return "Persona-> ID: " + idPersona + " Nombre: " + nombre 
                + " Altura: " + altura + " \nAgenda:\n" + 
                agendatel.toString().replaceAll(",","\n");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {   
            return false;  
        }
        if (getClass() != obj.getClass()) {  
            return false;   
        }
        final Persona other = (Persona) obj;

        if (this.idPersona != other.idPersona) {  
            return false;    
        }
        return true;
    }
}
