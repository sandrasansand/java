package tienda;

public class DVD implements Facturable 
{
    String titulo;
    String actor;
    double precio;
    
    DVD(String titulo,String actor,double precio){
        this.titulo=titulo;
        this.actor=actor;
        this.precio=precio;
    }
    @Override
    public String toString(){
       String salida=this.titulo+", con "+this.actor+" y vale: "+this.precio;
       return salida;
    }
  
    @Override
    public void ImprimeFactura(){
       System.out.println("**********************");
       System.out.println("DVD");
       System.out.println(this.titulo);
       System.out.println("PVP(con IVA):"+this.precio*1.21 + " €");
       System.out.println("***********************");
    } 
}
