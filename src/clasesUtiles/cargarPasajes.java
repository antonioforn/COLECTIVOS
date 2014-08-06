
package clasesUtiles;

import entidades.Viaje;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class cargarPasajes {
    public static void main(String[] args){
        EntityManagerFactory emf;
        EntityManager em;
        emf= Persistence.createEntityManagerFactory("colectivos.odb");
        em= emf.createEntityManager();
        Viaje viaje= em.find(Viaje.class, 1);
        int ci =3100101;
        int i;
        
        em.close();
        em.close();
    
    
    
    
    }

}
