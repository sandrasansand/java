package org.asaez.optional.ejemplo.repositorio;

import java.util.Optional;

import org.asaez.optional.ejemplo.models.Computador;

public interface Repositorio<T> {

    Optional<Computador> filtrar(String nombre);

}
