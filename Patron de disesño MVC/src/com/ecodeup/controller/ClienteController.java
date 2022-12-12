package com.ecodeup.controller;

import com.ecodeup.model.*;
import com.ecodeup.view.*;

/*el controlador, el controlador contiene 2 objetos 
 * el modelo, la vista así como los getters y setters 
 * para llenar las propiedades del modelo y un 
 * método(actualizarVista()) que llama a la vista 
 * que a su vez imprime las propiedades del 
 * modelo cliente.*/
public class ClienteController {
	// objetos vista y modelo
	private ClienteView vista;
	private Cliente modelo;

	public ClienteController(Cliente modelo, ClienteView vista) {
		this.modelo = modelo;
		this.vista = vista;
	}

	// getters y setters para el modelo
	public int getId() {
		return modelo.getId();
	}

	public void setId(int id) {
		this.modelo.setId(id);
	}

	public String getNombre() {
		return modelo.getNombre();
	}

	public void setNombre(String nombre) {
		this.modelo.setNombre(nombre);
	}

	public String getApellido() {
		return modelo.getApellido();
	}

	public void setApellido(String apellido) {
		this.modelo.setApellido(apellido);
	}

//método que pasa el modelo a la vista para presentar los datos
	public void actualizarVista() {
		vista.imprimirDatosCliente(modelo.getId(), modelo.getNombre(), modelo.getApellido());
	}
}
