package org.asaez.anotaciones.ejemplo;

import java.lang.annotation.*;

@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonAtributo {
    String nombre() default "";
    boolean capitalizar() default false;
}
