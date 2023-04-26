package org.asaezc.patrones.decorator.decorador;

import org.asaezc.patrones.decorator.Formateable;

abstract public class TextoDecorador implements Formateable {
    protected Formateable texto;

    public TextoDecorador(Formateable texto) {
        this.texto = texto;
    }
}
