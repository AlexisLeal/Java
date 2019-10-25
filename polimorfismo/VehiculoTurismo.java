package Paquete1;

public class VehiculoTurismo extends Vehiculo{
    
    private int puertas;

    public VehiculoTurismo(String matricula, String marca, String modelo,int puertas) {
        super(matricula, marca, modelo);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }
    
    @Override
    public String mostraDatos(){
        return "\nLa matricula es " + matricula + "\nLa marca es "+ marca + "\nEl modelo es "+modelo + "\nNumeros de puertas "+ puertas;
    }
    
    
    
}
