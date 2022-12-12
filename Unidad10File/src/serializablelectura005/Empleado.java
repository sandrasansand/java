package serializablelectura005;

/*Para serializar objetos de una jerarquía solamente la clase base tiene que
implementar el interface Serializable. No es necesario que las clases derivadas
implementen la interfaz.
Si una clase es serializable lo son también todas sus clases derivadas.
Ejemplo de herencia y serialización:

Programa Java que escribe en un fichero tres objetos de tipo Empleado. Empleado
es una clase derivada de la clase Persona del ejemplo anterior. Como la clase
Persona es serializable, no es necesario indicar que la clase Empleado también lo
es. Empleado es serializable por el hecho de heredar de Persona.
*/
public class Empleado extends Persona {
	private double sueldo;

	public Empleado() {
		
	}

	public Empleado(String nif, String nombre, int edad, double sueldo) {
		super(nif, nombre, edad);
		this.sueldo = sueldo;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	
	
}
