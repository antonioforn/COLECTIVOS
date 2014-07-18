
package clasesUtiles;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;


public class ControlNum extends PlainDocument {

    private int cantMax;

    public ControlNum(int maxLen) {
        super();
        if(maxLen<=0)
            throw new IllegalArgumentException("Especificar longitud");
        cantMax= maxLen;
    }
    
    @Override
    public void insertString(int offset, String str, AttributeSet attr)
    throws BadLocationException{
         if(str==null||getLength()==cantMax)
             return;
         int totalCant=(getLength() + str.length());
         if(totalCant<=cantMax){
             super.insertString(offset, str.replaceAll("[^0-9]", ""), attr);
             return;
         }
         String nueva= str.substring(0, getLength()-cantMax);
         super.insertString(offset, nueva, attr);
    }
}
