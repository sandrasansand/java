package org.asaezc.patrones.decorator.decorador;

import org.asaezc.patrones.decorator.Formateable;

public class MayusculaDecorador extends TextoDecorador{
    public MayusculaDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        return texto.darFormato().toUpperCase();
    }
}
