package tienda;

public class Traduccion extends Libro
{
    String idiomaOriginal;
    
    Traduccion(String titulo, String autor, double precio, String idiomaOriginal)
    {
        super(titulo, autor, precio);
        this.idiomaOriginal=idiomaOriginal;
    }
    @Override
    public String toString()
    {
        String salida=this.titulo+" de "+this.autor+" y vale: "+this.precio+
            " Originalmente fue escrito en "+this.idiomaOriginal;
        return salida;
    }
    
    public void Imprime(){
        System.out.println(this.idiomaOriginal);
    }
    
}
