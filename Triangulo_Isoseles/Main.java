package Paquete1;

import java.util.Scanner;

public class Main {
    
    public static void main(String [] args){
        double altura,base;
        int Ntriangulos;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de triangulos a trabajar: ");
        Ntriangulos = sc.nextInt();
        
        Triangulo tr[]= new Triangulo[Ntriangulos]; //Creamos N Trinagulos 
        
        
        for(int i =0;i<tr.length;i++){
            sc.nextLine();
            System.out.println("Ingrese la altura para el triangulo "+(1+i) );
            altura = sc.nextDouble();
            System.out.println("Igrese la base para el triangulo "+ (1+i));
            base = sc.nextDouble();
            
            
            
            tr[i]=new Triangulo(altura,base);  
            }
        for (Triangulo tr1 : tr) {
            System.out.println(tr1.mostrardatos());
        }
        
        
        System.out.println("\n"+"El triangulo con mayor suprefie es: "+mayorArea(tr));
        
        
            
          }
    
    public static double mayorArea(Triangulo tr[]){
            double area = tr[0].getArea();
            for(int i =1; i<tr.length;i++){
                
                if(tr[i].getArea()>area){
                    area = tr[i].getArea();
                    
                }
              
                }
              return area;
    }
        
        
    }   


// NOTA: Si te da NaN es por que estas obtiendo la raiz cuadrada de un numero negativo 

