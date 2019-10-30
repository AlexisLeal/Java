package Socket;

import javax.swing.*;

import java.awt.*;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Servidor  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoServidor mimarco=new MarcoServidor();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
	}	
}

class MarcoServidor extends JFrame implements Runnable{
	
	public MarcoServidor(){
		
		setBounds(1200,300,280,350);				
			
		JPanel milamina= new JPanel();
		
		milamina.setLayout(new BorderLayout());
		
		areatexto=new JTextArea();
		
		milamina.add(areatexto,BorderLayout.CENTER);
		
		add(milamina);
		
		setVisible(true);
                
                Thread mihilo = new Thread(this);//Esto es un Hilo y tiene metodos abstractos 
                
                
                mihilo.start();
		
		}
    @Override
    public void run() { //Todo esto esta dentro de un hilo que se ejecuta en segundo plano 
            try {//ÑLo que permite manejar la aplicacion en primer plano ti tuvieramos menu la pudieramos trabajar si un pedo por que este codigo esta en segunfo plano
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                
                ///System.out.println("Estoy a la escucha");
                
                
                //Con esto abrimos un puerto 
                ServerSocket servidor = new ServerSocket(9999);
                
                while(true){ //Para que se mantenga la conexion abierta 
                Socket miservidor = servidor.accept();//Le decimos que acepte las conexiones que viene en exterior
            
                DataInputStream flujo_entrada = new DataInputStream(miservidor.getInputStream());
            
                String mensaje_texto = flujo_entrada.readUTF();
                
                areatexto.append("\n"+mensaje_texto);
                
                miservidor.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(MarcoServidor.class.getName()).log(Level.SEVERE, null, ex);
            }
    
    }
    
    //Campos de clases siempre deben ir al final o al principio 
    private JTextArea areatexto;
    
}
