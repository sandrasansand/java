package org.asaez.optional.ejemplo;

import org.asaez.optional.ejemplo.models.Computador;
import org.asaez.optional.ejemplo.models.Fabricante;
import org.asaez.optional.ejemplo.models.Procesador;
import org.asaez.optional.ejemplo.repositorio.ComputadorRepositorio;
import org.asaez.optional.ejemplo.repositorio.Repositorio;

public class EjemploRepositorioMapFilter {
    public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        String f = repositorio.filtrar("asus")
                .flatMap(Computador::getProcesador)
                .flatMap(Procesador::getFabricante)
                .filter(fab -> "intel".equalsIgnoreCase(fab.getNombre()))
                .map(Fabricante::getNombre)
                .orElse("Desconocido");

        System.out.println(f);


    }

}
