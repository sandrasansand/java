package com.arquitectura.idao;

/*Se crea el acceso a los datos a trav�s de una interface 
 * IClienteDao.java, aqu� se declara todos los 
 * m�todos para acceder a los datos.*/

import java.util.List;

import com.arquitectura.model.Cliente;

public interface IClienteDao {
	// declaramos los m�todos de acceso a la bd
	public List<Cliente> obtenerClientes();

	public Cliente obtenerCliente(int id);

	public void actualizarCliente(Cliente c);

	public void eliminarCliente(Cliente c);

}
