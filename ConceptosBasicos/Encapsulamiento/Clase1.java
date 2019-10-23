// Encapsulamiento y metodos accesosres (stter y Gettrs)




package Paquete1;


public class Clase1 {
    
    
    
    private int edad; //Atributo privado la unica forma de acceder es con la misma clase o con un metedo set
    // set = establecer 
    
    private String nombre;
    
                        // atributo con el cual vamos a iniciar la edad
    public void setedad(int edad){
        this.edad = edad;
        // set es establecer estamos estableciendo la edad que me mande el usuaruo 
    }
    
    
    // Mostramos la edad 
    // ponemos int por que la edad es int  
    // get obtener
    public int Getedad(){
        return edad;
    } 

    public String getNombre() { //Click derecho insert code getter y setter 
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    







}




