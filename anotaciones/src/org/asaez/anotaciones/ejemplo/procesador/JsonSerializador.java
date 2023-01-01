package org.asaez.anotaciones.ejemplo.procesador;

import org.asaez.anotaciones.ejemplo.Init;
import org.asaez.anotaciones.ejemplo.JsonAtributo;
import org.asaez.anotaciones.ejemplo.procesador.exception.JsonSerializadorException;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class JsonSerializador {

    public static void inicializarObjeto(Object object){
        if(Objects.isNull(object)){
            throw new JsonSerializadorException("El objeto a serializar no puede ser null!");
        }
        Method[] metodos = object.getClass().getDeclaredMethods();
        Arrays.stream(metodos).filter(m -> m.isAnnotationPresent(Init.class)) //filtramos los metodos con esta anotacion
                .forEach(m-> {
                    m.setAccessible(true);//accesibilidad a atrib private
                    try {
                        m.invoke(object);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        throw new JsonSerializadorException(
                                "Error al serializar, no se puede iniciar el objeto"
                        + e.getMessage());
                    }
                });
    }

    public static String convertirJson(Object object){

        if(Objects.isNull(object)){
            throw new JsonSerializadorException("El objeto a serializar no puede ser null!");
        }
        inicializarObjeto(object);
        Field[] atributos = object.getClass().getDeclaredFields();
        return Arrays.stream(atributos)
                .filter(f -> f.isAnnotationPresent(JsonAtributo.class)) //f  son los fields
                .map(f -> {
                    f.setAccessible(true);
                    String nombre = f.getAnnotation(JsonAtributo.class).nombre().equals("")
                            ? f.getName()
                            : f.getAnnotation(JsonAtributo.class).nombre();
                    try {
                        Object valor = f.get(object);
                        if(f.getAnnotation(JsonAtributo.class).capitalizar() &&
                        valor instanceof String){
                            String nuevoValor = (String) valor;
                            nuevoValor = Arrays.stream(nuevoValor.split(" "))
                            .map(palabra -> palabra.substring(0, 1).toUpperCase() //capitalizar cada palabra del stream
                            + palabra.substring(1).toLowerCase())
                            .collect(Collectors.joining(" "));//concatena los streams con cada palabra capitalizada en 1 flujo

                            f.set(object, nuevoValor);
                        }
                        return "\"" + nombre + "\":\"" + f.get(object) + "\"";
                    } catch (IllegalAccessException e) {
                        throw new JsonSerializadorException("Error al serializar a json: " + e.getMessage());
                    }
                })
                .reduce("{" , (a,b) -> {
                    if("{".equals(a)){
                        return a + b;
                    }
                    return a + ", " + b;
                }).concat("}");
    }
}
