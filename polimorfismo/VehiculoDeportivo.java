package Paquete1;

public class VehiculoDeportivo extends Vehiculo{
    
     private int cilidrada;

    public VehiculoDeportivo(String matricula, String marca, String modelo,int cilidrada) {
        super(matricula, marca, modelo);
        
        this.cilidrada=cilidrada;
    }

    public int getCilidrada() {
        return cilidrada;
    }
    
    
     @Override
    public String mostraDatos(){
        return "\nLa matricula es " + matricula + "\nLa marca es "+ marca + "\nEl modelo es "+modelo+"\nLa cantidad de cilindros es: "+cilidrada;
    }
   
    
    
    
}
