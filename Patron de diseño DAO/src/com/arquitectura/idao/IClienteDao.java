package com.arquitectura.idao;

/*Se crea el acceso a los datos a través de una interface 
 * IClienteDao.java, aquí se declara todos los 
 * métodos para acceder a los datos.*/

import java.util.List;

import com.arquitectura.model.Cliente;

public interface IClienteDao {
	// declaramos los métodos de acceso a la bd
	public List<Cliente> obtenerClientes();

	public Cliente obtenerCliente(int id);

	public void actualizarCliente(Cliente c);

	public void eliminarCliente(Cliente c);

}
