package for_each;
public class For_each {

    public static void main(String[] args) {
        String[] nombre = {"Alexis","Melina","Miranda"};
        // int[] arreglo = new int[numerodeelementos];
        
        
                  //.length es para tener la longitud precisa 
        for(int i=0;i<nombre.length;i++){
            System.out.println(nombre[i]);
            
        }
        
        
        // este es el chido
        
        for(String i:nombre){
            System.out.println(i);
        }
        //Es como el for de python for i in nombres:
                                // print(i)
        
        
        
        
    }
    
}
