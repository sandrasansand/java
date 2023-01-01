package com.arquitecturajava.comandos;

import com.arquitecturajava.dominio.Factura;

public class ComandoEmail implements ComandoFactura{

	@Override
	public Factura execute(Factura factura) {
	
		System.out.println ("enviando por email la factura :"+ factura.getNumero());
		return factura;
		
	
	}

}
