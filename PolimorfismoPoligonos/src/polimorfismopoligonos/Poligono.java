package polimorfismopoligonos;

public abstract class Poligono {
    private int numLados;
    public Poligono() {
    }
    public Poligono(int numLados) {
    this.numLados = numLados;
    }
    public int getNumLados() {
    return numLados;
    }
    public void setNumLados(int numLados) {
    this.numLados = numLados;
    }
    
//Sobreescritura del método toString() heredado de Object
    @Override
    public String toString(){
    return "Numero de lados: " + numLados;
    }
    //Declaración del método abstracto area()
    public abstract double area();
}    
    
    
