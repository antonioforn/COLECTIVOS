

package clasesUtiles;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;


public class ControlLetr extends PlainDocument{
  	private int limit;

        public ControlLetr(int limit) {
            super();
            this.limit = limit;
        }
        
        
        
        @Override
	public void insertString(int offs, String str, AttributeSet a)
			throws BadLocationException {
		String disallowed = "^¿+-_[].,:;!¡\"�$%&/()=?1234567890*/#~<>|";
		for(int i = 0; i < str.length(); i++)
		{
			if(disallowed.indexOf(str.charAt(i)) >= 0)
			{
				return;
			}		
		}	
		if((getLength() + str.length()) <=limit){
                    super.insertString(offs, str, a);
                }
	}  
}
