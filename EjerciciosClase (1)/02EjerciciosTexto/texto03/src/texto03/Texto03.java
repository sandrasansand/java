package texto03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
Programa java que lee carácter a carácter el contenido del fichero de texto datos.txt 
creado en el ejemplo anterior. 
*/
public class Texto03 {

    public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader("c:/ficheros/datos.txt");
            BufferedReader entrada = new BufferedReader(fr);
//podriamos hacer fr.read() ya que para leer caracter a acracter no es imprescindible el buffer
            int car = entrada.read();//el método read() devuelve el caracter decimal UNICODE
           // System.out.println(car);//imprime el unicode
            while (car != -1) {
                System.out.print((char) car);
                car = entrada.read();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
