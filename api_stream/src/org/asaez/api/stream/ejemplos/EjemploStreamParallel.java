package org.asaez.api.stream.ejemplos;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import org.asaez.api.stream.ejemplos.models.Usuario;

public class EjemploStreamParallel {
    public static void main(String[] args) {

        List<Usuario> lista = new ArrayList<>();
        lista.add(new Usuario("Sandra", "Sáez"));
        lista.add(new Usuario("Luci", "Martínez"));
        lista.add(new Usuario("Paolea", "Fernández"));
        lista.add(new Usuario("Cata", "Pérez"));
        lista.add(new Usuario("Manuel", "Mena"));
        lista.add(new Usuario("Lucas", "Doe"));
        lista.add(new Usuario("Bruce", "Lee"));
        lista.add(new Usuario("Bruce", "Willis"));

        long t1 = System.currentTimeMillis(); //tiempo ejecucion inicio
        String resultado = lista.stream()
                .parallel() //ejec en paralelo
                .map(u -> u.toString().toUpperCase())
                .peek(n -> {
                    System.out.println("Nombre Thread: " + Thread.currentThread().getName()
                    + " - " + n);
                })
                .flatMap(nombre -> {
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if(nombre.contains("bruce".toUpperCase())){
                        return Stream.of(nombre);
                    }
                    return Stream.empty();
                })
                .findAny().orElse("");

        long t2 = System.currentTimeMillis(); //tiempo final
        System.out.println("Tiempo total: " + (t2 - t1));
        System.out.println(resultado);
    }
}
