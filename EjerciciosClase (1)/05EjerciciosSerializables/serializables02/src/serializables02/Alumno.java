package serializables02;
/*
 Alumno es una clase derivada de Persona y contiene un atributo de la clase Fecha
 */
public class Alumno extends Persona{
    private Fecha fechaMatricula;
    
    public Alumno(String nif, String nombre, int edad, Fecha fechaMatricula) {
        super(nif, nombre, edad);
        this.fechaMatricula = new Fecha();
        setFechaMatricula(fechaMatricula);
    }
    public Alumno() {
    }
    public Fecha getFechaMatricula() {
        return fechaMatricula;
    }
    public void setFechaMatricula(Fecha fechaMatricula) {
        this.fechaMatricula.setDia(fechaMatricula.getDia());
        this.fechaMatricula.setMes(fechaMatricula.getMes());
        this.fechaMatricula.setAño(fechaMatricula.getAño());
    }    
}
