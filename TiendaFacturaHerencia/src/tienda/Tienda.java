package tienda;

public class Tienda {

    public static void main(String[] args) 
    {
    Libro libro1,libro2,libro3;
    DVD dvd1,dvd2,dvd3;
    libro1=new Libro("Los tres mosqueteros","Dumas",10);
    libro2=new Libro("Guerra y Paz","Tolstoi",20);
    libro3=new Libro("El Jugador","Dostoievski",30);
    dvd1=new DVD("Indiana Jones","Harrison Ford",20);
    dvd2=new DVD("James Bond","Sean Connnery",40);
    dvd3=new DVD("Superman","Reeve",30);
 
    System.out.println(dvd1);
    
    System.out.println("Inicio de Interface");
    //Tienda con interface utilizando Facturable
    
    Facturable libro5,dvd5;
    libro5=new Libro("El Camino","Miguel Delibes",40);
    libro5.ImprimeFactura();
    dvd5=new DVD("Batman","Michael Keaton",30);
    dvd5.ImprimeFactura();
    dvd1.ImprimeFactura();
    
    //añadimos herencia
     Facturable libro6;
     libro6=new Traduccion("Ana Karenina","Tolstoi",30,"Ruso");
     libro6.ImprimeFactura();
     
     System.out.println((Traduccion) libro6);
     
     System.out.println(libro6.toString());

    }
}
