package serializables02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Funciones {
/**
Programa java que escribe en un fichero tres objetos de tipo Alumno. Alumno es
una clase derivada de Persona y contiene un atributo Fecha
*/
    public static void GrabarAlumnos(){
        FileOutputStream fos = null;
        ObjectOutputStream salida = null;
        Alumno a;
        Fecha f;
        try {
            fos = new FileOutputStream("/ficheros/alumnos.dat");
            salida = new ObjectOutputStream(fos);
            f = new Fecha(5,9,2011);
            a = new Alumno("12345678A","Lucas González", 20, f);
            salida.writeObject(a);
            f = new Fecha(7,9,2011);
            a = new Alumno("98765432B","Anacleto Jiménez", 19, f);
            salida.writeObject(a);
            f = new Fecha(8,9,2011);
            a = new Alumno("78234212Z","María Zapata", 21, f);
            salida.writeObject(a);
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
Programa Java que lee los objetos del fichero creado en el Ejemplo anterior
*/
    public static void LeerAlumnos(){
        FileInputStream fis = null;
        ObjectInputStream entrada = null;
        Alumno a;
        try {
            fis = new FileInputStream("/ficheros/alumnos.dat");
            entrada = new ObjectInputStream(fis);
            a = (Alumno) entrada.readObject();
            System.out.println(a.getNif() + " " + a.getNombre() + " " + a.getEdad()
                                    + " " + a.getFechaMatricula().getDia() + "-"
                                    + a.getFechaMatricula().getMes() + "-"
                                    + a.getFechaMatricula().getAño());
            a = (Alumno) entrada.readObject();
            System.out.println(a.getNif() + " " + a.getNombre() + " " + a.getEdad()
                                    + " " + a.getFechaMatricula().getDia() + "-"
                                    + a.getFechaMatricula().getMes() + "-"
                                    + a.getFechaMatricula().getAño());
            a = (Alumno) entrada.readObject();
            System.out.println(a.getNif() + " " + a.getNombre() + " " + a.getEdad()
                                    + " " + a.getFechaMatricula().getDia() + "-"
                                    + a.getFechaMatricula().getMes() + "-"
                                    + a.getFechaMatricula().getAño());
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