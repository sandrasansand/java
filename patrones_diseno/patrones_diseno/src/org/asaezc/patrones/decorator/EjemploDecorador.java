package org.asaezc.patrones.decorator;

import org.asaezc.patrones.decorator.decorador.MayusculaDecorador;
import org.asaezc.patrones.decorator.decorador.RemplazarEspaciosDecorador;
import org.asaezc.patrones.decorator.decorador.ReversaDecorador;
import org.asaezc.patrones.decorator.decorador.SubrayadoDecorador;

public class EjemploDecorador {
    public static void main(String[] args) {
        Formateable texto = new Texto("Hola que tal Andrés!");

        MayusculaDecorador mayuscula = new MayusculaDecorador(texto);
        ReversaDecorador reversa = new ReversaDecorador(mayuscula);
        SubrayadoDecorador subrayar = new SubrayadoDecorador(reversa);
        RemplazarEspaciosDecorador remplazar = new RemplazarEspaciosDecorador(subrayar);

        System.out.println(remplazar.darFormato());
    }
}
