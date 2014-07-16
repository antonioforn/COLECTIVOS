

package clasesUtiles;

import entidades.Ciudad;
import entidades.Trayecto;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class cargarTrayectos {
    public static void main(String[] args){
        EntityManagerFactory emf;
        EntityManager em;
        emf= Persistence.createEntityManagerFactory("colectivos.odb");
        em= emf.createEntityManager();
        Trayecto tr;
        int i;
        
         for(i=0; i < 4;i++){
            em.getTransaction().begin();
            tr= new Trayecto();
            em.persist(tr);
            em.getTransaction().commit();

         }
        em.close();
        emf.close();        
    }
}
