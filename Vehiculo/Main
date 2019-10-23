package Paquete1;

import java.util.Scanner;


public class Main {
                                        //Le decimmos que le pasamos como parametro un arreglo de la clase Vehiculo 
    public static int indicecocheMbarato(Vehiculo coches[]){
        float precio;
        int indice = 0;
        
        precio = coches[0].getPrecio();
        
        for(int i=1;i<coches.length;i++){
            
            //Es allar el elemento menor de un arreglo en este caso el precio 
            if(coches[i].getPrecio()<precio){
                precio = coches[i].getPrecio();
                indice = i;
            }
            
        }
               
        return indice;     
    }
    
   public static void main(String[] args){
       
       Scanner sc= new Scanner(System.in);
       
       String marca,modelo;
       float precio;
       int numeroVehiculos,indicebarato;
       
       System.out.print("Digite la cantidad de vehiculos ");
       numeroVehiculos = sc.nextInt();
       
       //Creamos los objetos paraa los coches
       Vehiculo coches[] = new Vehiculo[numeroVehiculos]; //Creamos un arreglo de objetos 
       //Normalmente es int[] arreglodenumeros = new int[20];
       
       for(int i=0;i<coches.length;i++){ 
           sc.nextLine(); //Para limpiar el buffer 
           System.out.println("Digite las carecteristicas del coche "+ (i+1)+":");
           System.out.println("Introduzca la marca");
           marca = sc.nextLine();
           System.out.println("Introduzca el modelo");
           modelo = sc.nextLine();
           System.out.println("Introduzca el precio");
           precio = sc.nextFloat();
           
           coches[i] = new Vehiculo(marca,modelo,precio); //Asi lo agrega simultanamente 
            }
       
       indicebarato=indicecocheMbarato(coches);
       //Como el metedo es estatico no es necesario crear objetos
       //Yo lo veo como utili cuando quieres sacar informacion general de todos los objetos 
       
       
       System.out.println("El conche mas barato es: ");
       System.out.println(coches[indicebarato].mostraDatos());
       
       //Te regresa un tipo objeto
       System.out.println(coches[indicebarato]);
       
       
       
       
       
       
       
       
       
       
       
   }
    
}
