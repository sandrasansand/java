package com.arquitectura.dao;

/*Se implementa en la clase ClienteDaoImpl.java haciendo 
 * un implements de la interface IClienteDao.java, 
 * lo que se hace aquí, no es más que implementar 
 * cada método de la interface.*/

import com.arquitectura.model.*;

import java.util.ArrayList;
import java.util.List;

import com.arquitectura.idao.*;

public class ClienteDaoImplement implements IClienteDao {
	// lista de tipo cliente
	List<Cliente> clientes;

	// inicializar los objetos cliente y añadirlos a la lista
	public ClienteDaoImplement() {
		clientes = new ArrayList<>();
		Cliente c1 = new Cliente(0, "Juan", "López");
		Cliente c2 = new Cliente(1, "Sofía", "Gómez");
		clientes.add(c1);
		clientes.add(c2);

	}

	// obtener todos los clientes
	@Override
	public List<Cliente> obtenerClientes() {

		return clientes;
	}

	// obtener un cliente por el id
	@Override
	public Cliente obtenerCliente(int id) {
		return clientes.get(id);
	}

	// actualizar un cliente
	@Override
	public void actualizarCliente(Cliente c) {
		clientes.get(c.getId()).setNombre(c.getNombre());
		clientes.get(c.getId()).setApellido(c.getApellido());
		System.out.println("Cliente con id: " + c.getId() + " actualizado satisfactoriamente");

	}

	// eliminar un cliente por el id
	@Override
	public void eliminarCliente(Cliente c) {
		clientes.remove(c.getId());
		System.out.println("Cliente con id: " + c.getId() + " eliminado correctamente");
	}

}
