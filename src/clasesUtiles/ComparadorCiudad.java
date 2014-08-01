
package clasesUtiles;

import entidades.Ciudad;
import java.util.Comparator;
import java.util.List;


public class ComparadorCiudad implements Comparator<Ciudad>{

    @Override
    public int compare(Ciudad c1, Ciudad c2) {
        String a= c1.getOrden();
        String b= c2.getOrden();
        if(a.compareTo(b)<0)
        {
            return -1;
        }
        else
        {
            if(a.compareTo(b)>0)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }        
    }
    
}
