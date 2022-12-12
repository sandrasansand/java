package files04;

import java.io.File;
import java.io.IOException;
/**
El siguiente programa muestra la diferencia entre getPath(), getAbsolutePath() y 
getCanonicalPath(). Además usa el método getProperty() de la clase System para obtener 
el directorio de trabajo actual. 
*/
public class Files04 {

public static void main(String[] args) throws IOException {
    File f = new File("../../datos.dat");//no existe
    String dirActual = System.getProperty("user.dir");//path completo del directorio actual
    System.out.println("Directorio actual   " + dirActual);
    System.out.println("getPath()           " + f.getPath());//tal como se ha creado f aunque no exista
    //path completo pero de donde estamos pero añadiendo ../../datos.dat
    System.out.println("getAbsolutePath()   " + f.getAbsolutePath());
    //path resultado completo recalculado sin ../../
    System.out.println("getCanonicalPath()  " + f.getCanonicalPath());    
}
}
