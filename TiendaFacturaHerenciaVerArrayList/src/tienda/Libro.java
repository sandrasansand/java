package tienda;

public class Libro implements Facturable{
    String titulo;
    String autor;
    double precio;
 Libro(String titulo,String autor,double precio)
 {
    this.titulo=titulo;
    this.autor=autor;
    this.precio=precio;
 }
 @Override
 public String toString(){
    String salida=this.titulo+" de "+this.autor+" y vale: "+this.precio;
    return salida;
 }
 @Override
 public void ImprimeFactura(){
    System.out.println("***********************");
    System.out.println("Libro");
    System.out.println(this.titulo);
    System.out.println("PVP(con IVA):"+this.precio*1.21 + " €");
    System.out.println("***********************");
 }
}
