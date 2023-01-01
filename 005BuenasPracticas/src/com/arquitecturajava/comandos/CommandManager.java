package com.arquitecturajava.comandos;
/*manera más sencilla de lo que hace un Comando principal 10-11 -> principal 12*/
import java.util.ArrayList;
import java.util.List;

import com.arquitecturajava.dominio.Factura;

public class CommandManager implements ComandoFactura{

	List<ComandoFactura> lista= new ArrayList<>();
	
	public void add(ComandoFactura comando) {
		
		lista.add(comando);
	}
	
	public Factura execute (Factura factura ) {
		
		for (ComandoFactura comando: lista) {
			
			comando.execute(factura);
		}
		return factura;
	}
}
