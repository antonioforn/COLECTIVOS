

package clasesUtiles;

import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Util {
    
    public static void limpiarCampos(JPanel jPanel){
       for(int i=0; jPanel.getComponents().length>i;i++){
           
           if(jPanel.getComponents()[i]instanceof JTextField)
           {
               ((JTextField)jPanel.getComponents()[i]).setText("");
           }
           
           else if(jPanel.getComponents()[i] instanceof JPasswordField)
           {
               ((JPasswordField)jPanel.getComponents()[i]).setText("");
           }          
       }
    }
    
    public static void soloLetras(JTextField txt){
        txt.addKeyListener(new KeyAdapter(){
            @Override
            public void keyTyped(KeyEvent e){
                char c= e.getKeyChar();
                if (Character.isDigit(c)){
                    e.consume();
                }
            }
        });
    }
    
    public static void soloNumeros(JTextField txt){
        txt.addKeyListener(new KeyAdapter(){
            @Override
            public void keyTyped(KeyEvent e){
                char c= e.getKeyChar();
                if (!Character.isDigit(c)){
                    
                    e.consume();
                }
            }
        });
    }
    
    public static boolean isNumeric(String cadena){
        try{
            Integer.parseInt(cadena);
            return true;
        } catch(NumberFormatException nfe){
            return false;
        }
    }    
    
}
