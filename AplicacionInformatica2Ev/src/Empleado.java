
public abstract class Empleado {
private String dni;
private String nombre;
private String apellidos;
private int anyoIngreso;


public Empleado() {

}


public Empleado(String dni, String nombre, String apellidos, int anyoIngreso) {
	this.dni = dni;
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.anyoIngreso = anyoIngreso;
}


public String getDni() {
	return dni;
}


public void setDni(String dni) {
	this.dni = dni;
}


public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public String getApellidos() {
	return apellidos;
}


public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}


public int getAnyoIngreso() {
	return anyoIngreso;
}


public void setAnyoIngreso(int anyoIngreso) {
	this.anyoIngreso = anyoIngreso;
}

public void imprimir() {
	System.out.println("\nDni: " + getDni() + "\nNombre y apellidos :" + getNombre() + " " + getApellidos() + "\nAño: "
			+ getAnyoIngreso());

}

abstract public double obtenerSalario();//deberan implementarlo las clases hijas

}
