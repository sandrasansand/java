package com.arquitectura.vo;
/*Será la clase también conocida como Value Object:*/
public class ClienteVO {
	private int id;
	private String nombre;
	private String apellido;
	
	public ClienteVO(int id, String nombre, String apellido) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public ClienteVO() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return "id: " + id + " Nombre: " + nombre + " Apellido: " + apellido;
	}

}
