package Paquete1;

public class Triangulo {
    
    private double alpha;
    private double beta;

    public Triangulo(double alpha, double beta) {
        this.alpha = alpha;
        this.beta = beta;
    }
    
    
    public double getArea(){
     double area = (alpha*Math.sqrt((Math.pow(alpha, 2))-((Math.pow(beta, 2))/4)))/2;
     return area;
        }
    
    public double getPerimetro(){
        
        double perimetro = (2*alpha)+beta;
        
        return perimetro;    
        
    }
    
    
    
    
    public String mostrardatos(){
        
        return "El la base es: "+beta+"\n"+"La altura es :"+alpha+"\n"+"El perimetro es: "+getPerimetro()+"\n"+"El area es:"+getArea()+"\n";
    }
    
    
    
    
    
    
}
