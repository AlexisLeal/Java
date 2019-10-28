package Software;
public abstract class Poligono {
    
    
   protected int numerodelados;

    public Poligono(int numerodelados) {
        this.numerodelados = numerodelados;
    }

    public int getNumerodelados() {
        return numerodelados;
    }

    @Override //Sale esto por que pertece a object 
    public String toString() {
        return "\nnumerodelados=" + numerodelados;
    }
   
    //Declaramos el metodo area como abstracto 
    public abstract double area();
    
    
    
}
