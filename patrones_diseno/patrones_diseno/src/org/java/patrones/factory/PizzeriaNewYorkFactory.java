package org.java.patrones.factory;

import org.java.patrones.factory.producto.PizzaNewYorkItaliana;
import org.java.patrones.factory.producto.PizzaNewYorkPepperoni;
import org.java.patrones.factory.producto.PizzaNewYorkVegetariana;

//a partir de java 13 switch nueva implementación
public class PizzeriaNewYorkFactory extends PizzeriaZonaAbstractFactory {
    @Override
    PizzaProducto crearPizza(String tipo) {
        return switch (tipo) {
            case "vegetariana" -> new PizzaNewYorkVegetariana();
            case "pepperoni" -> new PizzaNewYorkPepperoni();
            case "italiana" -> new PizzaNewYorkItaliana();
            default -> null;
        };
    }
}
