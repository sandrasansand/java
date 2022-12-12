package serializablelectura005;

//Clase Principal2
import serializable002.Empleado;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.io.ObjectInputStream;

public class Principal2 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		ObjectInputStream entrada = null;
		Empleado emp;
		try {
			fis = new FileInputStream("/ficheros/empleados.dat");
			entrada = new ObjectInputStream(fis);
			emp = (Empleado) entrada.readObject();
			System.out.println(emp.getNif() + " " + emp.getNombre() + " " + emp.getEdad() + " " + emp.getSueldo());
			emp = (Empleado) entrada.readObject();
			System.out.println(emp.getNif() + " " + emp.getNombre() + " " + emp.getEdad() + " " + emp.getSueldo());
			emp = (Empleado) entrada.readObject();
			System.out.println(emp.getNif() + " " + emp.getNombre() + " " + emp.getEdad() + " " + emp.getSueldo());
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
				if (entrada != null) {
					entrada.close();
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
