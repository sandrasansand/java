package serializables01;

//Si una clase es serializable también los son sus derivadas 
public class Empleado extends Persona{
    private double sueldo;
    
    public Empleado(String nif, String nombre, int edad, double sueldo) {
        super(nif, nombre, edad);
        this.sueldo = sueldo;
    }
    public Empleado() {
    }
    public double getSueldo() {
        return sueldo;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }    
}
