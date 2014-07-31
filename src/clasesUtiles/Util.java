

package clasesUtiles;

import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
    
    public static String dateToString(Date date){
        DateFormat df;
        String dateString= null;
        
        df= new SimpleDateFormat("dd/MM/yyyy");
        dateString = df.format(date);
        
        return dateString;
    }
    
    public static Date stringToDate(String stringDate) throws ParseException{
        DateFormat df;
        Date date= new Date(new java.util.Date().getTime());
        
        df= new SimpleDateFormat("dd/MM/yyyy");
        date= new Date(df.parse(stringDate).getTime());
        
        return date;
    }
    
    public static java.sql.Date utilToSql(java.util.Date utilDate){
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        return sqlDate;
    }
    
    public static java.util.Date sqlToUtil(java.sql.Date sqlDate){
        java.util.Date utilDate = new java.util.Date(sqlDate.getTime());
        return utilDate;
    }
    
    public static String sqlDateToStr(java.sql.Date sqlDate){
        DateFormat df= new SimpleDateFormat("dd-MMM-yyyy");
        return df.format(sqlDate);
    }
    
}
