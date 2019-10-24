package Herencia;

public class Persona {
    
   //protected Es cuando puede ser accedidos por la misma clase y clases hijas 
    
    //protected String nombre;
    //Tener en cuenta los modicadores de acceso 
    private String nombre;
    private String apellido;
    private int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    
    
    
    
    
    
    
    
}
