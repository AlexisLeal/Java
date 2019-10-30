package Socket;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.IOException;
import javax.swing.*;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Cliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoCliente mimarco=new MarcoCliente();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class MarcoCliente extends JFrame{
	
	public MarcoCliente(){
		
		setBounds(600,300,280,350);
				
		LaminaMarcoCliente milamina=new LaminaMarcoCliente();
		
		add(milamina);
		
		setVisible(true);
		}	
	
}

class LaminaMarcoCliente extends JPanel{
	
	public LaminaMarcoCliente(){
	
		JLabel texto=new JLabel("CLIENTE");
		
		add(texto);
	
		campo1=new JTextField(20);
	
		add(campo1);		
	
		miboton=new JButton("Enviar");
                EnviarTexto mievento = new EnviarTexto();
                
                miboton.addActionListener(mievento);
		
		add(miboton);	
		
	}
        
        
        
    private class EnviarTexto implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            
            try {
                //System.out.println(campo1.getText()); prueba
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    Socket misocket = new Socket("10.100.225.137",9999);//Creamo el puente virtual que va del cliente al servidor 
                    //Creamos  un flujo de datos La ip se debe cambiar 
                    DataOutputStream flujo_salida = new DataOutputStream(misocket.getOutputStream());
            
                    flujo_salida.writeUTF(campo1.getText());
                    
                    flujo_salida.close();
            
            
            
            } catch (IOException ex) {
                Logger.getLogger(LaminaMarcoCliente.class.getName()).log(Level.SEVERE, null, ex);
            
                System.out.println(ex.getMessage()); //Para que nos muestre el error
            }
            
            
            
        
        }
        
        
        
    }
		
		
	private JTextField campo1;
	
	private JButton miboton;
	
}
