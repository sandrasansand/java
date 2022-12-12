package enum02;

public class Enum02 {
    public enum Equipo
    {
	BARÇA("FC Barcelona",1), REAL_MADRID("Real Madrid",2),
	SEVILLA("Sevilla FC",4), VILLAREAL("Villareal",7); 
	
	private String nombreClub;
	private int puestoLiga;
	
	private Equipo (String nombreClub, int puestoLiga){
		this.nombreClub = nombreClub;
		this.puestoLiga = puestoLiga;
	}

	public String getNombreClub() {
		return nombreClub;
	}

	public int getPuestoLiga() {
		return puestoLiga;
	}	
	
    }    

    public static void main(String[] args) {
// Instanciamos el enumerado
        Equipo villareal = Equipo.VILLAREAL;

        // Devuelve un String con el nombre de la constante
        System.out.println("villareal.name()= "+villareal.name());

        // Devuelve el contenido de los atributos
        System.out.println("villareal.getNombreClub()= "+villareal.getNombreClub());
        System.out.println("villareal.getPuestoLiga()= "+villareal.getPuestoLiga());        
    }
    
}
