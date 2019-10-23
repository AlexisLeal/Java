
public class Persona {
    //Atributos 
    
    String nombre;
    int edad;
    String dni;
    
    
   

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }//Click derecho insert code constructor y seleccionamos los atributos 

    public Persona(String dni) {
        this.dni = dni;
    }// La sobrecarga es cuando hay mas de unn metodo constructor 
    //Siempre cuando haya diferennte numero de parametros o de diferente tipo 
      
    
    //Aqui tenemos sobre carga de metodos 
    public void correr(){
        System.out.println("Yo "+nombre+" de la edad " +edad+" corro un maraton");
    }
    public void correr(int km){
        System.out.println("Yo "+nombre+" de la edad " +edad+" corro un maraton de "+km+"Kilometros");
    }
    
    
    
}
