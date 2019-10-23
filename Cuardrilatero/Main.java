package Package1;

import java.util.Scanner;
public class Main {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        Cuadrilatero c1;
        float lado1,lado2;
        
        
        System.out.println("Ingrese el pirmer lado");
        lado1 =sc.nextInt();
        
        System.out.println("Ingrese el lado dos");
        lado2=sc.nextInt();
        
        
        if(lado1==lado2){ //Es un cuadrado
            
            c1 = new Cuadrilatero(lado1);
            
            System.out.println("El perimetro del cuadrado es "+c1.getPerimetro());
            System.out.println("El area del cuadrado es "+ c1.getArea());
            
        }
        else{
            c1 = new Cuadrilatero(lado1,lado2);
            System.out.println("El perimetro del rectangulo es "+c1.getPerimetro());
            System.out.println("El area del rectangulo es "+ c1.getArea());
            
            
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
            
    }

    
    
    
    
    
    
}
