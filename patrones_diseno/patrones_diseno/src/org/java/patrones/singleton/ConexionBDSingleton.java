package org.java.patrones.singleton;

public class ConexionBDSingleton {

    private static ConexionBDSingleton instancia;

    private ConexionBDSingleton(){
        System.out.println("Conectándose algún motor de base de datos");
    }

    public static ConexionBDSingleton getInstancia(){
        if(instancia == null){
            instancia = new ConexionBDSingleton();
        }
        return instancia;
    }

}
