package com.arquitecturajava;
/*viendo lo anterior pero ahora con stream y
 *  lambdas -> patrón de diseño pattern lambdas*/
import java.util.stream.Stream;

import com.arquitecturajava.comandos2.CommandManager;
import com.arquitecturajava.dominio.Factura;



public class Principal13 {

	public static void main(String[] args) {
		
		
		Factura f= new Factura(1,"ordenador",200);
		Factura f2= new Factura(2,"tablet",300);
		Factura f3= new Factura(3,"teléfono",400);
		Factura f4= new Factura(4,"libro",500);
	
		//long t1= System.currentTimeMillis();
		CommandManager manager= new CommandManager();

		Stream<Factura> mistream= Stream.of(f,f2,f3,f4);
		mistream
		//.parallel()
		//recibe una funcion a ejecutar, un consumidor
		.peek(CommandManager::imprimir)
		.peek(CommandManager::email)
		.peek(CommandManager::guardar)
		//le paso factura no f refeenciando a la la clase principal Factura
		.forEach ((factura)->System.out.println("termino"));
	
//		long t2= System.currentTimeMillis();
//		System.out.println(t2-t1);
		
		
		
	}

}
