package com.ecodeup.mvc;

/*este patr�n permite separar una aplicaci�n en 3 capas, 
 * una forma de organizar y de hacer escalable un 
 * proyecto, a continuaci�n una breve descripci�n 
 * de cada capa.

Modelo: Esta capa representa todo lo que tiene que 
ver con el acceso a datos: guardar, actualizar, 
obtener datos, adem�s todo el c�digo de la l�gica 
del negocio, b�sicamente son las clases Java y 
parte de la l�gica de negocio.

Vista: La vista tiene que ver con la presentaci�n 
de datos del modelo y lo que ve el usuario, 
por lo general una vista es la representaci�n 
visual de un modelo (POJO o clase java).

Por ejemplo el modelo usuario que es una clase en Java 
y que tiene como propiedades, nombre y apellido 
debe pertenecer a una vista en la que el usuario 
vea esas propiedades.

Controlador: El controlador es el encargado de conectar 
el modelo con las vistas, funciona como un puente entre 
la vista y el modelo, el controlador recibe eventos 
generados por el usuario desde las vistas y se encargar 
de direccionar al modelo la petici�n respectiva.

Por ejemplo el usuario quiere ver los clientes con 
apellido �lvarez, la petici�n va al controlador y 
el se encarga de utilizar el modelo adecuado y 
devolver ese modelo a la vista.

Si te das cuenta en ning�n momento interact�an 
directamente la vista con el modelo, 
esto tambi�n mantiene la seguridad en una aplicaci�n.*/

import com.ecodeup.model.Cliente;
import com.ecodeup.view.*;
import com.ecodeup.controller.ClienteController;

public class MvcDemo {

	public static void main(String[] args) {
		// objeto vista, y modelo creado con el m�todo est�tico
		Cliente modelo = llenarDatosCliente();
		ClienteView vista = new ClienteView();
		// se crea un objeto controlador y se le pasa el modelo y la vista

		ClienteController controlador = new ClienteController(modelo, vista);
		//// se muestra los datos del cliente
		controlador.actualizarVista();
		System.out.println("*********actualizar apellido ********");
		// se actualiza un cliente y se muestra de nuevo los datos
		controlador.setApellido("G�mez");
		controlador.actualizarVista();

	}

	// m�todo est�tico que retorna el cliente con sus datos
	public static Cliente llenarDatosCliente() {
		Cliente c = new Cliente();
		c.setId(1);
		c.setApellido("P�rez");
		c.setNombre("Pepe");
		return c;
	}
}
