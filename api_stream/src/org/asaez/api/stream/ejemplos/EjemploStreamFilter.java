package org.asaez.api.stream.ejemplos;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.asaez.api.stream.ejemplos.models.Usuario;

public class EjemploStreamFilter {
    public static void main(String[] args) {

        Stream<Usuario> nombres = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(u -> u.getNombre().equals("Pepe"))
                .peek(System.out::println);//permite inspeccionar el flujo, debugear

        List<Usuario> lista = nombres.collect(Collectors.toList()); //convers a Lista
        lista.forEach(System.out::println);
        //nombres.forEach(System.out::println);

    }
}
