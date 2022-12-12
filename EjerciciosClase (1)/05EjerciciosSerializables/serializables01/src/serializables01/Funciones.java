package serializables01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Funciones {
/**
Programa que escribe 3 objetos de tipo Persona en el fichero personas.dat.
*/
    public static void GrabarPersonas(){
        FileOutputStream fos = null;
        ObjectOutputStream salida = null;
        Persona p;
        try {
            //Se crea el fichero File nuevo
            fos = new FileOutputStream("/ficheros/personas.dat");
            salida = new ObjectOutputStream(fos);
            //Se crea el primer objeto Persona
            p = new Persona("12345678A","Lucas González", 30);
            //Se escribe el objeto en el fichero
            salida.writeObject(p);
            //Se crea el segundo objeto Persona
            p = new Persona("98765432B","Anacleto Jiménez", 28);
            //Se escribe el objeto en el fichero
            salida.writeObject(p);
            //Se crea el tercer objeto Persona
            p = new Persona("78234212Z","María Zapata", 35);
            //Se escribe el objeto en el fichero
            salida.writeObject(p);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if(fos!=null) fos.close();
                if(salida!=null) salida.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
       }
    }
/**
Programa Java que escribe en un fichero tres objetos de tipo Empleado. Empleado
es una clase derivada de la clase Persona del ejemplo anterior. Como la clase
Persona es serializable, no es necesario indicar que la clase Empleado también lo
es. Empleado es serializable por el hecho de heredar de Persona.
*/
    public static void GrabarEmpleados(){
        FileOutputStream fos = null;
        ObjectOutputStream salida = null;
        Empleado emp;
        try {
            fos = new FileOutputStream("/ficheros/empleados.dat");
            salida = new ObjectOutputStream(fos);
            emp = new Empleado("12345678A","Lucas González", 30, 1200.40);
            salida.writeObject(emp);
            emp = new Empleado("98765432B","Anacleto Jiménez", 28, 1000);
            salida.writeObject(emp);
            emp = new Empleado("78234212Z","María Zapata", 35, 1100.25);
            salida.writeObject(emp);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if(fos!=null) fos.close();
                if(salida!=null) salida.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

 // leer personas grabadas anteriormente   
    public static void LeerPersonas(){
        FileInputStream fis = null;
        ObjectInputStream entrada = null;
        Persona p;
        try {
                fis = new FileInputStream("/ficheros/personas.dat");
                entrada = new ObjectInputStream(fis);
                p = (Persona) entrada.readObject(); //es necesario el casting
                System.out.println(p.getNif() + " " + p.getNombre() + " " + p.getEdad());
                p = (Persona) entrada.readObject();
                System.out.println(p.getNif() + " " + p.getNombre() + " " + p.getEdad());
                p = (Persona) entrada.readObject();
                System.out.println(p.getNif() + " " + p.getNombre() + " " + p.getEdad());
        } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
                System.out.println(e.getMessage());
        } catch (IOException e) {
                System.out.println(e.getMessage());
        } finally {
            try {
                if (fis != null) {
                fis.close();
                }
                if (entrada != null) {
                entrada.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
    }
    }
    
// Leer empleados grabados anteriormente    
    public static void LeerEmpleados(){
        FileInputStream fis = null;
        ObjectInputStream entrada = null;
        Empleado emp;
            try {
            fis = new FileInputStream("/ficheros/empleados.dat");
            entrada = new ObjectInputStream(fis);
            emp = (Empleado) entrada.readObject();
            System.out.println(emp.getNif() + " "
            + emp.getNombre() + " " + emp.getEdad() + " " +
            emp.getSueldo());
            emp = (Empleado) entrada.readObject();
            System.out.println(emp.getNif() + " "
            + emp.getNombre() + " " + emp.getEdad() + " " +
            emp.getSueldo());
            emp = (Empleado) entrada.readObject();
            System.out.println(emp.getNif() + " "
            + emp.getNombre() + " " + emp.getEdad() + " " +
            emp.getSueldo());
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
            if (fis != null) {
            fis.close();
            }
            if (entrada != null) {
            entrada.close();
            }
            } catch (IOException e) {
            System.out.println(e.getMessage());
            }
        }
    }

}