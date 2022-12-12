package com.arquitectura.dto;

/*Va de la mano con el patrón de diseño DAO.

Se utiliza para transferir varios atributos entre 
el cliente y el servidor o viceversa, básicamente 
consta de 2 clases:

La primera es una clase java conocida como Value Object 
que únicamente contiene sus atributos, constructor, 
getters y setters, esta clase no tiene comportamiento.
La segunda es una clase del lado del servidor 
conocida como clase de negocio 
(en la implementación también se conoce 
como Business Object) es la que se encarga 
de obtener datos desde la base de datos 
y llenar la clase Value Object y enviarla al cliente, 
o a su vez recibir la clase desde el cliente 
y enviar los datos al servidor, 
por lo general tiene todos los 
métodos CRUD (create, read, update y delete).*/
import com.arquitectura.bo.ClienteBO;
import com.arquitectura.vo.ClienteVO;

public class DTODemo {

	public static void main(String[] args) {

		// objeto business object
		ClienteBO clienteBusinessObject = new ClienteBO();

		// obtiene todos los clientes
		clienteBusinessObject.obtenerClientes().forEach(System.out::println);

		// actualiza un cliente VO y utilizando el crud BO
		ClienteVO clienteActualizar = clienteBusinessObject.obtenerCliente(0);
		clienteActualizar.setApellido("Ramírez");
		clienteBusinessObject.actualizarCliente(clienteActualizar);

		// obtiene un cliente
		System.out.println("*********obtener cliente*****");
		System.out.println(clienteBusinessObject.obtenerCliente(0));

		// elimina un cliente
		System.out.println("**eliminando cliente**");
		clienteBusinessObject.eliminarCliente(clienteActualizar);

		// leyendo lista
		System.out.println("*****lista******");
		clienteBusinessObject.obtenerClientes().forEach(System.out::println);

	}

}
