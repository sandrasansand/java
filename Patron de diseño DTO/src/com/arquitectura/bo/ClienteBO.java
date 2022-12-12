package com.arquitectura.bo;

import java.util.ArrayList;
import java.util.List;

import com.arquitectura.vo.ClienteVO;

/*
 * conocida tambi�n como la clase de negocio, que es la 
 * que contiene todos los m�todos CRUD
 * */
public class ClienteBO {
	// lista de tipo cliente
	List<ClienteVO> clientes;

	// constructor, se guarda en la lista 2 clientes Value Object
	public ClienteBO() {
		clientes = new ArrayList<>();
		ClienteVO c1 = new ClienteVO(0, "Ana", "L�pez");
		ClienteVO c2 = new ClienteVO(1, "Alfredo", "G�mez");
		clientes.add(c1);
		clientes.add(c2);
	}

	// m�todo elimina el cliente que se le pasa como para�metro
	public void eliminarCliente(ClienteVO cliente) {
		clientes.remove(cliente.getId());
		System.out.println("Cliente " + cliente.getId() + " eliminado satisfactoriamente");
	}

	//// obtiene toda la lista de clientes
	public List<ClienteVO> obtenerClientes() {
		return clientes;
	}

	// m�todo devuelve un cliente de acuerdo al id pasado como par�metro
	public ClienteVO obtenerCliente(int id) {
		return clientes.get(id);
	}

	// actualiza el cliente que se le pasa como par�metro
	public void actualizarCliente(ClienteVO c) {
		clientes.get(c.getId()).setNombre(c.getNombre());
		clientes.get(c.getId()).setApellido(c.getApellido());
		System.out.println("Cliente id: " + c.getId() + " actualizado satisfactoriamente");
	}
}