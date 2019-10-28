package Software;

public class Rectangulo extends Poligono{
    private double lado1, lado2;

    public Rectangulo(double lado1, double lado2) {
        super(2); //Le decimos que el numero de lados sera dos 
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    @Override
    public String toString() {
        return "\nRectangulo"+ super.toString()+"\nlado1=" + lado1 + "\nlado2=" + lado2;
    }
    //Lo que dice es que aparte de imprimir lo que estamos diciciendo imprim el metodo de la clase padre 
    
    @Override
    public double area(){
        return lado1*lado2;
    }
    
}
