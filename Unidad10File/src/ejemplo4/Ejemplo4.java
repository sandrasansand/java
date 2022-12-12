package ejemplo4;
/* El siguiente programa muestra la diferencia entre getPath(),
getAbsolutePath() y getCanonicalPath(). Adem�s usa el m�todo getProperty()
de la clase System para obtener el directorio de trabajo actual.
*/
import java.io.File;
import java.io.IOException;

public class Ejemplo4 {

	public static void main(String[] args) throws IOException {
		File f = new File("../../datos.dat");
		String dirActual = System.getProperty("user.dir");
		System.out.println("Directorio actual: " + dirActual);
		System.out.println("getPath " + f.getPath());
		System.out.println("getAbsolutePath " + f.getAbsolutePath());
		System.out.println("getCanonicalPath " + f.getCanonicalPath());
	}

}
