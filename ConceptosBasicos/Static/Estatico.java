//Miembros estaticos de una clase 
package Paquete1;

public class Estatico {
    
   // private String frase = "Primera Frase";
    
     private static String frase = "Primera Frase";
     
     /*
     ¨Antes de todo cuando hacemos una instancia de un objeto este mismo hace una copia de los atributos y metodos que no sea static de la clase 
     pero cuando ponemos static ya deja de perternecerle a los objetos y ahora le pertene a la clase por lo tanto TODO cambio que le haga no importa 
     en que objeto sea el utlimo cambio sera el que tome 
     
     Entoces este artributo le pertenece a TODOS LOS OBJETOS y todo cambio le afectara a todos por que ya no le pertenece a cada onjeto indivual 
     
     
     
     
     
     */
     
     
     //Esto es igual que los atributos estiticos ya no le pertenecen a los atributos si no ala la clse y se la llama Estatico.suma(2,5)
     public static int suma(int a,int b){
         
         int suma = a +b;
         
         
         return suma;     
     }
    
    public static void main(String [] args){
        
        
        //NO es necesario instanciar un objeto 
        //Esto fue mera prueba 
        Estatico ob1 = new Estatico();
        Estatico ob2 = new Estatico();
        ob2.frase="Segunda Frase";
        System.out.println(ob1.frase);
        System.out.println(ob2.frase);
        
        //La forma correcta seria a si 
        
        System.out.println(Estatico.frase);
        //El nombre de la clase y luego punto y ya el atributo estatico 
        //Ahora la clase es dueña del atributo no hay necesidad de crear objeto
        
        
        
        System.out.println(Estatico.suma(5, 9));
        
        
        
        
        
        
    }
        
    
    
    
}
