package com.arquitecturajava.dominio;

public class Deporte {

	private String nombre;
	private int horas;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public Deporte(String nombre, int horas) {
		super();
		this.nombre = nombre;
		this.horas = horas;
	}
	@Override
	public String toString() {
		return "Deporte [nombre=" + nombre + ", horas=" + horas + "]";
	}
	
	
}
