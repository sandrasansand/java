package com.arquitectura.daodemo;
/*El problema que viene a resolver este patr�n es 
netamente el acceso a los datos, que b�sicamente 
tiene que ver con la gesti�n de diversas fuentes 
de datos y adem�s abstrae la forma de acceder a ellos.

Imag�nate que tienes un sistema montado en producci�n 
con una base de datos MySQL y de pronto lo debes 
cambiar a PostgreSQL o a cualquier otro motor de base 
de datos.

Eso puede ser un verdadero problema.icon

Y precisamente esto lo que soluciona este patr�n, 
tener una aplicaci�n que no est� ligada al acceso a datos,
 que si por ejemplo la parte de la vista pide encontrar 
los clientes con compras mensuales mayores $ 200, el DAO 
se encargue de traer esos datos independientemente 
si est� en un archivo o en una base de datos.

La capa DAO contiene todos los m�todos 
CRUD (create, read, update, delete), 
por lo general se tiene un DAO para cada 
tabla en la base de datos, y bueno la implementaci�n 
se la realiza de la siguiente manera.*/

import com.arquitectura.dao.ClienteDaoImplement;
import com.arquitectura.idao.IClienteDao;
import com.arquitectura.model.Cliente;

public class DaoDemo {

	public static void main(String[] args) {
		// objeto para manipular el dao
		IClienteDao clienteDao = new ClienteDaoImplement();
		// imprimir los clientes
		clienteDao.obtenerClientes().forEach(System.out::println);
		// obtener un cliente
		Cliente cliente = clienteDao.obtenerCliente(0);
		cliente.setApellido("Petrovich");
		// actualizar cliente
		clienteDao.actualizarCliente(cliente);

		// imprimir los clientes
		System.out.println("*****");
		clienteDao.obtenerClientes().forEach(System.out::println);
	}

}
