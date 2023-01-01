package org.asaez.api.stream.ejemplos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.asaez.api.stream.ejemplos.models.Usuario;

public class EjemploStreamListToStream {
    public static void main(String[] args) {

        List<Usuario> lista = new ArrayList<>();
        lista.add(new Usuario("Snadra", "Sáez"));
        lista.add(new Usuario("Luci", "Martínez"));
        lista.add(new Usuario("Pepe", "Fernández"));
        lista.add(new Usuario("Cata", "Pérez"));
        lista.add(new Usuario("Lalo", "Mena"));
        lista.add(new Usuario("Exequiel", "Doe"));
        lista.add(new Usuario("Bruce", "Lee"));
        lista.add(new Usuario("Bruce", "Willis"));

        Stream<String> nombres = lista.stream()
                .map(u -> u.getNombre().toUpperCase()
                        .concat(" ")
                        .concat(u.getApellido().toUpperCase()))
                .flatMap(nombre -> {
                    if(nombre.contains("bruce".toUpperCase())){
                        return Stream.of(nombre);
                    }
                    return Stream.empty();
                })
                .map(String::toLowerCase)
                .peek(System.out::println);

        System.out.println(nombres.count());
    }
}
