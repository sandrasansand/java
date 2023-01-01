package com.arquitecturajava;
/*simplificando el ejemplo anterior principal 10 ComandPattern*/
import com.arquitecturajava.comandos.ComandoEmail;
import com.arquitecturajava.comandos.ComandoFactura;
import com.arquitecturajava.comandos.ComandoGuardar;
import com.arquitecturajava.comandos.ComandoImprimir;
import com.arquitecturajava.dominio.Factura;

public class Principal11 {

	public static void main(String[] args) {
		
		
		ComandoFactura cf= new ComandoImprimir();
		ComandoFactura cf1= new ComandoEmail();
		ComandoFactura cf2= new ComandoGuardar();
		
		cf2.execute(cf1.execute(cf.execute(new Factura(1,"ordenador",200))));
	}

}
