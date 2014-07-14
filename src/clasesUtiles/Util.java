

package clasesUtiles;

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
}
