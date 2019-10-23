package Paquete1;
public class Clase2 {
    
    
    
    
    public static void main(String [] args){
        
        Clase1 objeto1 = new Clase1(); //Instancia 
        
        
        // objeto1 = 10; iba a marcar error por que estaba encapsulado 
        
        objeto1.setedad(10);
        //Gracias a metodo setter podemos ponerle una edad 
        
        objeto1.setNombre("Alexis");
        
        
        
        
        
        System.out.println("La es edad es "+objeto1.Getedad());
        
        System.out.println("Mi nombre es " + objeto1.getNombre());
                                                
    }
    
}
