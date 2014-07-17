
package clasesUtiles;

import entidades.Chofer;
import entidades.Ciudad;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class cargarChoferes {
    public static void main(String[] args){
        EntityManagerFactory emf;
        EntityManager em;
        emf= Persistence.createEntityManagerFactory("colectivos.odb");
        em= emf.createEntityManager();
        Chofer ch;
        int i;
        String[][] choferes = {{"1100101", "Artemio", "Arrua"},
                              {"1272272", "Benedicto", "Benitez"},
                              {"1303303", "Carlos", "Cardozo"},
                              {"1441414", "Dilberto", "Diaz"}, 
                              {"1500565", "Esteban", "Perez"}, 
                              {"1000606", "Facundo", "Fernandez"}, 
                              {"1700777", "German", "Garcia"}};
        
         for(i=0; i < choferes.length;i++){
            em.getTransaction().begin();
            ch= new Chofer();
            ch.setCi(Integer.parseInt(choferes[i][0]));
            ch.setNombre(choferes[i][1]);
            ch.setApellido(choferes[i][2]);
            em.persist(ch);
            em.getTransaction().commit();
            if(i%10==0 ){
                System.out.println("mod 10");
                em.flush();
                em.clear();
            }
         }
        em.close();
        emf.close();
        
    }    
}
