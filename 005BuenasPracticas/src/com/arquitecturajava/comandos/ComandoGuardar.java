package com.arquitecturajava.comandos;

import com.arquitecturajava.dominio.Factura;

public class ComandoGuardar implements ComandoFactura{

	@Override
	public Factura execute(Factura factura) {
	
		System.out.println ("guardando la factura :"+ factura.getNumero());
		return factura;
		
	
	}

}
