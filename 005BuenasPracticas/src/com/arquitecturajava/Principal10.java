package com.arquitecturajava;

import com.arquitecturajava.comandos.ComandoEmail;
import com.arquitecturajava.comandos.ComandoFactura;
import com.arquitecturajava.comandos.ComandoGuardar;
import com.arquitecturajava.comandos.ComandoImprimir;
import com.arquitecturajava.dominio.Factura;

public class Principal10 {

	public static void main(String[] args) {
		
		
		ComandoFactura cf= new ComandoImprimir();

		cf.execute(new Factura(1,"ordenador",200));
		
		ComandoFactura cf1= new ComandoEmail();
		
		cf1.execute(new Factura (2,"televisor",500));
		
		
		ComandoFactura cf2= new ComandoGuardar();
		
		cf2.execute(new Factura (3,"televisor",500));
	}

}
