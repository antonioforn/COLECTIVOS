

package clasesUtiles;

import java.util.Comparator;


public class Comparador implements Comparator<Object[]> {

    @Override
    public int compare(Object[] o1, Object[] o2) {
    String a= o1[2].toString();
    String b= o2[2].toString();
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
