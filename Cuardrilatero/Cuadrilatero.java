package Package1;
public class Cuadrilatero {
    
    private float lado1;
    private float lado2; 
    
    //Metodo construtor 1
    public Cuadrilatero(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    //Metodo constructor 2 (Cuadrado)
    public Cuadrilatero(float lado1) {
        this.lado1 =this.lado2= lado1; //Igualamos ambos lados 
    }
    
    
    public float getPerimetro(){
        
        float resultado = 2*(lado1+lado2);
        return resultado;
        
        
    }
    
    public float getArea(){
        
        
        float area = lado1*lado2;
        
        return area;
        
    }




}



