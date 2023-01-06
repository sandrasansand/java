package org.java.patrones.factory.ejemplo;

import org.java.patrones.factory.PizzaProducto;
import org.java.patrones.factory.PizzeriaCaliforniaFactory;
import org.java.patrones.factory.PizzeriaNewYorkFactory;
import org.java.patrones.factory.PizzeriaZonaAbstractFactory;

public class EjemploFactory {
    public static void main(String[] args) {
        PizzeriaZonaAbstractFactory ny = new PizzeriaNewYorkFactory();
        PizzeriaZonaAbstractFactory california = new PizzeriaCaliforniaFactory();
        
        PizzaProducto pizza = california.ordenarPizza("queso");
        System.out.println("Antonio ordena la pizza " + pizza.getNombre());
        //toString 
        System.out.println("pizza = " + pizza);
        System.out.println();
        
        pizza = ny.ordenarPizza("pepperoni");
        System.out.println("María ordena una " + pizza.getNombre());
        System.out.println("pizza = " + pizza);
        System.out.println();
        
        pizza = california.ordenarPizza("vegetariana");
        System.out.println("James ordena " + pizza.getNombre());
        System.out.println("pizza = " + pizza);
        System.out.println();
        
        pizza = ny.ordenarPizza("vegetariana");
        System.out.println("Luis ordena la pizza " + pizza.getNombre());
        System.out.println("pizza = " + pizza);
        System.out.println();
        
        pizza = california.ordenarPizza("pepperoni");
        System.out.println("John ordena la pizza " + pizza.getNombre());

        //toString 
        System.out.println("pizza = " + pizza);
    }
}
