package com.arquitecturajava;

/*uso del Interface Comparator para hacer uso de diferentes maneras de ordenación
 * anidamiento.., métdos static y default metds
 * */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.arquitecturajava.dominio.Factura;

public class Principal3 {

	public static void main(String[] args) {

		List<Factura> lista = new ArrayList<Factura>();
		Factura f;

		for (int i = 0; i < 1_000_000; i++) {

			f = new Factura(i, "concepto" + i, Math.round(Math.random() * 10000));
			lista.add(f);
		}
		// ordenacion por concepto utilizando Comparator.comparing()permite comparar por
		// la propiedad q le paso
		// lista.stream().limit(10).sorted(Comparator.comparing(Factura::getConcepto)).forEach(System.out::println);

		lista.stream().limit(1000)
				.sorted(Comparator.comparing(Factura::getImporte)// compara importe
				.thenComparing(Factura::getNumero) // si es el mismo importe por numero
				.reversed()) // primero los mayores, el reverso
				.forEach(System.out::println);

	}

}
