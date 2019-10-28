package Software;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //NOTA: Una clase abstracta no puede ser instancias desde su clase pero si desde sus hijas 
    
    
    static ArrayList<Poligono> poligono = new ArrayList<Poligono>();
    //Creamos un arreglo dinamico de Poligonos 
    //Asi ya no hay que pedr el tamaña del arreglo
    // asi se crea un arreglo dinamico pero no instaciamos ningun objeto
    
    static Scanner sc = new Scanner(System.in);
    // Estatico para que sea de la clase y afuere de main para que sea globla
    public static void main(String [] args){
        
        
        llenarPoligono();
        //LLenar Un poligono
        
        mostrarResultados();
        //Mostrar los datos y el area de cada poligono 
        
          
    }
    
    public static void llenarPoligono(){
        int opcion;
        char respuesta;
        do{
        
        do{
            System.out.println("Digite que poligono desea");
            System.out.println("1.Triangulo");
            System.out.println("2.Rectangulo");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();
        }while(opcion<1 || opcion > 2);  
        
        
        switch(opcion){
            case 1: llenarTriangulo();
                break;
            case 2: llenarRectangulo();//llenar un rentangulo
                break;
        }
            System.out.println("\nDesea introducir otro Poligono(s/n)");
            respuesta= sc.next().charAt(0);
            System.out.println("");    
            
        }while(respuesta =='s' || respuesta =='S');
    }
    
    
    public static void llenarTriangulo(){
        double lado1,lado2,lado3;
        System.out.println("Digite el lado 1 del triangulo ");
        lado1 = sc.nextDouble();
        System.out.println("Digite el lado 2 del triangulo ");
        lado2 = sc.nextDouble();
        System.out.println("Digite el lado 3 del triangulo ");
        lado3 = sc.nextDouble();
        
        Trangulo triangulo = new Trangulo(lado1,lado2,lado3);
        poligono.add(triangulo);
        
    }
    
    public static void llenarRectangulo(){
        double lado1,lado2;
        System.out.println("Digite el lado 1 ");
        lado1 = sc.nextDouble();
        System.out.println("Digite el lado 2 ");
        lado2 = sc.nextDouble();
        
        Rectangulo rectangulo = new Rectangulo(lado1,lado2);
        
        poligono.add(rectangulo);
    }
    
    public static void mostrarResultados(){
        
        for(Poligono poli:poligono){
            System.out.println(poli.toString());//Esto es gracias al polimorfismmo 
            //Va recorre y dependiendo que sea lo imprimme por eso se debe tener este metodo con el mismo nombre 
            System.out.println("Area "+poli.area());
            System.out.println("");
            
            
            
            
        }
        
        
    }
    
}
