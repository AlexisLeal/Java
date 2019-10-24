package Paquete1;
public class Main {
    
    public static void main(String [] args){
        
       // Servivo servivo = new Servivo(); NO SE PUEDE por que la clase es abstracta y no se puede instancias objetos
       
       // Animal ani = new Animal(); tampoco se puede por que es abstracta 
       
       
       Planta planta = new Planta();
       
       planta.alimentarse();
       
       
       
       AnimalCarnivoro carnivoro = new AnimalCarnivoro();
       
       carnivoro.alimentarse();
       
       
       
       AnimalHerbivoro herbivoro = new AnimalHerbivoro();
       
       herbivoro.alimentarse();
             
    }
    
    
    
    
    
}
