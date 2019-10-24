package Herencia;

//Es muy importante la palabra extends por que le decimos que estudiante hereda de persona
public class Estudiante extends Persona{
    
    private int matricula;
    private float notafinal;
    
    
    public Estudiante(String nombre,String apellido,int edad,int matricula,float notafinal){
        
        super(nombre,apellido,edad);//Con la palabra super le decimos que ya esta inicializados los atributos 
        this.matricula= matricula;
         this.notafinal= notafinal;     
    }
    
    
    
    public void mostrarDatos(){
        System.out.println("El nombre es: "+getNombre()+"\nEl Apellido es: "+getApellido()+"\n La edad es: "+getEdad()+"\nLa Matricula es: "+matricula+"\nLa nota final es: "+notafinal);
        
    }
    
    
}
