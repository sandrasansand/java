package com.arquitecturajava.dominio;

import java.util.ArrayList;
import java.util.List;

public class Persona implements Comparable<Persona> {

	private String nombre;
	private String apellidos;
	private int edad;
	
	List<Deporte> deportes= new ArrayList<>();
	
	public void addDeporte(Deporte deporte) {
		
		this.deportes.add(deporte);
	}
	
	public List<Deporte> getDeportes() {
		return deportes;
	}
	public void setDeportes(List<Deporte> deportes) {
		this.deportes = deportes;
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
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Persona(String nombre, String apellidos, int edad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	@Override
	public int compareTo(Persona otro) {
		// TODO Auto-generated method stub
		return this.getNombre().compareTo(otro.getNombre());
	}
	//metodo de instancia
	public  boolean estaJubilado() {
		//?? que es
		return this.getEdad()>65;
	}
	@Override
	public String toString() {
		
		return this.getNombre()+ this.getApellidos();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	
}
