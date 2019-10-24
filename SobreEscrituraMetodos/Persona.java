package SobreEscritura;


public class Persona extends Animal{
    
    @Override
    public void comer(){
        System.out.println("Estoy cominedo sentando y con cubiertos");
    }
    
    
    
    
    /*
    La palabra Override se significa que sobre escribimo el metodo cuando creamos un objeto
    de la clase persona vemos que persona hereda de animal y por tanto hereda su metodo comer 
    pero lo estamos sobreescribiendo ya nos saldria el metodo comer de la clase animal si no el 
    de la clase persona 
    
    */
    
    
}
