package modificadortransient;
/*Un atributo transient no se serializa.
En el siguiente ejemplo, la clase Cliente tiene dos atributos: el nombre del cliente y
la contraseña. El atributo contraseña es transient por lo tanto si se serializa para
escribir un objeto Cliente en un fichero solo se escribirá el atributo nombre.
*/
import java.io.Serializable;

public class Cliente implements Serializable{
	private String nombre;
	private transient String passWord;
	public Cliente(String nombre, String passWord) {
		this.nombre = nombre;
		this.passWord = passWord;
	}
	
}
