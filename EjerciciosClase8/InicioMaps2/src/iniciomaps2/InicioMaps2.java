package iniciomaps2;

public class InicioMaps2 {

    public static void main(String[] args) {
/* Ejemplo Interface Map y SortedMap, clase HashMap y TreeMap*/
        Persona p = new Persona(1,"María",167);
        p.getAgendatel().put("Trabajo", "954825748");
        p.getAgendatel().put("Oficina", "958746362");
        p.getAgendatel().put("Móvil","666555444");
        p.getAgendatel().put("Casa","952473456");
        System.out.println("Personas en el mapa: \n"+p);
    }
}
