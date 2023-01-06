package org.java.patrones.factory;
//la clave de este patrón es la abstracción y la herencia como una factoria padre de la q heredan las hijas
// factorias hijas (pizzerias, tiendas )para poder llegar a implementar productos concretos partiendo de unas caract
//comunes de una clase abstr Prodductos -> las hijas 
abstract public class PizzeriaZonaAbstractFactory {

    public PizzaProducto ordenarPizza(String tipo){
        PizzaProducto pizza = crearPizza(tipo);
        System.out.println("------Fabricando la pizza " + pizza.getNombre() + "------" );
        pizza.preparar();
        pizza.cocinar();
        pizza.cortar();
        pizza.empaquetar();
        return pizza;
    }

    abstract PizzaProducto crearPizza(String tipo);
}
