package com.arquitecturajava.dominio;

public class Persona implements Comparable<Persona> {

	private String nombre;
	private String apellidos;
	private int edad;
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
		
		return this.getNombre()+" "+ this.getApellidos();
	}
	
	
}
