package com.ecodeup.mvc;

/*este patrón permite separar una aplicación en 3 capas, 
 * una forma de organizar y de hacer escalable un 
 * proyecto, a continuación una breve descripción 
 * de cada capa.

Modelo: Esta capa representa todo lo que tiene que 
ver con el acceso a datos: guardar, actualizar, 
obtener datos, además todo el código de la lógica 
del negocio, básicamente son las clases Java y 
parte de la lógica de negocio.

Vista: La vista tiene que ver con la presentación 
de datos del modelo y lo que ve el usuario, 
por lo general una vista es la representación 
visual de un modelo (POJO o clase java).

Por ejemplo el modelo usuario que es una clase en Java 
y que tiene como propiedades, nombre y apellido 
debe pertenecer a una vista en la que el usuario 
vea esas propiedades.

Controlador: El controlador es el encargado de conectar 
el modelo con las vistas, funciona como un puente entre 
la vista y el modelo, el controlador recibe eventos 
generados por el usuario desde las vistas y se encargar 
de direccionar al modelo la petición respectiva.

Por ejemplo el usuario quiere ver los clientes con 
apellido Álvarez, la petición va al controlador y 
el se encarga de utilizar el modelo adecuado y 
devolver ese modelo a la vista.

Si te das cuenta en ningún momento interactúan 
directamente la vista con el modelo, 
esto también mantiene la seguridad en una aplicación.*/

import com.ecodeup.model.Cliente;
import com.ecodeup.view.*;
import com.ecodeup.controller.ClienteController;

public class MvcDemo {

	public static void main(String[] args) {
		// objeto vista, y modelo creado con el método estático
		Cliente modelo = llenarDatosCliente();
		ClienteView vista = new ClienteView();
		// se crea un objeto controlador y se le pasa el modelo y la vista

		ClienteController controlador = new ClienteController(modelo, vista);
		//// se muestra los datos del cliente
		controlador.actualizarVista();
		System.out.println("*********actualizar apellido ********");
		// se actualiza un cliente y se muestra de nuevo los datos
		controlador.setApellido("Gómez");
		controlador.actualizarVista();

	}

	// método estático que retorna el cliente con sus datos
	public static Cliente llenarDatosCliente() {
		Cliente c = new Cliente();
		c.setId(1);
		c.setApellido("Pérez");
		c.setNombre("Pepe");
		return c;
	}
}
