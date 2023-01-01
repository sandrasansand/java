package com.arquitecturajava.comandos;

import com.arquitecturajava.dominio.Factura;

public class ComandoImprimir implements ComandoFactura{

	@Override
	public Factura execute(Factura factura) {
	
		System.out.println(factura.getNumero());
		System.out.println(factura.getConcepto());
		System.out.println(factura.getImporte());
		return factura;
		
	
	}

}
