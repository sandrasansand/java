package org.asaez.api.stream.ejemplos;

import java.util.Arrays;
import java.util.List;

import org.asaez.api.stream.ejemplos.models.Factura;
import org.asaez.api.stream.ejemplos.models.Usuario;

public class EjemploStreamFlatMapFactura {
    public static void main(String[] args) {

        Usuario u1 = new Usuario("John", "Doe");
        Usuario u2 = new Usuario("Pepe", "Pérez");

        u1.addFactura(new Factura("compras tecnologías"));
        u1.addFactura(new Factura("compras muebles"));

        u2.addFactura(new Factura("bicicleta"));
        u2.addFactura(new Factura("notebook gamer"));

        List<Usuario> usuarios = Arrays.asList(u1, u2);
        usuarios.stream()
//        		.map(Usuario::getFacturas)
//        		.flatMap(List::stream)
                .flatMap(u -> u.getFacturas().stream()) //convertimos el flujo de un usua a un stream flujo fact
                .forEach(f -> System.out.println(f.getDescripcion().concat(" : cliente ")
                .concat(f.getUsuario().toString())));

        /*for(Usuario u: usuarios){
            for(Factura f: u.getFacturas()){
                System.out.println(f.getDescripcion());
            }
        }*/
    }
}
