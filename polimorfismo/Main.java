package Paquete1;

public class Main {
    
    
    public static void main(String [] args){
        
        Vehiculo[] misvehiculos = new Vehiculo[4];
        
        //Aqui NO hay POLIFORMISMO
        misvehiculos[0]=new Vehiculo("1581606","Audi","2019");
        
        
        //Aqui SI hacemos POLIMORFISMO
        misvehiculos[1] = new VehiculoTurismo("1581606","TOYOTA","2A15",4);
        
        misvehiculos[2] = new VehiculoDeportivo("aaa45","Nissan","A9",8);
        
        misvehiculos[3] = new VehiculoFurgoneta("ABC","Jeep","A5",80);
        
        
        //Aqui vemos como los objetos actuan de diferente forma depediente como fueron instaciados
        for(Vehiculo v:misvehiculos){
            
            System.out.println(v.mostraDatos()); 
            System.out.println("");
            
        }
        
        
        /*
        El polimorfismo es las muchas formas que toma un objeto depediedo el contexto 
        
        Aqui vemos que el objeto misvehiculo que es un objeto de Vehiculo toma forma de un objeto de VehiculoDeportivo 
        
        Es una relacion tipo herencia, un objeto de la superclase puede 
        almacenar un objeto de cualquier de sus subclases
        
        
        
        */
        
        
        
        
        
        
        
    }
    
}
